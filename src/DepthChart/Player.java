package DepthChart;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stuart
 */
public class Player implements Comparable<Player> {
    
    String name, position, year, redshirt;
    int rating, chartNum;
    
    
    Player(){
        
    }
    Player(String name, String position, int rating, String year){
        this.name = name;
        this.position = position;
       
                this.rating = rating;
         
             this.year = year;
     }
    
    public void setName(String x){
        name = x;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPosition(String x){
        position = x;
        
    }
    
    public String getPosition(){
        return position;
    }
    
    public void setRating(int x){
        rating = x;
    }
    
    public int getRating(){
        return rating;
    }
    
    public void setYear(int x){
                
        switch(x) {
            case 1: year = "FR";
                break;
            case 2: year = "SO";
                break;
            case 3: year = "JR";
                break;
            case 4: year = "SR";
                break;
            default: year = "Invalid Year";
                break;
        }
    }
    
    public String getYear(){
        return year;
    }
    
    public void setChartNum(int num){
        chartNum = num;
    }
    
    public int getChartNum(){
        return chartNum;
    }
    
    public String toString(){
        return(name + " || " + position.toUpperCase() + " || " + rating + " || " + year.toUpperCase());
    }
    
    public int compareTo(Player player){
        int compareOverall = ((Player)player).getRating();
        
        return compareOverall - this.rating;
    }
}
