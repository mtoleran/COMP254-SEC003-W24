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


/**
 * Code for end-of-chapter exercises on asymptotics.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Exercises {

  /** Returns the sum of the integers in given array. */
  public static int example1(int[] arr) {
    int n = arr.length, total = 0; //O(1) - simple expressions always run in a constant time
    for (int j=0; j < n; j++) // O(n) - loop will run n times
      total += arr[j]; //constant running time
    return total;
    //T(n) = O(1) + O(n)
    //T(n) = O(n) - running time of example1
  }

  /** Returns the sum of the integers with even index in given array. */
  public static int example2(int[] arr) {
    int n = arr.length, total = 0; //O(1) - simple expressions always run in a constant time
    for (int j=0; j < n; j += 2) // O(n) - loop will run n - 1 times
      total += arr[j]; //constant running time
    return total;
    //T(n) = O(1) + O(n)
    //T(n) = O(n) - running time of example2
  }

  /** Returns the sum of the prefix sums of given array. */
  public static int example3(int[] arr) {
    int n = arr.length, total = 0; //O(1) - simple expressions always run in a constant time
    for (int j=0; j < n; j++) // O(n) - loop will run n - 1 times
      for (int k=0; k <= j; k++) // O(n) - loop will run j times
        total += arr[j]; // simple statement will run n x n times
    return total;
    //T(n) = O(n^2) - running time of example3
  }

  /** Returns the sum of the prefix sums of given array. */
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0; //O(1) - simple expressions always run in a constant time
    for (int j=0; j < n; j++) { // O(n) - loop will run n - 1 times
      prefix += arr[j];
      total += prefix; // simple statements in for loop will have constant running time
    }
    return total;
    //T(n) = O(n) - running time of example4
  }

  /** Returns the number of times second array stores sum of prefix sums from first. */
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0;
    for (int i=0; i < n; i++) {     // O(n) - loop will run n - 1 times
      int total = 0;
      for (int j=0; j < n; j++)     // O(n) - loop will run n - 1 times
        for (int k=0; k <= j; k++)  // O(n) - loop will run j times
          total += first[k]; // simple statement will run n x n x n times
      if (second[i] == total) count++;
    }
    return count;
    //T(n) = O(n^3) - running time of example5
  }

}
