//Marlenne Salcido
//CS1400
//Assignment 5
//November 3, 2023

public class ArrayClassDemo {
    public static void main(String[] args) 
    {
        double [][] arr = {{3.5, 6.2, 5.3},{2.0, 4.0, 5.5},{7.0, 2.0, 1.5},{2.3, 3.7}};
        ArrayClass a1 = new ArrayClass();
        System.out.println("The sum of every value in this 2D array is: " + a1.getTotal(arr));
        System.out.println("The average of every value in this 2D array is: " + a1.getAverage(arr));
        System.out.println("The sum of every value in the first row of this 2D array is: " + a1.getRowTotal(arr, 0));
        System.out.println("The sum of every value in the second row of this 2D array is: " + a1.getRowTotal(arr, 1));
        System.out.println("The sum of every value in the third row of this 2D array is: " + a1.getRowTotal(arr, 2));
        System.out.println("The sum of every value in the fourth row of this 2D array is: " + a1.getRowTotal(arr, 3));
        System.out.println("The sum of every value in the first column of this 2D array is: " + a1.getColumnTotal(arr, 0));
        System.out.println("The sum of every value in the second column of this 2D array is: " + a1.getColumnTotal(arr, 1));
        System.out.println("The sum of every value in the third column of this 2D array is: " + a1.getColumnTotal(arr, 2));
        System.out.println("Separate Sums and values");
        System.out.println("The highest value in the first row of this 2D array is: " + a1.getHighestInRow(arr, 0));
        System.out.println("The highest value in the second row of this 2D array is: " + a1.getHighestInRow(arr, 1));
        System.out.println("The highest value in the third row of this 2D array is: " + a1.getHighestInRow(arr, 2));
        System.out.println("The highest value in the fourth row of this 2D array is: " + a1.getHighestInRow(arr, 3));
        System.out.println("The lowest value in the first row of this 2D array is: " + a1.getLowestInRow(arr, 0));
        System.out.println("The lowest value in the second row of this 2D array is: " + a1.getLowestInRow(arr, 1));
        System.out.println("The lowest value in the third row of this 2D array is: " + a1.getLowestInRow(arr, 2));
        System.out.println("The lowest value in the fourth row of this 2D array is: " + a1.getLowestInRow(arr, 3));
        

    }
}

