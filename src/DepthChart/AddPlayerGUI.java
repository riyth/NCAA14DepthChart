package DepthChart;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;


@SuppressWarnings("serial")
public class AddPlayerGUI extends JFrame {
    
    JTextField nameTF, ratingTF;
    JComboBox<String> positionBox, yearBox;
    JLabel nameLabel, ratingLabel, positionLabel, yearLabel;
    JButton addButton, removeButton, viewChartButton, clearDBButton;
    JPanel mainPanel, southPanel, bottomPanel;
    JTextArea errorArea;
    String name;
    String position;
    String year;
    int rating, qbNum, hbNum, fbNum, teNum, wrNum, tNum, gNum, cNum, deNum, dtNum, olbNum, mlbNum, cbNum, fsNum, ssNum, pNum, kNum;
    PositionLists list = new PositionLists();
    DepthChartGUI2 chart = new DepthChartGUI2(this);
    Database db = null;
    
    
    
    public AddPlayerGUI() {
       
        chart.setVisible(false);
        Container pane = getContentPane();
        mainPanel = new JPanel(new GridLayout(4,2));
        southPanel = new JPanel(new GridLayout(1,4));
        bottomPanel = new JPanel(new GridLayout(1,1));
        
        nameLabel = new JLabel("Name: ");
        nameTF = new JTextField();
        ratingLabel = new JLabel("Rating");
        ratingTF = new JTextField();
        positionLabel = new JLabel("Position: ");
        positionBox = new JComboBox<String>();
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
        yearBox = new JComboBox<String>();
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
        clearDBButton = new JButton("Clear Database");
        
        southPanel.add(addButton);
        addButton.addActionListener(new AddPlayerGUI.AddButtonListener());
        southPanel.add(removeButton);
        removeButton.addActionListener(new AddPlayerGUI.removeButtonListener());
        southPanel.add(viewChartButton);
        viewChartButton.addActionListener(new AddPlayerGUI.viewChartButtonListener());
        southPanel.add(clearDBButton);
        clearDBButton.addActionListener(new AddPlayerGUI.clearButtonListener());
        pane.add(southPanel, FlowLayout.CENTER);
        
        errorArea = new JTextArea("Check here for errors/information.");
        errorArea.setEditable(false);
        
        bottomPanel.add(errorArea);
        errorArea.setText("Watch for messages here!");
        pane.add(bottomPanel, BorderLayout.SOUTH);
        
        
        
        setTitle("NCAA 14 Depth Chart");
        setSize(500, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        try {
			db = new Database("sa", "riyth804");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
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
            
           
            try {
            	db.putInfo(newPlayer);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
           

            errorArea.setText(year + " " + position + " " + name + " has been added to the depth chart.");
        }
    }
    
    private class viewChartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
           
            try {
				db.getInfo(chart);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				
				e1.printStackTrace();
				chart.setVisible(true);
			}
            chart.setVisible(true);
            
        }
    }
    
    private class removeButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            name = nameTF.getText();
            
            try {
				db.removePlayer(name, chart);
				errorArea.setText("Player " + name + " has been removed from the depth chart.");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
        
    private class clearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
        
        	String confirm = JOptionPane.showInputDialog("Are you sure you want to clear the database? \nType yes in the field below "
        			+ "to clear.");
        	
        	if(confirm.equalsIgnoreCase("yes")){
        		try {
					db.clearDatabase(chart);
					errorArea.setText("The database has been cleared.");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	} else errorArea.setText("The database has NOT been cleared.");
        	
        	chart.resetNums();
        }
        
        }
    
    
     public static void main(String args[]) {
        new AddPlayerGUI();
        
    }
}