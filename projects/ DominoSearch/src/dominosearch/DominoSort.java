/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominosearch;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author benjaminkim
 */
public class DominoSort {

//The grid of numbers 0 through n that represents the puzzle
    private int[][] grid;
//Grid of 0's for placement checking
    private int[][] placeGrid;
//The solution for given domino puzzle
    private ArrayList<Domino> solution;
//total number of rows
    private static final int NUM_ROWS = 7;
//total number of collumns
    private static final int NUM_COLL = 8;
//current domino
    private Domino currentDom;

    /**
     * creates grid to be solved given text file
     *
     * @param fileName, name of text file to be used.
     */
    public DominoSort(String fileName) throws java.io.FileNotFoundException {
        this.grid = new int[7][8];
        this.placeGrid = new int[7][8];
        this.solution = new ArrayList<>();
        Scanner br = new Scanner(new File(fileName));
        String line = br.nextLine();

        int r = 0;
        int c = 0;

        while (br.hasNextInt()) {

            String[] row = line.split("\\s+");

            for (String s : row) {
                this.grid[r][c] = Integer.parseInt(s);
                c++;
            }
            line = br.nextLine();
            r++;
            c = 0;

        }
        String[] row = line.split("\\s+");
        for (String s : row) {
            this.grid[r][c] = Integer.parseInt(s);
            c++;
        }

        br.close();

    }

    /**
     * Prints out solution array which shows the placements of the domino
     *
     * @return String representation of solution array.
     */
    public String printDomTest() {
        String kek = "";
        for (Domino d : this.solution) {
            kek = kek + "||" + d.toString();
        }
        return kek;
    }

    /**
     * prints string representation of value grid.
     */
    public void printGrid() {
        for (int r = 0; r < this.grid.length; r++) {
            System.out.println("");
            for (int c = 0; c < this.grid[r].length; c++) {
                System.out.print(this.grid[r][c] + " ");
            }
        }
        System.out.println("");
    }

    /**
     *
     */
    public boolean solvePuzzle() {
        return this.solvePuzzle(0, 0);
    }

    private boolean solvePuzzle(int row, int col) {
        if (row == NUM_ROWS) {// HAVE FILLED ALL THE ROWS
            System.out.println(this.solution.size());//should return 28 but returns 48
            //for(int i = 0 ; i <= solution.size(); i++){  //Tester
            //  System.out.println(solution.get(i).toString());
            //}
            return true;
        } else if (col == NUM_COLL) {             // HAVE FILLED THIS ROW, SO WRAP
            return this.solvePuzzle(row + 1, 0);
        } else if (this.placeGrid[row][col] != 0) {     // SPOT IS ALREADY FILLED
            return this.solvePuzzle(row, col + 1);
        } else {                                   // NEED TO FILL SPOT            
            //System.out.println(this.solution.size());
            String j;
            j = printDomTest(); //will print out string representation of solution array after each run so you can view progress of backtracking.
            System.out.println(j + "--");
            System.out.println(row); //should point to current row
            System.out.println(col); // shoult point to current collumn
            //System.out.println(col + 1);
            //System.out.println(this.solution.size()); //number of unique dominos 

            if (this.isH(row, col)) {
                this.currentDom = new Domino(this.grid[row][col], this.grid[row][col + 1], "H");
                if (uniquePair()) {
                    this.solution.add(this.currentDom);
                    this.placeGrid[row][col] = 1;
                    this.placeGrid[row][col + 1] = 1;
                }
                else{
                    //this.currentDom = new Domino(this.grid[row][col], this.grid[row + 1][col], "V");
                    return false;
                }
                    if (this.solvePuzzle(row, col + 1)) {
                        return true;
                    }
                

                if (this.solution.size() > 1) {
                    this.placeGrid[row][col] = 0;
                    this.placeGrid[row][col + 1] = 0;
                    this.solution.remove(this.solution.size() - 1);

                } else if (this.solution.size() == 1) {
                    this.placeGrid[row][col] = 0;
                    this.placeGrid[row][col + 1] = 0;
                    this.solution.remove(0);
                }
            }

            //this.placeGrid[row][col + 1] = 0;
            //this.currentDom = new Domino(0,0,"V");
            if (this.isV(row, col)) { // if true, place vertical piece
                this.currentDom = new Domino(this.grid[row][col], this.grid[row + 1][col], "V");
                if (uniquePair()) {
                    this.solution.add(this.currentDom);
                    this.placeGrid[row][col] = 2;
                    this.placeGrid[row + 1][col] = 2;
                }else{
                    
                    return false;
                }
                    if (this.solvePuzzle(row, col + 1)) {
                        return true;
                    }
                
                if (this.solution.size() > 1) {
                    this.placeGrid[row][col] = 0;
                    this.placeGrid[row + 1][col] = 0;
                    this.solution.remove(this.solution.size() - 1);
                } else if (this.solution.size() == 1) {
                    this.placeGrid[row][col] = 0;
                    this.placeGrid[row + 1][col] = 0;
                    this.solution.remove(0);
                }
            }

            //String j;
            //j = printDomTest(); //will print out string representation of solution array after each run so you can view progress of backtracking.
            //System.out.println(j + "XXXXXXXXXXXXXXXXXXXXXXXX"); // shows everytime domino is being removed
            return false;
        }

    }

    private boolean isV(int row, int col) { // are constraints met
        return this.markV(row, col);

    }

    private boolean isH(int row, int col) { // are constraints met
        return this.markH(row, col);

    }

    private boolean markV(int row, int col) { //constraints for vertical

        for (int r = row; r <= row + 1; r++) {
            if (placeGrid[r][col] != 0 && row + 1 != NUM_ROWS) {
                return false;
            }
        }
        return true;

    }

    private boolean markH(int row, int col) { //constraints for horizontal
        // if (row == 0 && col != NUM_COLL - 1){
        // return true;
        //}
        if (col + 1 == NUM_COLL) {
            return false;
        }
        for (int c = col; c <= col + 1; c++) {
            if (placeGrid[row][c] != 0) {
                return false;
            }

        }

        return true;

    }

    private boolean uniquePair() { // checks if found domino already exist/ is duplicate

        if (this.solution.isEmpty()) {
            //System.out.println(this.solution.size());
            return true;
        }

        for (int i = 0; i <= this.solution.size() - 1; i++) {
            if (this.currentDom.equals(this.solution.get(i))) {
                //this.solution.remove(i);
                //printDomTest();
                return false;

            }
            //printDomTest();
            //return false;
        }
        return true;
    }
}
