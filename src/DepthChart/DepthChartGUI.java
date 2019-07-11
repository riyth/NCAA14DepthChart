package DepthChart;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stuart
 */
public class DepthChartGUI extends JDialog {
   
    JPanel mainPanel,southPanel;
    JLabel QB,HB,FB,TE,WR,T,G,C,DE,DT,OLB,MLB,CB,FS,SS,P,K;
    JTable qbTextArea;
    JTextArea hbTextArea,fbTextArea,teTextArea,wrTextArea,tTextArea,gTextArea,cTextArea,deTextArea,dtTextArea,
              olbTextArea,mlbTextArea,cbTextArea,fsTextArea,ssTextArea,pTextArea,kTextArea;
    JButton addButton,removeButton;
    int rating;
    String name,position,year;
    String guiTitle = "Team Depth Chart";
    String[] columnNames = {"Name","Rating","Year"};
    Object[][] rowData = {{"", "",""}};
    boolean badInput = true;
    
    
    public DepthChartGUI(Frame AddPlayerGUI) {
        
       
       Container pane = getContentPane();
       mainPanel = new JPanel(new GridLayout (6,4));
       southPanel = new JPanel(new GridLayout(2,1));
       
       QB = new JLabel("QB", SwingConstants.RIGHT);
       qbTextArea = new JTable(rowData,columnNames);
       
       //qbTextArea.setEditable(false);
       qbTextArea.setBackground(Color.lightGray);
       
       
       HB = new JLabel("HB", SwingConstants.RIGHT);
       hbTextArea = new JTextArea();
       hbTextArea.setEditable(false);
       hbTextArea.setBackground(Color.lightGray);
       
       FB = new JLabel("FB", SwingConstants.RIGHT);
       fbTextArea = new JTextArea();
       fbTextArea.setEditable(false);
       fbTextArea.setBackground(Color.lightGray);
       
       TE = new JLabel("TE", SwingConstants.RIGHT);
       teTextArea = new JTextArea();
       teTextArea.setEditable(false);
       teTextArea.setBackground(Color.lightGray);
       
       WR = new JLabel("WR", SwingConstants.RIGHT);
       wrTextArea = new JTextArea();
       wrTextArea.setEditable(false);
       wrTextArea.setBackground(Color.lightGray);
       
       T = new JLabel("Tackle", SwingConstants.RIGHT);
       tTextArea = new JTextArea();
       tTextArea.setEditable(false);
       tTextArea.setBackground(Color.lightGray);
       
       G = new JLabel("Guard", SwingConstants.RIGHT);
       gTextArea = new JTextArea();
       gTextArea.setEditable(false);
       gTextArea.setBackground(Color.lightGray);
       
       C = new JLabel("Center", SwingConstants.RIGHT);
       cTextArea = new JTextArea();
       cTextArea.setEditable(false);
       cTextArea.setBackground(Color.lightGray);
       
       DE = new JLabel("DE", SwingConstants.RIGHT);
       deTextArea = new JTextArea();
       deTextArea.setEditable(false);
       deTextArea.setBackground(Color.lightGray);
       
       DT = new JLabel("DT", SwingConstants.RIGHT);
       dtTextArea = new JTextArea();
       dtTextArea.setEditable(false);
       dtTextArea.setBackground(Color.lightGray);
       
       OLB = new JLabel("OLB", SwingConstants.RIGHT);
       olbTextArea = new JTextArea();
       olbTextArea.setEditable(false);
       olbTextArea.setBackground(Color.lightGray);
       
       MLB = new JLabel("MLB", SwingConstants.RIGHT);
       mlbTextArea = new JTextArea();
       mlbTextArea.setEditable(false);
       mlbTextArea.setBackground(Color.lightGray);
       
       CB = new JLabel("CB", SwingConstants.RIGHT);
       cbTextArea = new JTextArea();
       cbTextArea.setEditable(false);
       cbTextArea.setBackground(Color.lightGray);
       
       FS = new JLabel("FS", SwingConstants.RIGHT);
       fsTextArea = new JTextArea();
       fsTextArea.setEditable(false);
       fsTextArea.setBackground(Color.lightGray);
       
       SS = new JLabel("SS", SwingConstants.RIGHT);
       ssTextArea = new JTextArea();
       ssTextArea.setEditable(false);
       ssTextArea.setBackground(Color.lightGray);
       
       P = new JLabel("Punter", SwingConstants.RIGHT);
       pTextArea = new JTextArea();
       pTextArea.setEditable(false);
       pTextArea.setBackground(Color.lightGray);
       
       K = new JLabel("Kicker", SwingConstants.RIGHT);
       kTextArea = new JTextArea();
       kTextArea.setEditable(false);
       kTextArea.setBackground(Color.lightGray);
       addButton = new JButton("Add Player");
       //addButton.addActionListener(new DepthChartGUI.AddButtonHandler());
       
       removeButton = new JButton("Remove Player");
       //removeButton.addActionListener(new DepthChartGUI.RemoveButtonHandler());
       mainPanel.add(QB);
       mainPanel.add(qbTextArea);
       mainPanel.add(HB);
       mainPanel.add(hbTextArea);
       mainPanel.add(FB);
       mainPanel.add(fbTextArea);
       mainPanel.add(TE);
       mainPanel.add(teTextArea);
       mainPanel.add(WR);
       mainPanel.add(wrTextArea);
       mainPanel.add(T);
       mainPanel.add(tTextArea);
       mainPanel.add(G);
       mainPanel.add(gTextArea);
       mainPanel.add(C);
       mainPanel.add(cTextArea);
       mainPanel.add(DT);
       mainPanel.add(dtTextArea);
       mainPanel.add(DE);
       mainPanel.add(deTextArea);
       mainPanel.add(OLB);
       mainPanel.add(olbTextArea);
       mainPanel.add(MLB);
       mainPanel.add(mlbTextArea);
       mainPanel.add(CB);
       mainPanel.add(cbTextArea);
       mainPanel.add(FS);
       mainPanel.add(fsTextArea);
       mainPanel.add(SS);
       mainPanel.add(ssTextArea);
       mainPanel.add(P);
       mainPanel.add(pTextArea);
       mainPanel.add(K);
       mainPanel.add(kTextArea);
       mainPanel.setBackground(Color.lightGray);
       
       southPanel.add(addButton);
       southPanel.add(removeButton);
       
       pane.add(mainPanel, BorderLayout.CENTER);
       pane.add(southPanel,BorderLayout.SOUTH);
       
       
        
        setTitle("NCAA 14 Depth Chart");
        setSize(1500,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
    
    public void changeChart(PositionLists list){
        
            
        // qbTextArea.setText(list.QB.toString());
            hbTextArea.setText(list.HB.toString());
            fbTextArea.setText(list.FB.toString());
            teTextArea.setText(list.TE.toString());
            wrTextArea.setText(list.WR.toString());
            tTextArea.setText(list.T.toString());
            gTextArea.setText(list.G.toString());
            cTextArea.setText(list.C.toString());
            deTextArea.setText(list.DE.toString());
            dtTextArea.setText(list.DT.toString());
            olbTextArea.setText(list.OLB.toString());
            mlbTextArea.setText(list.MLB.toString());
            cbTextArea.setText(list.CB.toString());
            fsTextArea.setText(list.FS.toString());
            ssTextArea.setText(list.SS.toString());
            pTextArea.setText(list.P.toString());
            kTextArea.setText(list.K.toString());
            repaint();
            validate();
    }
    
    /* public static void main(String args[]) {
        new DepthChartGUI();
        
    }
 
      private class AddButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            name = JOptionPane.showInputDialog("Enter Player's Name:");
            rating =  Integer.parseInt(JOptionPane.showInputDialog("Enter Player's Rating:"));
            do{
            if(rating < 1){
                rating = Integer.parseInt(JOptionPane.showInputDialog("Error, Enter Player's Rating:"));
            } else if (rating > 99){
                rating = Integer.parseInt(JOptionPane.showInputDialog("Error, Enter Player's Rating:"));
            } else badInput = false;
            
            } while(badInput);
            position = JOptionPane.showInputDialog("Enter Player's Position:");
            
            year = JOptionPane.showInputDialog("Enter Player's Year:");
            
            Player x = new Player(name, position, rating, year);
            list.addToList(x);
            
            qbTextArea.setText(list.QB.toString());
            hbTextArea.setText(list.HB.toString());
            fbTextArea.setText(list.FB.toString());
            teTextArea.setText(list.TE.toString());
            wrTextArea.setText(list.WR.toString());
            tTextArea.setText(list.T.toString());
            gTextArea.setText(list.G.toString());
            cTextArea.setText(list.C.toString());
            deTextArea.setText(list.DE.toString());
            dtTextArea.setText(list.DT.toString());
            olbTextArea.setText(list.OLB.toString());
            mlbTextArea.setText(list.MLB.toString());
            cbTextArea.setText(list.CB.toString());
            fsTextArea.setText(list.FS.toString());
            ssTextArea.setText(list.SS.toString());
            pTextArea.setText(list.P.toString());
            kTextArea.setText(list.K.toString());
            
        }
        }
      
      private class RemoveButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            name = JOptionPane.showInputDialog("Enter Player's Name.");
            position = JOptionPane.showInputDialog("Enter Player's Position.");
            
            Player x = new Player();
            x.setName(name);
            x.setPosition(position);
            
            list.removeFromList(x);
                        
            qbTextArea.setText(list.QB.toString());
            hbTextArea.setText(list.HB.toString());
            fbTextArea.setText(list.FB.toString());
            teTextArea.setText(list.TE.toString());
            wrTextArea.setText(list.WR.toString());
            tTextArea.setText(list.T.toString());
            gTextArea.setText(list.G.toString());
            cTextArea.setText(list.C.toString());
            deTextArea.setText(list.DE.toString());
            dtTextArea.setText(list.DT.toString());
            olbTextArea.setText(list.OLB.toString());
            mlbTextArea.setText(list.MLB.toString());
            cbTextArea.setText(list.CB.toString());
            fsTextArea.setText(list.FS.toString());
            ssTextArea.setText(list.SS.toString());
            pTextArea.setText(list.P.toString());
            kTextArea.setText(list.K.toString());
            
            
        }
      } */
}


