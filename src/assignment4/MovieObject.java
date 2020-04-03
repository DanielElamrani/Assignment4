
package assignment4;

import java.util.*;

public class MovieObject {
//instance variables for movie objects
protected    String movieName;
protected    String year;
protected    String genre;
    
    
    
    //constructor
    public MovieObject(String movie, String releaseYear, String genre){
        
        this.movieName = movie;
        this.year = releaseYear;
        this.genre = genre;
        
    }
    
    
    public static void printReport(ArrayList<MovieObject> arrList){
        //We make counters for every genre
        int action = 0;
        int comedy = 0;
        int crime = 0;
        int animation = 0;
        int drama = 0;
        int scifi = 0;
        int documentary = 0;
        int mystery = 0;
        int horror = 0;
        int children = 0;
        int romance = 0;
        int thriller = 0;
        int adventure = 0;
        int fantasy = 0;
        int war = 0;
        
        //counters for the past 5 years
        int action5 = 0;
        int comedy5 = 0;
        int crime5 = 0;
        int animation5 = 0;
        int drama5 = 0;
        int scifi5 = 0;
        int documentary5 = 0;
        int mystery5 = 0;
        int horror5 = 0;
        int children5 = 0;
        int romance5 = 0;
        int thriller5 = 0;
        int adventure5 = 0;
        int fantasy5 = 0;
        int war5 = 0;
        
        
        //counters for the 1900's
        int action1900 = 0;
        int comedy1900 = 0;
        int crime1900 = 0;
        int animation1900 = 0;
        int drama1900 = 0;
        int scifi1900 = 0;
        int documentary1900 = 0;
        int mystery1900 = 0;
        int horror1900 = 0;
        int children1900 = 0;
        int romance1900 = 0;
        int thriller1900 = 0;
        int adventure1900 = 0;
        int fantasy1900 = 0;
        int war1900 = 0;
        
        //counter for the 1910's
        int action1910 = 0;
        int comedy1910 = 0;
        int crime1910 = 0;
        int animation1910 = 0;
        int drama1910 = 0;
        int scifi1910 = 0;
        int documentary1910 = 0;
        int mystery1910 = 0;
        int horror1910 = 0;
        int children1910 = 0;
        int romance1910 = 0;
        int thriller1910 = 0;
        int adventure1910 = 0;
        int fantasy1910 = 0;
        int war1910 = 0;
        
        
        
        //counter for the 1920's etc etc
        int action1920 = 0;
        int comedy1920 = 0;
        int crime1920 = 0;
        int animation1920 = 0;
        int drama1920 = 0;
        int scifi1920 = 0;
        int documentary1920 = 0;
        int mystery1920 = 0;
        int horror1920 = 0;
        int children1920 = 0;
        int romance1920 = 0;
        int thriller1920 = 0;
        int adventure1920 = 0;
        int fantasy1920 = 0;
        int war1920 = 0;
        
        
        
        
        int action1930 = 0;
        int comedy1930 = 0;
        int crime1930 = 0;
        int animation1930 = 0;
        int drama1930 = 0;
        int scifi1930 = 0;
        int documentary1930 = 0;
        int mystery1930 = 0;
        int horror1930 = 0;
        int children1930 = 0;
        int romance1930 = 0;
        int thriller1930 = 0;
        int adventure1930 = 0;
        int fantasy1930 = 0;
        int war1930 = 0;
        
        
        
        
        int action1940 = 0;
        int comedy1940 = 0;
        int crime1940 = 0;
        int animation1940 = 0;
        int drama1940 = 0;
        int scifi1940 = 0;
        int documentary1940 = 0;
        int mystery1940 = 0;
        int horror1940 = 0;
        int children1940 = 0;
        int romance1940 = 0;
        int thriller1940 = 0;
        int adventure1940 = 0;
        int fantasy1940 = 0;
        int war1940 = 0;
        
        
        
        
        int action1950 = 0;
        int comedy1950 = 0;
        int crime1950 = 0;
        int animation1950 = 0;
        int drama1950 = 0;
        int scifi1950 = 0;
        int documentary1950 = 0;
        int mystery1950 = 0;
        int horror1950 = 0;
        int children1950 = 0;
        int romance1950 = 0;
        int thriller1950 = 0;
        int adventure1950 = 0;
        int fantasy1950 = 0;
        int war1950 = 0;
        
        
        
        
        int action1960 = 0;
        int comedy1960 = 0;
        int crime1960 = 0;
        int animation1960 = 0;
        int drama1960 = 0;
        int scifi1960 = 0;
        int documentary1960 = 0;
        int mystery1960= 0;
        int horror1960 = 0;
        int children1960 = 0;
        int romance1960 = 0;
        int thriller1960 = 0;
        int adventure1960 = 0;
        int fantasy1960 = 0;
        int war1960 = 0;
        
        
        
        
        int action1970 = 0;
        int comedy1970 = 0;
        int crime1970 = 0;
        int animation1970 = 0;
        int drama1970 = 0;
        int scifi1970 = 0;
        int documentary1970 = 0;
        int mystery1970 = 0;
        int horror1970 = 0;
        int children1970 = 0;
        int romance1970 = 0;
        int thriller1970 = 0;
        int adventure1970 = 0;
        int fantasy1970 = 0;
        int war1970 = 0;
        
        
        
        
        int action1980 = 0;
        int comedy1980 = 0;
        int crime1980 = 0;
        int animation1980 = 0;
        int drama1980 = 0;
        int scifi1980 = 0;
        int documentary1980 = 0;
        int mystery1980 = 0;
        int horror1980 = 0;
        int children1980 = 0;
        int romance1980 = 0;
        int thriller1980 = 0;
        int adventure1980 = 0;
        int fantasy1980 = 0;
        int war1980 = 0;
        
        
        
        int action1990 = 0;
        int comedy1990 = 0;
        int crime1990 = 0;
        int animation1990 = 0;
        int drama1990 = 0;
        int scifi1990 = 0;
        int documentary1990 = 0;
        int mystery1990 = 0;
        int horror1990 = 0;
        int children1990= 0;
        int romance1990 = 0;
        int thriller1990 = 0;
        int adventure1990 = 0;
        int fantasy1990 = 0;
        int war1990 = 0;
        
        
        
        
        int action2000 = 0;
        int comedy2000 = 0;
        int crime2000 = 0;
        int animation2000 = 0;
        int drama2000 = 0;
        int scifi2000 = 0;
        int documentary2000 = 0;
        int mystery2000 = 0;
        int horror2000 = 0;
        int children2000 = 0;
        int romance2000 = 0;
        int thriller2000 = 0;
        int adventure2000 = 0;
        int fantasy2000 = 0;
        int war2000 = 0;
        
        
        
        int action2010 = 0;
        int comedy2010 = 0;
        int crime2010 = 0;
        int animation2010 = 0;
        int drama2010 = 0;
        int scifi2010 = 0;
        int documentary2010 = 0;
        int mystery2010 = 0;
        int horror2010 = 0;
        int children2010 = 0;
        int romance2010 = 0;
        int thriller2010 = 0;
        int adventure2010 = 0;
        int fantasy2010 = 0;
        int war2010 = 0;
   
        
        //iterates through our arrayList
        for (int i = 0; i<arrList.size(); i++){
            
            //Skips the movie if the genre is (no genres listed)
            if (arrList.get(i).genre.charAt(0) == '('){
                
                continue;
            }
            
            //we split the genre string up with the delimiter "|"
            String[] splitGenre = arrList.get(i).genre.split("\\|");
            
            String decade = arrList.get(i).year.substring(0,3);
            
            //iterates through the split up genres
            for (int a = 0; a<splitGenre.length; a++){
                
                //Here we test each genre through a series of if statements. Everything below is the same for each genre.
                
                //this is the basic if action then increase counter
                if(splitGenre[a].equals("Action")){
                    
                    action++;
                    
                    //tests if action in the last 5 years
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        action5++;
                        
                    }
                    
                    //tests if action in each decade
                    
                    if (decade.equals("190")){
                        action1900++;
                    }
                    if (decade.equals("191")){
                        action1910++;
                    }
                    if (decade.equals("192")){
                        action1920++;
                    }
                    if (decade.equals("193")){
                        action1930++;
                    }
                    if (decade.equals("194")){
                        action1940++;
                    }
                    if (decade.equals("195")){
                        action1950++;
                    }
                    if (decade.equals("196")){
                        action1960++;
                    }
                    if (decade.equals("197")){
                        action1970++;
                    }
                    if (decade.equals("198")){
                        action1980++;
                    }
                    if (decade.equals("199")){
                        action1990++;
                    }
                    if (decade.equals("200")){
                        action2000++;
                    }
                    if (decade.equals("201")){
                        action2010++;
                    }
                }
                
                
                
                
                
                if(splitGenre[a].equals("Comedy")){
                    
                    comedy++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        comedy5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        comedy1900++;
                    }
                    if (decade.equals("191")){
                        comedy1910++;
                    }
                    if (decade.equals("192")){
                        comedy1920++;
                    }
                    if (decade.equals("193")){
                        comedy1930++;
                    }
                    if (decade.equals("194")){
                        comedy1940++;
                    }
                    if (decade.equals("195")){
                        comedy1950++;
                    }
                    if (decade.equals("196")){
                        comedy1960++;
                    }
                    if (decade.equals("197")){
                        comedy1970++;
                    }
                    if (decade.equals("198")){
                        comedy1980++;
                    }
                    if (decade.equals("199")){
                        comedy1990++;
                    }
                    if (decade.equals("200")){
                        comedy2000++;
                    }
                    if (decade.equals("201")){
                        comedy2010++;
                    }
                    
                    

                }         
                if(splitGenre[a].equals("Crime")){
                    
                    crime++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        crime5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        crime1900++;
                    }
                    if (decade.equals("191")){
                        crime1910++;
                    }
                    if (decade.equals("192")){
                        crime1920++;
                    }
                    if (decade.equals("193")){
                        crime1930++;
                    }
                    if (decade.equals("194")){
                        crime1940++;
                    }
                    if (decade.equals("195")){
                        crime1950++;
                    }
                    if (decade.equals("196")){
                        crime1960++;
                    }
                    if (decade.equals("197")){
                        crime1970++;
                    }
                    if (decade.equals("198")){
                        crime1980++;
                    }
                    if (decade.equals("199")){
                        crime1990++;
                    }
                    if (decade.equals("200")){
                        crime2000++;
                    }
                    if (decade.equals("201")){
                        crime2010++;
                    }

                }          
                if(splitGenre[a].equals("Animation")){
                    
                    animation++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        animation5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        animation1900++;
                    }
                    if (decade.equals("191")){
                        animation1910++;
                    }
                    if (decade.equals("192")){
                        animation1920++;
                    }
                    if (decade.equals("193")){
                        animation1930++;
                    }
                    if (decade.equals("194")){
                        animation1940++;
                    }
                    if (decade.equals("195")){
                        animation1950++;
                    }
                    if (decade.equals("196")){
                        animation1960++;
                    }
                    if (decade.equals("197")){
                        animation1970++;
                    }
                    if (decade.equals("198")){
                        animation1980++;
                    }
                    if (decade.equals("199")){
                        animation1990++;
                    }
                    if (decade.equals("200")){
                        animation2000++;
                    }
                    if (decade.equals("201")){
                        animation2010++;
                    }

                }        
                if(splitGenre[a].equals("Drama")){
                    
                    drama++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        drama5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        drama1900++;
                    }
                    if (decade.equals("191")){
                        drama1910++;
                    }
                    if (decade.equals("192")){
                        drama1920++;
                    }
                    if (decade.equals("193")){
                        drama1930++;
                    }
                    if (decade.equals("194")){
                        drama1940++;
                    }
                    if (decade.equals("195")){
                        drama1950++;
                    }
                    if (decade.equals("196")){
                        drama1960++;
                    }
                    if (decade.equals("197")){
                        drama1970++;
                    }
                    if (decade.equals("198")){
                        drama1980++;
                    }
                    if (decade.equals("199")){
                        drama1990++;
                    }
                    if (decade.equals("200")){
                        drama2000++;
                    }
                    if (decade.equals("201")){
                        drama2010++;
                    }

                }        
               if(splitGenre[a].equals("Sci-Fi")){
                    
                    scifi++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        scifi5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        scifi1900++;
                    }
                    if (decade.equals("191")){
                        scifi1910++;
                    }
                    if (decade.equals("192")){
                        scifi1920++;
                    }
                    if (decade.equals("193")){
                        scifi1930++;
                    }
                    if (decade.equals("194")){
                        scifi1940++;
                    }
                    if (decade.equals("195")){
                        scifi1950++;
                    }
                    if (decade.equals("196")){
                        scifi1960++;
                    }
                    if (decade.equals("197")){
                        scifi1970++;
                    }
                    if (decade.equals("198")){
                        scifi1980++;
                    }
                    if (decade.equals("199")){
                        scifi1990++;
                    }
                    if (decade.equals("200")){
                        scifi2000++;
                    }
                    if (decade.equals("201")){
                        scifi2010++;
                    }


                }         
                if(splitGenre[a].equals("Documentary")){
                    
                    documentary++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        documentary5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        documentary1900++;
                    }
                    if (decade.equals("191")){
                        documentary1910++;
                    }
                    if (decade.equals("192")){
                        documentary1920++;
                    }
                    if (decade.equals("193")){
                        documentary1930++;
                    }
                    if (decade.equals("194")){
                        documentary1940++;
                    }
                    if (decade.equals("195")){
                        documentary1950++;
                    }
                    if (decade.equals("196")){
                        documentary1960++;
                    }
                    if (decade.equals("197")){
                        documentary1970++;
                    }
                    if (decade.equals("198")){
                        documentary1980++;
                    }
                    if (decade.equals("199")){
                        documentary1990++;
                    }
                    if (decade.equals("200")){
                        documentary2000++;
                    }
                    if (decade.equals("201")){
                        documentary2010++;
                    }
                    
                    

                } 
                if(splitGenre[a].equals("Mystery")){
                    
                     mystery++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        mystery5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        mystery1900++;
                    }
                    if (decade.equals("191")){
                        mystery1910++;
                    }
                    if (decade.equals("192")){
                        mystery1920++;
                    }
                    if (decade.equals("193")){
                        mystery1930++;
                    }
                    if (decade.equals("194")){
                        mystery1940++;
                    }
                    if (decade.equals("195")){
                        mystery1950++;
                    }
                    if (decade.equals("196")){
                        mystery1960++;
                    }
                    if (decade.equals("197")){
                        mystery1970++;
                    }
                    if (decade.equals("198")){
                        mystery1980++;
                    }
                    if (decade.equals("199")){
                        mystery1990++;
                    }
                    if (decade.equals("200")){
                        mystery2000++;
                    }
                    if (decade.equals("201")){
                        mystery2010++;
                    }
                    

                }        
                if(splitGenre[a].equals("Horror")){
                    
                    horror++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        horror5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        horror1900++;
                    }
                    if (decade.equals("191")){
                        horror1910++;
                    }
                    if (decade.equals("192")){
                        horror1920++;
                    }
                    if (decade.equals("193")){
                        horror1930++;
                    }
                    if (decade.equals("194")){
                        horror1940++;
                    }
                    if (decade.equals("195")){
                        horror1950++;
                    }
                    if (decade.equals("196")){
                        horror1960++;
                    }
                    if (decade.equals("197")){
                        horror1970++;
                    }
                    if (decade.equals("198")){
                        horror1980++;
                    }
                    if (decade.equals("199")){
                        horror1990++;
                    }
                    if (decade.equals("200")){
                        horror2000++;
                    }
                    if (decade.equals("201")){
                        horror2010++;
                    }
                    
                    

                }        
                if(splitGenre[a].equals("Children")){
                    
                    children++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        children5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        children1900++;
                    }
                    if (decade.equals("191")){
                        children1910++;
                    }
                    if (decade.equals("192")){
                        children1920++;
                    }
                    if (decade.equals("193")){
                        children1930++;
                    }
                    if (decade.equals("194")){
                        children1940++;
                    }
                    if (decade.equals("195")){
                        children1950++;
                    }
                    if (decade.equals("196")){
                        children1960++;
                    }
                    if (decade.equals("197")){
                        children1970++;
                    }
                    if (decade.equals("198")){
                        children1980++;
                    }
                    if (decade.equals("199")){
                        children1990++;
                    }
                    if (decade.equals("200")){
                        children2000++;
                    }
                    if (decade.equals("201")){
                        children2010++;
                    }
                    
                    

                }        
                if(splitGenre[a].equals("Romance")){
                    
                    romance++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        romance5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        romance1900++;
                    }
                    if (decade.equals("191")){
                        romance1910++;
                    }
                    if (decade.equals("192")){
                        romance1920++;
                    }
                    if (decade.equals("193")){
                        romance1930++;
                    }
                    if (decade.equals("194")){
                        romance1940++;
                    }
                    if (decade.equals("195")){
                        romance1950++;
                    }
                    if (decade.equals("196")){
                        romance1960++;
                    }
                    if (decade.equals("197")){
                        romance1970++;
                    }
                    if (decade.equals("198")){
                        romance1980++;
                    }
                    if (decade.equals("199")){
                        romance1990++;
                    }
                    if (decade.equals("200")){
                        romance2000++;
                    }
                    if (decade.equals("201")){
                        romance2010++;
                    }
                    

                }                
                if(splitGenre[a].equals("Thriller")){
                    
                    thriller++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        thriller5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        thriller1900++;
                    }
                    if (decade.equals("191")){
                        thriller1910++;
                    }
                    if (decade.equals("192")){
                        thriller1920++;
                    }
                    if (decade.equals("193")){
                        thriller1930++;
                    }
                    if (decade.equals("194")){
                        thriller1940++;
                    }
                    if (decade.equals("195")){
                        thriller1950++;
                    }
                    if (decade.equals("196")){
                        thriller1960++;
                    }
                    if (decade.equals("197")){
                        thriller1970++;
                    }
                    if (decade.equals("198")){
                        thriller1980++;
                    }
                    if (decade.equals("199")){
                        thriller1990++;
                    }
                    if (decade.equals("200")){
                        thriller2000++;
                    }
                    if (decade.equals("201")){
                        thriller2010++;
                    }
                    
                    
                }         
                if(splitGenre[a].equals("Adventure")){
                    
                    adventure++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        adventure5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        adventure1900++;
                    }
                    if (decade.equals("191")){
                        adventure1910++;
                    }
                    if (decade.equals("192")){
                        adventure1920++;
                    }
                    if (decade.equals("193")){
                        adventure1930++;
                    }
                    if (decade.equals("194")){
                        adventure1940++;
                    }
                    if (decade.equals("195")){
                        adventure1950++;
                    }
                    if (decade.equals("196")){
                        adventure1960++;
                    }
                    if (decade.equals("197")){
                        adventure1970++;
                    }
                    if (decade.equals("198")){
                        adventure1980++;
                    }
                    if (decade.equals("199")){
                        adventure1990++;
                    }
                    if (decade.equals("200")){
                        adventure2000++;
                    }
                    if (decade.equals("201")){
                        adventure2010++;
                    }

                } 
                if(splitGenre[a].equals("Fantasy")){
                    
                    fantasy++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        fantasy5++;
                        
                    }

                    
                    if (decade.equals("190")){
                        fantasy1900++;
                    }
                    if (decade.equals("191")){
                        fantasy1910++;
                    }
                    if (decade.equals("192")){
                        fantasy1920++;
                    }
                    if (decade.equals("193")){
                        fantasy1930++;
                    }
                    if (decade.equals("194")){
                        fantasy1940++;
                    }
                    if (decade.equals("195")){
                        fantasy1950++;
                    }
                    if (decade.equals("196")){
                        fantasy1960++;
                    }
                    if (decade.equals("197")){
                        fantasy1970++;
                    }
                    if (decade.equals("198")){
                        fantasy1980++;
                    }
                    if (decade.equals("199")){
                        fantasy1990++;
                    }
                    if (decade.equals("200")){
                        fantasy2000++;
                    }
                    if (decade.equals("201")){
                        fantasy2010++;
                    }
                    

                } 
                if(splitGenre[a].equals("War")){
                    
                    war++;
                    
                    if (arrList.get(i).year.equals("2015") || arrList.get(i).year.equals("2016") || arrList.get(i).year.equals("2017") || arrList.get(i).year.equals("2018")
                            || arrList.get(i).year.equals("2019")){
                        
                        war5++;
                        
                    }
                    
                    
                    if (decade.equals("190")){
                        war1900++;
                    }
                    if (decade.equals("191")){
                        war1910++;
                    }
                    if (decade.equals("192")){
                        war1920++;
                    }
                    if (decade.equals("193")){
                        war1930++;
                    }
                    if (decade.equals("194")){
                        war1940++;
                    }
                    if (decade.equals("195")){
                        war1950++;
                    }
                    if (decade.equals("196")){
                        war1960++;
                    }
                    if (decade.equals("197")){
                        war1970++;
                    }
                    if (decade.equals("198")){
                        war1980++;
                    }
                    if (decade.equals("199")){
                        war1990++;
                    }
                    if (decade.equals("200")){
                        war2000++;
                    }
                    if (decade.equals("201")){
                        war2010++;
                    }

                } 
               
                
            }
            
        }
        
        //find average movies
        int avgMoviesPerGenre = (action+comedy+crime+animation+drama+scifi+documentary+mystery+horror+children+romance+thriller+adventure+fantasy+war)/15;
        
        System.out.println("Average amount of films per genre: " + avgMoviesPerGenre);
        System.out.println();
        System.out.println();
        System.out.println("Amount of films in each genre");
        System.out.println();
        System.out.println();
        
        
        //printing the basic report of how many films per genre
        System.out.print("Action: " + action);
        if(action>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.print("Comedy: " + comedy);
        if(comedy>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.print("Crime: " + crime);
        if(crime>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.print("Animation: " + animation);
        if(animation>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        
        System.out.print("Drama: " + drama);
        if(drama>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.print("Sci-Fi: " + scifi);
        if(scifi>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        
        System.out.print("Documentary: " + documentary);
        if(documentary>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        
        System.out.print("Mystery: " + mystery);
        if(mystery>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        
        System.out.print("Horror: " + horror);
        if(horror>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.print("Children: " + children);
        if(children>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        
        System.out.print("Romance: " + romance);
        if(romance>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.print("Thriller: " + thriller);
        if(thriller>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.print("Adventure: " + adventure);
        if(adventure>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.print("Fantasy: " + fantasy);
        if(fantasy>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        
        System.out.print("War: " + war);
        if(war>avgMoviesPerGenre){
            System.out.println(" and is above the average movies per genre");
        }
        else{System.out.println(" and is below the average movies per genre");}
        
        System.out.println();
        System.out.println();
        
        
       
        
        //printing amount of films for each genre in the past 5 years
        System.out.println("Amount of films in each genre in the past 5 years");
        System.out.println();
        System.out.println();
        
        System.out.println("Action: " + action5);
        System.out.println("Comedy: " + comedy5);
        System.out.println("Crime: " + crime5);
        System.out.println("Animation: " + animation5);
        System.out.println("Drama: " + drama5);
        System.out.println("Sci-Fi: " + scifi5);
        System.out.println("Documentary: " + documentary5);
        System.out.println("Mystery: " + mystery5);
        System.out.println("Horror: " + horror5);
        System.out.println("Children: " + children5);
        System.out.println("Romance: " + romance5);
        System.out.println("Thriller: " + thriller5);
        System.out.println("Adventure: " + adventure5);
        System.out.println("Fantasy: " + fantasy5);
        System.out.println("War: " + war5);
        System.out.println();
        System.out.println();

        //Here i print each decade
        System.out.println("Amount of films per genre per decade");
        System.out.println();
        System.out.println();
        System.out.println("1900's");
        System.out.println();
        
        System.out.println("Action: " + action1900);
        System.out.println("Comedy: " + comedy1900);
        System.out.println("Crime: " + crime1900);
        System.out.println("Animation: " + animation1900);
        System.out.println("Drama: " + drama1900);
        System.out.println("Sci-Fi: " + scifi1900);
        System.out.println("Documentary: " + documentary1900);
        System.out.println("Mystery: " + mystery1900);
        System.out.println("Horror: " + horror1900);
        System.out.println("Children: " + children1900);
        System.out.println("Romance: " + romance1900);
        System.out.println("Thriller: " + thriller1900);
        System.out.println("Adventure: " + adventure1900);
        System.out.println("Fantasy: " + fantasy1900);
        System.out.println("War: " + war1900);
        
        
        
        
        System.out.println();
        System.out.println();
        System.out.println("1910's");
        System.out.println();
        
        System.out.println("Action: " + action1910);
        System.out.println("Comedy: " + comedy1910);
        System.out.println("Crime: " + crime1910);
        System.out.println("Animation: " + animation1910);
        System.out.println("Drama: " + drama1910);
        System.out.println("Sci-Fi: " + scifi1910);
        System.out.println("Documentary: " + documentary1910);
        System.out.println("Mystery: " + mystery1910);
        System.out.println("Horror: " + horror1910);
        System.out.println("Children: " + children1910);
        System.out.println("Romance: " + romance1910);
        System.out.println("Thriller: " + thriller1910);
        System.out.println("Adventure: " + adventure1910);
        System.out.println("Fantasy: " + fantasy1910);
        System.out.println("War: " + war1910);
        
        
        System.out.println();
        System.out.println();
        System.out.println("1920's");
        System.out.println();
        
        System.out.println("Action: " + action1920);
        System.out.println("Comedy: " + comedy1920);
        System.out.println("Crime: " + crime1920);
        System.out.println("Animation: " + animation1920);
        System.out.println("Drama: " + drama1920);
        System.out.println("Sci-Fi: " + scifi1920);
        System.out.println("Documentary: " + documentary1920);
        System.out.println("Mystery: " + mystery1920);
        System.out.println("Horror: " + horror1920);
        System.out.println("Children: " + children1920);
        System.out.println("Romance: " + romance1920);
        System.out.println("Thriller: " + thriller1920);
        System.out.println("Adventure: " + adventure1920);
        System.out.println("Fantasy: " + fantasy1920);
        System.out.println("War: " + war1920);
        
        System.out.println();
        System.out.println();
        System.out.println("1930's");
        System.out.println();
        
        System.out.println("Action: " + action1930);
        System.out.println("Comedy: " + comedy1930);
        System.out.println("Crime: " + crime1930);
        System.out.println("Animation: " + animation1930);
        System.out.println("Drama: " + drama1930);
        System.out.println("Sci-Fi: " + scifi1930);
        System.out.println("Documentary: " + documentary1930);
        System.out.println("Mystery: " + mystery1930);
        System.out.println("Horror: " + horror1930);
        System.out.println("Children: " + children1930);
        System.out.println("Romance: " + romance1930);
        System.out.println("Thriller: " + thriller1930);
        System.out.println("Adventure: " + adventure1930);
        System.out.println("Fantasy: " + fantasy1930);
        System.out.println("War: " + war1930);
        
        
        System.out.println();
        System.out.println();
        System.out.println("1940's");
        System.out.println();
        
        System.out.println("Action: " + action1940);
        System.out.println("Comedy: " + comedy1940);
        System.out.println("Crime: " + crime1940);
        System.out.println("Animation: " + animation1940);
        System.out.println("Drama: " + drama1940);
        System.out.println("Sci-Fi: " + scifi1940);
        System.out.println("Documentary: " + documentary1940);
        System.out.println("Mystery: " + mystery1940);
        System.out.println("Horror: " + horror1940);
        System.out.println("Children: " + children1940);
        System.out.println("Romance: " + romance1940);
        System.out.println("Thriller: " + thriller1940);
        System.out.println("Adventure: " + adventure1940);
        System.out.println("Fantasy: " + fantasy1940);
        System.out.println("War: " + war1940);
        
        System.out.println();
        System.out.println();
        System.out.println("1950's");
        System.out.println();
        
        System.out.println("Action: " + action1950);
        System.out.println("Comedy: " + comedy1950);
        System.out.println("Crime: " + crime1950);
        System.out.println("Animation: " + animation1950);
        System.out.println("Drama: " + drama1950);
        System.out.println("Sci-Fi: " + scifi1950);
        System.out.println("Documentary: " + documentary1950);
        System.out.println("Mystery: " + mystery1950);
        System.out.println("Horror: " + horror1950);
        System.out.println("Children: " + children1950);
        System.out.println("Romance: " + romance1950);
        System.out.println("Thriller: " + thriller1950);
        System.out.println("Adventure: " + adventure1950);
        System.out.println("Fantasy: " + fantasy1950);
        System.out.println("War: " + war1950);
        
        
        System.out.println();
        System.out.println();
        System.out.println("1960's");
        System.out.println();
        
        System.out.println("Action: " + action1960);
        System.out.println("Comedy: " + comedy1960);
        System.out.println("Crime: " + crime1960);
        System.out.println("Animation: " + animation1960);
        System.out.println("Drama: " + drama1960);
        System.out.println("Sci-Fi: " + scifi1960);
        System.out.println("Documentary: " + documentary1960);
        System.out.println("Mystery: " + mystery1960);
        System.out.println("Horror: " + horror1960);
        System.out.println("Children: " + children1960);
        System.out.println("Romance: " + romance1960);
        System.out.println("Thriller: " + thriller1960);
        System.out.println("Adventure: " + adventure1960);
        System.out.println("Fantasy: " + fantasy1960);
        System.out.println("War: " + war1960);
        
        System.out.println();
        System.out.println();
        System.out.println("1970's");
        System.out.println();
        
        System.out.println("Action: " + action1970);
        System.out.println("Comedy: " + comedy1970);
        System.out.println("Crime: " + crime1970);
        System.out.println("Animation: " + animation1970);
        System.out.println("Drama: " + drama1970);
        System.out.println("Sci-Fi: " + scifi1970);
        System.out.println("Documentary: " + documentary1970);
        System.out.println("Mystery: " + mystery1970);
        System.out.println("Horror: " + horror1970);
        System.out.println("Children: " + children1970);
        System.out.println("Romance: " + romance1970);
        System.out.println("Thriller: " + thriller1970);
        System.out.println("Adventure: " + adventure1970);
        System.out.println("Fantasy: " + fantasy1970);
        System.out.println("War: " + war1970);
        
        System.out.println();
        System.out.println();
        System.out.println("1980's");
        System.out.println();
        
        System.out.println("Action: " + action1980);
        System.out.println("Comedy: " + comedy1980);
        System.out.println("Crime: " + crime1980);
        System.out.println("Animation: " + animation1980);
        System.out.println("Drama: " + drama1980);
        System.out.println("Sci-Fi: " + scifi1980);
        System.out.println("Documentary: " + documentary1980);
        System.out.println("Mystery: " + mystery1980);
        System.out.println("Horror: " + horror1980);
        System.out.println("Children: " + children1980);
        System.out.println("Romance: " + romance1980);
        System.out.println("Thriller: " + thriller1980);
        System.out.println("Adventure: " + adventure1980);
        System.out.println("Fantasy: " + fantasy1980);
        System.out.println("War: " + war1980);
        
        
        System.out.println();
        System.out.println();
        System.out.println("1990's");
        System.out.println();
        
        System.out.println("Action: " + action1990);
        System.out.println("Comedy: " + comedy1990);
        System.out.println("Crime: " + crime1990);
        System.out.println("Animation: " + animation1990);
        System.out.println("Drama: " + drama1990);
        System.out.println("Sci-Fi: " + scifi1990);
        System.out.println("Documentary: " + documentary1990);
        System.out.println("Mystery: " + mystery1990);
        System.out.println("Horror: " + horror1990);
        System.out.println("Children: " + children1990);
        System.out.println("Romance: " + romance1990);
        System.out.println("Thriller: " + thriller1990);
        System.out.println("Adventure: " + adventure1990);
        System.out.println("Fantasy: " + fantasy1990);
        System.out.println("War: " + war1990);
        
        
        System.out.println();
        System.out.println();
        System.out.println("2000's");
        System.out.println();
        
        System.out.println("Action: " + action2000);
        System.out.println("Comedy: " + comedy2000);
        System.out.println("Crime: " + crime2000);
        System.out.println("Animation: " + animation2000);
        System.out.println("Drama: " + drama2000);
        System.out.println("Sci-Fi: " + scifi2000);
        System.out.println("Documentary: " + documentary2000);
        System.out.println("Mystery: " + mystery2000);
        System.out.println("Horror: " + horror2000);
        System.out.println("Children: " + children2000);
        System.out.println("Romance: " + romance2000);
        System.out.println("Thriller: " + thriller2000);
        System.out.println("Adventure: " + adventure2000);
        System.out.println("Fantasy: " + fantasy2000);
        System.out.println("War: " + war2000);
        
        
        System.out.println();
        System.out.println();
        System.out.println("2010's");
        System.out.println();
        
        System.out.println("Action: " + action2010);
        System.out.println("Comedy: " + comedy2010);
        System.out.println("Crime: " + crime2010);
        System.out.println("Animation: " + animation2010);
        System.out.println("Drama: " + drama2010);
        System.out.println("Sci-Fi: " + scifi2010);
        System.out.println("Documentary: " + documentary2010);
        System.out.println("Mystery: " + mystery2010);
        System.out.println("Horror: " + horror2010);
        System.out.println("Children: " + children2010);
        System.out.println("Romance: " + romance2010);
        System.out.println("Thriller: " + thriller2010);
        System.out.println("Adventure: " + adventure2010);
        System.out.println("Fantasy: " + fantasy2010);
        System.out.println("War: " + war2010);
        
        
        
        
    }
    
    
    
    
    public String toString(){
        return movieName + " released in " + year + " in the genre(s) " + genre;
    }
    
    
    
    
    
    
}
