/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.ArrayList;

/**
 * Demonstration of algorithms for computing the prefix averages of an array.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class PrefixAverage {

  /** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
  public static double[] prefixAverage1(double[] x) {
    int n = x.length;
    double[] a = new double[n];    // filled with zeros by default
    for (int j=0; j < n; j++) {
      double total = 0;            // begin computing x[0] + ... + x[j]
      for (int i=0; i <= j; i++)
        total += x[i];
      a[j] = total / (j+1);        // record the average
    }
    return a;
  }

  /** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
  public static double[] prefixAverage2(double[] x) {
    int n = x.length;
    double[] a = new double[n];    // filled with zeros by default
    double total = 0;              // compute prefix sum as x[0] + x[1] + ...
    for (int j=0; j < n; j++) {
      total += x[j];               // update prefix sum to include x[j]
      a[j] = total / (j+1);        // compute average based on current sum
    }
    return a;
  }

  public static void main(String[] args) {
    // ArrayList to store arrays
    ArrayList<double[]> arrays = new ArrayList<>();
    // 5 arrays that store varying numbers of doubles
    double[] arrayOf100k = new double[100000];
    double[] arrayOf200k = new double[200000];
    double[] arrayOf400k = new double[400000];
    double[] arrayOf800k = new double[800000];
    double[] arrayOf1mplus = new double[1600000];

    // Populate arrays
    for (int i = 0; i < 100000; i++) {
      arrayOf100k[i] = Math.pow(i, 2);
    }
    for (int i = 0; i < 200000; i++) {
      arrayOf200k[i] = Math.pow(i, 2);
    }
    for (int i = 0; i < 400000; i++) {
      arrayOf400k[i] = Math.pow(i, 2);
    }
    for (int i = 0; i < 800000; i++) {
      arrayOf800k[i] = Math.pow(i, 2);
    }
    for (int i = 0; i < 1600000; i++) {
      arrayOf1mplus[i] = Math.pow(i, 2);
    }

    // Add the arrays to the ArrayList
    arrays.add(arrayOf100k);
    arrays.add(arrayOf200k);
    arrays.add(arrayOf400k);
    arrays.add(arrayOf800k);
    arrays.add(arrayOf1mplus);

    // Testing prefixAverage2
    System.out.println("Testing prefixAverage2...");
    for (int t=0; t < 5; t++) {
      long startTime = System.currentTimeMillis();
      double[] currentArray = arrays.get(t);
      prefixAverage2(currentArray);
      long endTime = System.currentTimeMillis();
      long elapsed = endTime - startTime;
      System.out.println("Array of " + currentArray.length + " elements took " + elapsed + " milliseconds");
    }

    // Testing prefixAverage1
    System.out.println("\nTesting prefixAverage1...");
    for (int t=0; t < 5; t++) {
      long startTime = System.currentTimeMillis();
      double[] currentArray = arrays.get(t);
      prefixAverage1(currentArray);
      long endTime = System.currentTimeMillis();
      long elapsed = endTime - startTime;
      System.out.println("Array of " + currentArray.length + " took " + elapsed + " milliseconds");
    }

  }
}
