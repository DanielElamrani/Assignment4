package assignment4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Assignment4 {

    
    public static void main(String[] args) throws IOException {
        
        //passing in file with command line arguments, if none are passed, program exits
        if(args.length <= 0){
            System.exit(1);
        }
            
        //Create file and its pathway
        String fileName = args[0];
            

        //Create file 
        File inputData = new File(fileName);
       
        
        //create scanner
        Scanner sc = new Scanner(inputData);
        
        
        //String that will hold the value from each line of our data.
        String line="";
        
        
        //This is the 2D array we will be putting all of our input data into.
        String[][] allDataArr = new String[9742][3]; 
        
        //this will be used in our for loop to place the data into the correct array indices
        int allDataArrRowIndex = 0;
        
        //While loop to read in our data and place into our 2D array
        while (sc.hasNextLine()){
            
            //This String holds a line of our data
            line = sc.nextLine();
            
            
            //This String array will take our line and split it up by the delimiter "," and place everything into between the commas into an array index
            String[] results = line.split(",");
            
            //This for loop takes our String array which has 3 elements, as there are 3 pieces of data in each line separated by commas,
            //and places them into our 2D array in a grid like fashion.
            for (int i = 0; i<3; i++){
                
                allDataArr[allDataArrRowIndex][i] = results[i];
                
            }
            
            //We use this variable to increment the row as we know we have 3 columns of data and only the row will be changing continusouly for each iteration.
            allDataArrRowIndex++;
    
        }//Exit while loop
        
        
        //Creating an arraylist of MovieObjects
        ArrayList<MovieObject> movieList = new ArrayList<MovieObject>();
        
        //This for loop goes through the 2D array and creates movie objects and adds them to the above arraylist called movieList
        for (int i = 0; i<allDataArr.length;i++){
         
          String year = "0000";
          String genre = "emptyGenre";
          String movie = "emptyName";
          String movieAndYear = allDataArr[i][1];
          
           //this loops for each character in each line of data
            for(int a = 1; a<movieAndYear.length(); a++){
                
                //I look for a ( and then I look for a number after the parantheses. This tell me that I've hit where the year is located. Once I know that I can extract what I want
                if (movieAndYear.charAt(a)=='(' && Character.isDigit(movieAndYear.charAt(a+1))){
                    
                    //now i have the year and I have the movie title split up
                    year = movieAndYear.substring(a+1, a+5);
                    movie = movieAndYear.substring(0, a-1);
                    
                    
                }
            
            }
            
          //The genre is just in the 3rd column of our 2D array so we don't have to do anything other than set our genre variable equal to the 3rd column of our 2D array.
          genre = allDataArr[i][2];
          
          //create new MovieObject
          MovieObject addingMovie = new MovieObject(movie,year,genre);
          
          //Add the movie object to our arraylist
          movieList.add(addingMovie);
        }
        
        //I call my print report method in the movieObject class.
        MovieObject.printReport(movieList);
        
        
    }

    
}
