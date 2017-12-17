/******************************************************************************
 *  Compilation:  javac Percolation.java
 *  Execution:    java Percolation
 *  Dependencies: WeightedQuickUnionUF.java
 *
 *  This program implements the WeightedQuickUnionUF class
 *  into an api that is used for PercolationVisualizer and
 *  InteractivePecolationVisualizer
 *
 *
 ******************************************************************************/

/**
 * WeightedQuickUnionUF(int n)
 * Initializes an empty union–find data structure with n sites 0 through n-1.
 */


/**
 * WeightedQuickUnionUF methods
 *
 *
 *
 * boolean connected(int p, int q)
 * Returns true if the the two sites are in the same component.
 *
 * int	count()
 * Returns the number of components.
 *
 * int	find(int p)
 * Returns the component identifier for the component containing site p.
 *
 * static void	main(String[] args)
 * Reads in a sequence of pairs of integers (between 0 and n-1) from standard input, where each integer represents some object; if the sites are in different components, merge the two components and print the pair to standard output.
 *
 * void	union(int p, int q)
 * Merges the component containing site p with the the component containing site q.
 */

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    /**
     * Needs the following:
     *    Constructor(n)
     *    open(int, int)
     *    isOpen(int, int) return boolean
     *    isFull(int, int) return boolean
     *    percolates() return boolean
     *
     */

    private int array;

    public static void main(String args[]){
        Percolation perc = new Percolation(0);
    }


    Percolation(int n){
        array = n;
    }

    WeightedQuickUnionUF uf = new WeightedQuickUnionUF(array);

    boolean open(int a, int b){
        return true;
    }

    boolean isOpen(int c, int d){
        return uf.connected(c, d);
    }

    boolean percolates(){
        return true;
    }

    boolean isFull(int k, int j){
        return true;
    }
}