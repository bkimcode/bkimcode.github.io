/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominosearch;

/**
 * Represents a domino which has two values on its face
 *
 * @author Catie Baker 
 *
 */
public class Domino {

    private int top;
    private int bottom;
    private String orient;
   

    /**
     * Creates a domino that has the two values on its face
     *
     * @param v1 the first value on the domino
     * @param v2 the second value on the domino
     */
    public Domino(int v1, int v2, String x) {
        this.top = Math.min(v1, v2);
        this.bottom = Math.max(v1, v2);
        this.orient = x;

    }

  
    public String toString(){
       String i = Integer.toString(this.top);
       String j = Integer.toString(this.bottom);
       String k = this.orient;
       String l = i + " " + j + " " + k + " ";
       return l;
    }
    
    /**
     * Compares this domino to the specified object. The result is true if and
     * only if the argument is not null, is a Domino object, and has the same
     * two values on its face
     *
     * @return returns true if the given object reprsents the same domino value,
     * false otherwise.
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return (this.top == ((Domino) other).top && this.bottom == ((Domino) other).bottom );
    }

    public String orientation(){
        return this.orient;
    }
    
    
    /**
     * Returns a hash code of this domino. The hash code is computed as
     * 10*(smaller value)+the larger value
     *
     * @returns a hash code value for this object
     */
    public int hashCode() {
        return this.top * 10 + this.bottom;
    }

}
