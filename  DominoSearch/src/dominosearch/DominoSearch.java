/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominosearch;

/**
 *
 * @author benjaminkim
 */
import java.io.*;
import java.util.Scanner;

public class DominoSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // String line;

        //System.out.println(new File(".").getAbsolutePath());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name: "); //test.txt
        String fileName = input.next();

        DominoSort dom = new DominoSort(fileName);
        //dom.printGrid(); // to make sure grid is stored properly
        dom.solvePuzzle();
        //dom.testDomino();
        
        
        
        //dom.solvePuzzle(6);
        
    }

}
