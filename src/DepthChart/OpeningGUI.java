package DepthChart;

import java.awt.*;
import java.sql.SQLException;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


public class OpeningGUI extends JFrame {
	
	JPanel mainPanel;
	JButton addButton, viewButton;
	String guiTitle = "NCAA Football Depth Chart";
	Database db = null;
	
	
	
	
	public OpeningGUI () {
		
		
		
	    
		Container pane = getContentPane();
		
		mainPanel = new JPanel( new GridLayout(2,1));
		
		addButton = new JButton("Add/Remove Players");
		viewButton = new JButton("View Depth Chart");
		
		addButton.setActionCommand("addButton");
		viewButton.setActionCommand("viewButton");
		
		mainPanel.add(addButton);
		addButton.addActionListener(new OpeningGUI.addButtonListener());
		mainPanel.add(viewButton);
		viewButton.addActionListener(new OpeningGUI.viewChartButtonListener());
		
		pane.add(mainPanel);
		
	   	
		
		
	     setTitle(guiTitle);
	     setSize(500, 190);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setLocationRelativeTo(null);
	     setVisible(true);
		
	     
	
		
		
		
		
	}
	
    private class viewChartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
           
        	String button = e.getActionCommand();
        	System.out.print(button);
        	if (button.equals("viewButton")){
        	
        		 try {
     				db = new Database("sa", "riyth804");
     			} catch (SQLException a) {
     				// TODO Auto-generated catch block
     				a.printStackTrace();
     			}
        		
        	DepthChartGUI2 chart = new DepthChartGUI2(Dialog.ModalityType.DOCUMENT_MODAL);
        	
            try {
            	
				db.getInfo(chart);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.print("Testing");
				e1.printStackTrace();
				
			}
            chart.setVisible(true);
			dispose();
        }
        
        }
    }
    
    
    private class addButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
           
String button = e.getActionCommand();
System.out.print(button);
        	
        	if (button.equals("addButton")){
            
            new AddPlayerGUI();
            dispose();
        	}
        }
    }
    
    public static void main(String args[]) {
        new OpeningGUI();
        
    }
}


