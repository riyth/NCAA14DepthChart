package DepthChart;


import java.util.*;
/**
 *
 * @author Stuart
 */
public class PlayerList extends Hashtable {
    
    
    String output = "";
    
    
    public PlayerList(){
        super();
        
    }
    
    
    
    @Override
    public String toString() {
        output = "";
        Set<String> keys = keySet();
        for(String key: keys){
            output = output + "\n" +  get(key);
        }
        return output;
    }
}
