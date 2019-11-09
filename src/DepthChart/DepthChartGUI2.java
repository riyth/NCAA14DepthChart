package DepthChart;

import java.awt.*;
import java.util.Collection;
import java.util.Map;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stuart II
 */
public class DepthChartGUI2 extends JDialog{
    
	int qbNum, hbNum, fbNum, teNum, wrNum, tNum, gNum, cNum, deNum, dtNum, olbNum, mlbNum, cbNum, fsNum, ssNum, pNum, kNum;
	
    JLabel QB, HB, FB, TE, WR, T, G, C, DE, DT, OLB, MLB, CB, FS, SS, P, K;
    
    JTable qbTable, hbTable, fbTable, teTable, wrTable, tTable, gTable, cTable, 
           deTable, dtTable, olbTable, mlbTable, cbTable, fsTable, ssTable, pTable, kTable;
    
    JTabbedPane tab;
    
    JPanel offense, defense, sTeams;
    
    JScrollPane qbScroll, hbScroll, fbScroll, teScroll, wrScroll, tScroll, gScroll, cScroll,
                deScroll, dtScroll, olbScroll, mlbScroll, cbScroll, fsScroll, ssScroll, pScroll, kScroll;
    
    String[] headers = {"Name", "Rating", "Year"};
    
	DefaultTableModel qbModel, hbModel, fbModel, teModel, wrModel, gModel, cModel, tModel, deModel, dtModel, mlbModel, olbModel, 
				      cbModel, fsModel, ssModel, pModel , kModel;
	
public DepthChartGUI2(ModalityType documentModal){
    
		qbModel = new DefaultTableModel(headers, 10);
		hbModel = new DefaultTableModel(headers, 10);
		fbModel = new DefaultTableModel(headers, 10);
		teModel = new DefaultTableModel(headers, 10);
		wrModel = new DefaultTableModel(headers, 10);
		gModel = new DefaultTableModel(headers, 10);
		tModel = new DefaultTableModel(headers, 10);
		cModel = new DefaultTableModel(headers, 10);
		deModel = new DefaultTableModel(headers, 10);
		dtModel = new DefaultTableModel(headers, 10);
		mlbModel = new DefaultTableModel(headers, 10);
		olbModel = new DefaultTableModel(headers, 10);
		cbModel = new DefaultTableModel(headers, 10);
		fsModel = new DefaultTableModel(headers, 10);
		ssModel = new DefaultTableModel(headers, 10);
		pModel = new DefaultTableModel(headers, 2);
		kModel = new DefaultTableModel(headers, 2);
		
	    Container pane = getContentPane();
        tab = new JTabbedPane();
        
        // Setting up the Offense Tab \\
        
        offense = new JPanel(new GridLayout(4,2));
        
        QB = new JLabel("QB", SwingConstants.CENTER);
        qbTable = new JTable(qbModel);
        qbScroll = new JScrollPane(qbTable);
        
        HB = new JLabel("HB", SwingConstants.CENTER);
        hbTable = new JTable(hbModel);
        hbScroll = new JScrollPane(hbTable);
        
        FB = new JLabel("FB", SwingConstants.CENTER);
        fbTable = new JTable(fbModel);
        fbScroll = new JScrollPane(fbTable);
        
        TE = new JLabel("TE", SwingConstants.CENTER);
        teTable = new JTable(teModel);
        teScroll = new JScrollPane(teTable);
        
        WR = new JLabel("WR", SwingConstants.CENTER);
        wrTable = new JTable(wrModel);
        wrScroll = new JScrollPane(wrTable);
        
        T = new JLabel("T", SwingConstants.CENTER);
        tTable = new JTable(tModel);
        tScroll = new JScrollPane(tTable);
        
        G = new JLabel("G", SwingConstants.CENTER);
        gTable = new JTable(gModel);
        gScroll = new JScrollPane(gTable);
        
        C = new JLabel("C", SwingConstants.CENTER);
        cTable = new JTable(cModel);
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
        deTable = new JTable(deModel);
        deScroll = new JScrollPane(deTable);
        
        DT = new JLabel("DT", SwingConstants.CENTER);
        dtTable = new JTable(dtModel);
        dtScroll = new JScrollPane(dtTable);
        
        OLB = new JLabel("OLB", SwingConstants.CENTER);
        olbTable = new JTable(olbModel);
        olbScroll = new JScrollPane(olbTable);
        
        MLB = new JLabel("MLB", SwingConstants.CENTER);
        mlbTable = new JTable(mlbModel);
        mlbScroll = new JScrollPane(mlbTable);
        
        CB = new JLabel("CB", SwingConstants.CENTER);
        cbTable = new JTable(cbModel);
        cbScroll = new JScrollPane(cbTable);
        
        FS = new JLabel("FS", SwingConstants.CENTER);
        fsTable = new JTable(fsModel);
        fsScroll = new JScrollPane(fsTable);
        
        SS = new JLabel("SS", SwingConstants.CENTER);
        ssTable = new JTable(ssModel);
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
        pTable = new JTable(pModel);
        pScroll = new JScrollPane(pTable);
        
        K = new JLabel("K", SwingConstants.CENTER);
        kTable = new JTable(kModel);
        kScroll = new JScrollPane(kTable);
        
        sTeams.add(P);
        sTeams.add(pScroll);
        sTeams.add(K);
        sTeams.add(kScroll);
        tab.addTab("Special Teams", sTeams);
      
    
        
        pane.add(tab);
    
        setTitle("NCAA 14 Depth Chart");
        setSize(1000,500);
        setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    

}



	public void resetNums(){
		qbNum = 0;
		hbNum = 0;
		fbNum = 0; 
		teNum = 0;
		wrNum = 0; 
		tNum = 0; 
		gNum = 0;
		cNum = 0;
		deNum = 0;
		dtNum = 0;
		olbNum = 0;
		mlbNum = 0;
		cbNum = 0;
		fsNum = 0;
		ssNum  = 0;
		pNum = 0; 
		kNum = 0;
		
		qbModel = new DefaultTableModel(headers, 10);
		hbModel = new DefaultTableModel(headers, 10);
		fbModel = new DefaultTableModel(headers, 10);
		teModel = new DefaultTableModel(headers, 10);
		wrModel = new DefaultTableModel(headers, 10);
		gModel = new DefaultTableModel(headers, 10);
		tModel = new DefaultTableModel(headers, 10);
		cModel = new DefaultTableModel(headers, 10);
		deModel = new DefaultTableModel(headers, 10);
		dtModel = new DefaultTableModel(headers, 10);
		mlbModel = new DefaultTableModel(headers, 10);
		olbModel = new DefaultTableModel(headers, 10);
		cbModel = new DefaultTableModel(headers, 10);
		fsModel = new DefaultTableModel(headers, 10);
		ssModel = new DefaultTableModel(headers, 10);
		pModel = new DefaultTableModel(headers, 2);
		kModel = new DefaultTableModel(headers, 2);
		
		qbTable.setModel(qbModel);
		hbTable.setModel(hbModel);
		fbTable.setModel(fbModel);
		teTable.setModel(teModel);
		wrTable.setModel(wrModel);
		gTable.setModel(gModel);
		cTable.setModel(cModel);
		tTable.setModel(tModel);
		deTable.setModel(deModel);
		dtTable.setModel(dtModel);
		mlbTable.setModel(mlbModel);
		olbTable.setModel(olbModel);
		cbTable.setModel(cbModel);
		ssTable.setModel(ssModel);
		fsTable.setModel(fsModel);
		pTable.setModel(pModel);
		kTable.setModel(kModel);
	}
	
	
	
    public void changeChart(Player newPlayer){
        
        
        switch(newPlayer.position){
        
        case "QB": qbTable.setValueAt(newPlayer.name, qbNum, 0);
                   qbTable.setValueAt(newPlayer.rating, qbNum, 1);
                   qbTable.setValueAt(newPlayer.year, qbNum, 2);
                   qbNum++;
                   break; 
            
        case "HB": hbTable.setValueAt(newPlayer.name, hbNum, 0);
                   hbTable.setValueAt(newPlayer.rating, hbNum, 1);
                   hbTable.setValueAt(newPlayer.year, hbNum, 2);
                   hbNum++;
                   break;
                   
        case "FB": fbTable.setValueAt(newPlayer.name, fbNum, 0);
                   fbTable.setValueAt(newPlayer.rating, fbNum, 1);
                   fbTable.setValueAt(newPlayer.year, fbNum, 2);
                   fbNum++;
                   break;
                   
        case "TE": teTable.setValueAt(newPlayer.name, teNum, 0);
                   teTable.setValueAt(newPlayer.rating, teNum, 1);
                   teTable.setValueAt(newPlayer.year, teNum, 2);
                   teNum++;
                   break;
                   
        case "WR": wrTable.setValueAt(newPlayer.name, wrNum, 0);
                   wrTable.setValueAt(newPlayer.rating, wrNum, 1);
                   wrTable.setValueAt(newPlayer.year, wrNum, 2);
                   wrNum++;
                   break;
                   
        case "T":  tTable.setValueAt(newPlayer.name, tNum, 0);
                   tTable.setValueAt(newPlayer.rating, tNum, 1);
                   tTable.setValueAt(newPlayer.year, tNum, 2);
                   tNum++;
                   break;
                   
        case "G":  gTable.setValueAt(newPlayer.name, gNum, 0);
                   gTable.setValueAt(newPlayer.rating, gNum, 1);
                   gTable.setValueAt(newPlayer.year, gNum, 2);
                   gNum++;
                   break;
                   
        case "C":  cTable.setValueAt(newPlayer.name, cNum, 0);
                   cTable.setValueAt(newPlayer.rating, cNum, 1);
                   cTable.setValueAt(newPlayer.year, cNum, 2);
                   cNum++;
                   break;
                   
        case "DE": deTable.setValueAt(newPlayer.name, deNum, 0);
                   deTable.setValueAt(newPlayer.rating, deNum, 1);
                   deTable.setValueAt(newPlayer.year, deNum, 2);
                   deNum++;
                   break;
                   
        case "DT": dtTable.setValueAt(newPlayer.name, dtNum, 0);
                   dtTable.setValueAt(newPlayer.rating, dtNum, 1);
                   dtTable.setValueAt(newPlayer.year, dtNum, 2);
                   dtNum++;
                   break;
                   
        case "OLB": olbTable.setValueAt(newPlayer.name, olbNum, 0);
                    olbTable.setValueAt(newPlayer.rating, olbNum, 1);
                    olbTable.setValueAt(newPlayer.year, olbNum, 2);
                    olbNum++;
                    break;
                    
        case "MLB": mlbTable.setValueAt(newPlayer.name, mlbNum, 0);
                    mlbTable.setValueAt(newPlayer.rating, mlbNum, 1);
                    mlbTable.setValueAt(newPlayer.year, mlbNum, 2);
                    mlbNum++;
                    break;
                    
        case "CB": cbTable.setValueAt(newPlayer.name, cbNum, 0);
                   cbTable.setValueAt(newPlayer.rating, cbNum, 1);
                   cbTable.setValueAt(newPlayer.year, cbNum, 2);
                   cbNum++;
                   break;
                   
        case "FS": fsTable.setValueAt(newPlayer.name, fsNum, 0);
                   fsTable.setValueAt(newPlayer.rating, fsNum, 1);
                   fsTable.setValueAt(newPlayer.year, fsNum, 2);
                   fsNum++;
                   break;
                   
        case "SS": ssTable.setValueAt(newPlayer.name, ssNum, 0);
                   ssTable.setValueAt(newPlayer.rating, ssNum, 1);
                   ssTable.setValueAt(newPlayer.year, ssNum, 2);
                   ssNum++;
                   break;
                   
        case "P":  pTable.setValueAt(newPlayer.name, pNum, 0);
                   pTable.setValueAt(newPlayer.rating, pNum, 1);
                   pTable.setValueAt(newPlayer.year, pNum, 2);
                   pNum++;
                   break;
                   
        case "K":  kTable.setValueAt(newPlayer.name, kNum, 0);
                   kTable.setValueAt(newPlayer.rating, kNum, 1);
                   kTable.setValueAt(newPlayer.year, kNum, 2);
                   kNum++;
                   break;
                        
    } 

        
        
        
    }
    

}