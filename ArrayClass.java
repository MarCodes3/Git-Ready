//Marlenne Salcido
//CS1400
//Assignment 5
//November 3, 2023

public class ArrayClass {
    
    //this method should accept a two-dimensional array as 
    //its argument and return
    //the total of all the values in the array.
    public double getTotal(double[][] twoD)
    {
        double arrayTotal = 0;

        for(int row = 0; row< twoD.length; row++)
        {
            for(int col = 0; col < twoD[row].length; col++ )
            {
                arrayTotal += twoD[row][col]; 
            }
        }

        return arrayTotal;
    }
    //This method should accept a two-dimensional array as its argument and
    //return the average of all the values in the array.
    public double getAverage(double[][] twoD)
    {
        double arrayTotal = 0;
        double valueTotal = 0; 

        for(int row = 0; row< twoD.length; row++)
        {
            for(int col = 0; col < twoD[row].length; col++ )
            {
                arrayTotal += twoD[row][col]; 
                valueTotal++;
            }
        }

        return arrayTotal/valueTotal;
    }
    
    //This method should accept a two-dimensional array as its first argument
    //and an integer as its second argument. The second argument should be 
    //the subscript of a row in the array. The method should return the 
    //total of the values in the specified row.
    public double getRowTotal(double[][] twoD, int row)
    {
        double rowTotal = 0;

        for(int col = 0; col < twoD[row].length; col++ )
        {
            rowTotal += twoD[row][col]; 
        }

        return rowTotal;
    }
    
    //This method should accept a two-dimensional array as its first argument
    //and an integer as its second argument. The second argument should be 
    //the subscript of a column in the array. The method should return the 
    //total of the values in the specified column.
    public double getColumnTotal(double[][] twoD, int col)
    {
        double colTotal = 0;

        for(int row = 0; row < twoD.length; row++ )
        {
            for(int c = 0; c < twoD[row].length; c++ )
            {
                if(c == col)
                {
                colTotal += twoD[row][col];
                }
            }
            
       
            
        }

        return colTotal;  
    }

    //This method should accept a two-dimensional array as its first
    //argument and an integer as its second argument. The second argument 
    //should be the subscript of a row in the array. The method should 
    //return the highest value in the specified row of the array.
    public double getHighestInRow(double[][] twoD, int row)
    {
        double highest = twoD[row][0];

        for(int col = 1; col < twoD[row].length; col++ )
        {
            if(twoD[row][col] > highest)
            {
                highest = twoD[row][col];
            } 
        }

        return highest;
    }

    //This method should accept a two-dimensional array as its first
    //argument and an integer as its second argument. The second argument should be the
    //subscript of a row in the array. The method should return the lowest value 
    //in the specified row of the array
    public double getLowestInRow(double[][] twoD, int row) 
    {
        double lowest = twoD[row][0];

        for(int col = 1; col < twoD[row].length; col++ )
        {
            if(twoD[row][col] < lowest)
            {
                lowest = twoD[row][col];
            } 
        }

        return lowest;
    }
    }

    
