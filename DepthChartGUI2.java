/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DepthChart;

import java.awt.*;
import java.util.Collection;
import java.util.Map;
import javax.swing.*;

/**
 *
 * @author Stuart II
 */
public class DepthChartGUI2 extends JDialog{
    
    JLabel QB, HB, FB, TE, WR, T, G, C, DE, DT, OLB, MLB, CB, FS, SS, P, K;
    
    JTable qbTable, hbTable, fbTable, teTable, wrTable, tTable, gTable, cTable, 
           deTable, dtTable, olbTable, mlbTable, cbTable, fsTable, ssTable, pTable, kTable;
    
    JTabbedPane tab;
    
    JPanel offense, defense, sTeams;
    
    JScrollPane qbScroll, hbScroll, fbScroll, teScroll, wrScroll, tScroll, gScroll, cScroll,
                deScroll, dtScroll, olbScroll, mlbScroll, cbScroll, fsScroll, ssScroll, pScroll, kScroll;
    
    
    
public DepthChartGUI2(Frame AddPlayerGUI){
        Container pane = getContentPane();
        tab = new JTabbedPane();
        
        // Setting up the Offense Tab \\
        
        offense = new JPanel(new GridLayout(4,2));
        
        QB = new JLabel("QB", SwingConstants.CENTER);
        qbTable = new JTable(5,3);
        qbScroll = new JScrollPane(qbTable);
        
        HB = new JLabel("HB", SwingConstants.CENTER);
        hbTable = new JTable(5,3);
        hbScroll = new JScrollPane(hbTable);
        
        FB = new JLabel("FB", SwingConstants.CENTER);
        fbTable = new JTable(5,3);
        fbScroll = new JScrollPane(fbTable);
        
        TE = new JLabel("TE", SwingConstants.CENTER);
        teTable = new JTable(5,3);
        teScroll = new JScrollPane(teTable);
        
        WR = new JLabel("WR", SwingConstants.CENTER);
        wrTable = new JTable(10,3);
        wrScroll = new JScrollPane(wrTable);
        
        T = new JLabel("T", SwingConstants.CENTER);
        tTable = new JTable(5,3);
        tScroll = new JScrollPane(tTable);
        
        G = new JLabel("G", SwingConstants.CENTER);
        gTable = new JTable(5,3);
        gScroll = new JScrollPane(gTable);
        
        C = new JLabel("C", SwingConstants.CENTER);
        cTable = new JTable(5,3);
        cScroll = new JScrollPane(cTable);
        
        
                       
        offense.add(QB);
        offense.add(qbScroll);
        offense.add(HB);
        offense.add(hbScroll);
        offense.add(FB);
        offense.add(fbScroll);
        offense.add(TE);
        offense.add(teScroll);
        offense.add(WR);
        offense.add(wrScroll);
        offense.add(T);
        offense.add(tScroll);
        offense.add(G);
        offense.add(gScroll);
        offense.add(C);
        offense.add(cScroll);
        tab.addTab("Offense", offense);
        
        
        // Setting up Defense tab \\
        defense = new JPanel(new GridLayout(4,2));
        DE = new JLabel("DE", SwingConstants.CENTER);
        deTable = new JTable(5,3);
        deScroll = new JScrollPane(deTable);
        
        DT = new JLabel("DT", SwingConstants.CENTER);
        dtTable = new JTable(5,3);
        dtScroll = new JScrollPane(dtTable);
        
        OLB = new JLabel("OLB", SwingConstants.CENTER);
        olbTable = new JTable(5,3);
        olbScroll = new JScrollPane(olbTable);
        
        MLB = new JLabel("MLB", SwingConstants.CENTER);
        mlbTable = new JTable(5,3);
        mlbScroll = new JScrollPane(mlbTable);
        
        CB = new JLabel("CB", SwingConstants.CENTER);
        cbTable = new JTable(10,3);
        cbScroll = new JScrollPane(cbTable);
        
        FS = new JLabel("FS", SwingConstants.CENTER);
        fsTable = new JTable(5,3);
        fsScroll = new JScrollPane(fsTable);
        
        SS = new JLabel("SS", SwingConstants.CENTER);
        ssTable = new JTable(5,3);
        ssScroll = new JScrollPane(ssTable);
             
               
        defense.add(DE);
        defense.add(deScroll);
        defense.add(DT);
        defense.add(dtScroll);
        defense.add(OLB);
        defense.add(olbScroll);
        defense.add(MLB);
        defense.add(mlbScroll);
        defense.add(CB);
        defense.add(cbScroll);
        defense.add(FS);
        defense.add(fsScroll);
        defense.add(SS);
        defense.add(ssScroll);
        tab.addTab("Defense", defense);
        
        //P Setting up Special Teams Tab \\
        sTeams = new JPanel(new FlowLayout());
        
        P = new JLabel("P", SwingConstants.CENTER);
        pTable = new JTable(2,3);
        pScroll = new JScrollPane(pTable);
        
        K = new JLabel("K", SwingConstants.CENTER);
        kTable = new JTable(2,3);
        kScroll = new JScrollPane(kTable);
        
        sTeams.add(P);
        sTeams.add(pScroll);
        sTeams.add(K);
        sTeams.add(kScroll);
        tab.addTab("Special Teams", sTeams);
      
    
        
        pane.add(tab);
    
        setTitle("NCAA 14 Depth Chart");
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    

}


    public void changeChart(PositionLists list){
        Collection qbVal = list.QB.values();
        
        
        
        
    }
}