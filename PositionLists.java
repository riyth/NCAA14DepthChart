package DepthChart;


import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stuart
 */
public class PositionLists {
    
    PlayerList QB = new PlayerList();
    PlayerList HB = new PlayerList();
    PlayerList FB = new PlayerList();
    PlayerList TE = new PlayerList();
    PlayerList WR = new PlayerList();
    PlayerList T = new PlayerList();
    PlayerList G = new PlayerList();
    PlayerList C = new PlayerList();
    PlayerList DE = new PlayerList();
    PlayerList DT = new PlayerList();
    PlayerList OLB = new PlayerList();
    PlayerList MLB = new PlayerList();
    PlayerList CB = new PlayerList();
    PlayerList FS = new PlayerList();
    PlayerList SS = new PlayerList();
    PlayerList P = new PlayerList();
    PlayerList K = new PlayerList();
    
    public void addToList(Player x){
        switch(x.position.toUpperCase()){
            
            case "QB": QB.put(x.name, x); 
                break; 
            case "HB": HB.put(x.name, x);
                break;
            case "FB": FB.put(x.name, x);
                break;
            case "TE": TE.put(x.name, x);
                break;
            case "WR": WR.put(x.name, x);
                break;
            case "T": T.put(x.name, x);
                break;
            case "G": G.put(x.name, x);
                break;
            case "C": C.put(x.name, x);
                break;
            case "DE": DE.put(x.name, x);
                break;
            case "DT": DT.put(x.name, x);
                break;
            case "OLB": OLB.put(x.name, x);
                break;
            case "MLB": MLB.put(x.name, x);
                break;
            case "CB": CB.put(x.name, x);
                break;
            case "FS": FS.put(x.name, x);
                break;
            case "SS": SS.put(x.name, x);
                break;
            case "P": P.put(x.name, x);
                break;
            case "K": K.put(x.name, x);
                break;
                            
        }
    }
    
       
    public void removeFromList(Player x){
        switch(x.position){
            
            case "QB":QB.remove(x.name); 
                break; 
            case "HB": HB.remove(x);
                break;
            case "FB": FB.remove(x);
                break;
            case "TE": TE.remove(x);
                break;
            case "WR": WR.remove(x);
                break;
            case "T": T.remove(x);
                break;
            case "G": G.remove(x);
                break;
            case "C": C.remove(x);
                break;
            case "DE": DE.remove(x);
                break;
            case "DT": DT.remove(x);
                break;
            case "OLB": OLB.remove(x);
                break;
            case "MLB": MLB.remove(x);
                break;
            case "CB": CB.remove(x);
                break;
            case "FS": FS.remove(x);
                break;
            case "SS": SS.remove(x);
                break;
            case "P": P.remove(x);
                break;
            case "K": K.remove(x);
                break;
                            
        }
        }
        
    }
    
   

