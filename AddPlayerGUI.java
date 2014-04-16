package DepthChart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddPlayerGUI extends JFrame {
    
    JTextField nameTF, ratingTF;
    JComboBox positionBox, yearBox;
    JLabel nameLabel, ratingLabel, positionLabel, yearLabel;
    JButton addButton, removeButton, viewChartButton;
    JPanel mainPanel, southPanel, bottomPanel;
    JTextArea errorArea;
    String name;
    String position;
    String year;
    int rating, qbNum, hbNum, fbNum, teNum, wrNum, tNum, gNum, cNum, deNum, dtNum, olbNum, mlbNum, cbNum, fsNum, ssNum, pNum, kNum;
    PositionLists list = new PositionLists();
    DepthChartGUI2 chart = new DepthChartGUI2(this);
    
    
    public AddPlayerGUI() {
       
        chart.setVisible(false);
        Container pane = getContentPane();
        mainPanel = new JPanel(new GridLayout(4,2));
        southPanel = new JPanel(new GridLayout(1,3));
        bottomPanel = new JPanel(new GridLayout(1,1));
        
        nameLabel = new JLabel("Name: ");
        nameTF = new JTextField();
        ratingLabel = new JLabel("Rating");
        ratingTF = new JTextField();
        positionLabel = new JLabel("Position: ");
        positionBox = new JComboBox();
        positionBox.addItem("QB");
        positionBox.addItem("HB");
        positionBox.addItem("FB");
        positionBox.addItem("TE");
        positionBox.addItem("WR");
        positionBox.addItem("T");
        positionBox.addItem("G");
        positionBox.addItem("C");
        positionBox.addItem("DE");
        positionBox.addItem("DT");
        positionBox.addItem("OLB");
        positionBox.addItem("MLB");
        positionBox.addItem("CB");
        positionBox.addItem("FS");
        positionBox.addItem("SS");
        positionBox.addItem("P");
        positionBox.addItem("K"); 
        yearLabel = new JLabel("Year: ");
        yearBox = new JComboBox();
        yearBox.addItem("FR");
        yearBox.addItem("SO");
        yearBox.addItem("JR");
        yearBox.addItem("SR"); 
        
        mainPanel.add(nameLabel);
        mainPanel.add(nameTF);
        mainPanel.add(ratingLabel);
        mainPanel.add(ratingTF);
        mainPanel.add(positionLabel);
        mainPanel.add(positionBox);
        mainPanel.add(yearLabel);
        mainPanel.add(yearBox);
        pane.add(mainPanel, BorderLayout.NORTH);
        
        addButton = new JButton("Add Player");
        removeButton = new JButton("Remove Player");
        viewChartButton = new JButton("View Depth Chart");
        
        southPanel.add(addButton);
        addButton.addActionListener(new AddPlayerGUI.AddButtonListener());
        southPanel.add(removeButton);
        southPanel.add(viewChartButton);
        viewChartButton.addActionListener(new AddPlayerGUI.viewChartButtonListener());
        pane.add(southPanel, FlowLayout.CENTER);
        
        errorArea = new JTextArea("Check here for errors/information.");
        errorArea.setEditable(false);
        
        bottomPanel.add(errorArea);
        pane.add(bottomPanel, BorderLayout.SOUTH);
        
        
        
        setTitle("NCAA 14 Depth Chart");
        setSize(500, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
    
    private class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            name = nameTF.getText();
            int x = Integer.parseInt(ratingTF.getText());
            rating = x;
            position = (String)positionBox.getSelectedItem();
            year = (String)yearBox.getSelectedItem();
            
            Player newPlayer = new Player(name, position, rating, year);
            list.addToList(newPlayer);
            System.out.println(list.QB.toString());
           
                    switch(newPlayer.position.toUpperCase()){
            
            case "QB": chart.qbTable.setValueAt(name, qbNum, 0);
                       chart.qbTable.setValueAt(rating, qbNum, 1);
                       chart.qbTable.setValueAt(year, qbNum, 2);
                       qbNum++;
                break; 
            case "HB": chart.hbTable.setValueAt(name, hbNum, 0);
                       chart.hbTable.setValueAt(rating, hbNum, 1);
                       chart.hbTable.setValueAt(year, hbNum, 2);
                       hbNum++;
                break;
            case "FB": chart.fbTable.setValueAt(name, fbNum, 0);
                       chart.fbTable.setValueAt(rating, fbNum, 1);
                       chart.fbTable.setValueAt(year, fbNum, 2);
                       fbNum++;
                break;
            case "TE": chart.teTable.setValueAt(name, teNum, 0);
                       chart.teTable.setValueAt(rating, teNum, 1);
                       chart.teTable.setValueAt(year, teNum, 2);
                       teNum++;
                break;
            case "WR": chart.wrTable.setValueAt(name, wrNum, 0);
                       chart.wrTable.setValueAt(rating, wrNum, 1);
                       chart.wrTable.setValueAt(year, wrNum, 2);
                       wrNum++;
                break;
            case "T":  chart.tTable.setValueAt(name, tNum, 0);
                       chart.tTable.setValueAt(rating, tNum, 1);
                       chart.tTable.setValueAt(year, tNum, 2);
                       tNum++;
                break;
            case "G":  chart.gTable.setValueAt(name, gNum, 0);
                       chart.gTable.setValueAt(rating, gNum, 1);
                       chart.gTable.setValueAt(year, gNum, 2);
                       gNum++;
                break;
            case "C":  chart.cTable.setValueAt(name, cNum, 0);
                       chart.cTable.setValueAt(rating, cNum, 1);
                       chart.cTable.setValueAt(year, cNum, 2);
                       cNum++;
                break;
            case "DE": chart.deTable.setValueAt(name, deNum, 0);
                       chart.deTable.setValueAt(rating, deNum, 1);
                       chart.deTable.setValueAt(year, deNum, 2);
                       deNum++;
                break;
            case "DT": chart.dtTable.setValueAt(name, dtNum, 0);
                       chart.dtTable.setValueAt(rating, dtNum, 1);
                       chart.dtTable.setValueAt(year, dtNum, 2);
                       dtNum++;
                break;
            case "OLB": chart.olbTable.setValueAt(name, olbNum, 0);
                        chart.olbTable.setValueAt(rating, olbNum, 1);
                        chart.olbTable.setValueAt(year, olbNum, 2);
                        olbNum++;
                break;
            case "MLB": chart.mlbTable.setValueAt(name, mlbNum, 0);
                        chart.mlbTable.setValueAt(rating, mlbNum, 1);
                        chart.mlbTable.setValueAt(year, mlbNum, 2);
                        mlbNum++;
                break;
            case "CB": chart.cbTable.setValueAt(name, cbNum, 0);
                       chart.cbTable.setValueAt(rating, cbNum, 1);
                       chart.cbTable.setValueAt(year, cbNum, 2);
                       cbNum++;
                break;
            case "FS": chart.fsTable.setValueAt(name, fsNum, 0);
                       chart.fsTable.setValueAt(rating, fsNum, 1);
                       chart.fsTable.setValueAt(year, fsNum, 2);
                       fsNum++;
                break;
            case "SS": chart.ssTable.setValueAt(name, ssNum, 0);
                       chart.ssTable.setValueAt(rating, ssNum, 1);
                       chart.ssTable.setValueAt(year, ssNum, 2);
                       ssNum++;
                break;
            case "P":  chart.pTable.setValueAt(name, pNum, 0);
                       chart.pTable.setValueAt(rating, pNum, 1);
                       chart.pTable.setValueAt(year, pNum, 2);
                       pNum++;
                break;
            case "K":  chart.kTable.setValueAt(name, kNum, 0);
                       chart.kTable.setValueAt(rating, kNum, 1);
                       chart.kTable.setValueAt(year, kNum, 2);
                       kNum++;
                break;
                            
        }

            errorArea.setText(year + " " + position + " " + name + " has been added to the depth chart.");
        }
    }
    
    private class viewChartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            chart.changeChart(list);
            chart.setVisible(true);
            
        }
    }
    

     public static void main(String args[]) {
        new AddPlayerGUI();
        
    }
}