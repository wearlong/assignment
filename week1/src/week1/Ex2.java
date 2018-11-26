/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author chpeter868
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;											

public class Ex2 extends JFrame implements ActionListener {
  private JTextField jtTC			= new JTextField(10);
  private JTextField jtHDLC                	= new JTextField(10);
  private JTextField jtTG                       = new JTextField(10);
  private JTextField jtLDLC                     = new JTextField(20);
  private JButton jbCompute  			= new JButton("Compute");
																	
  // Main method
  public static void main(String[ ] args) {
    Ex2 frame = new Ex2( );
    frame.pack();
    frame.setTitle("LDL Cholesterol");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Ex2( ) {
    // Panel p1 to hold labels and text fields
    //set up the GUI table
    JPanel p1 = new JPanel( );
    p1.setLayout(new GridLayout(4, 2));						
    p1.add(new JLabel("Total Cholesterol (TC)"));
    p1.add(jtTC);										
    p1.add(new JLabel("HDL cholesterol (HDLC)"));
    p1.add(jtHDLC);		
    p1.add(new JLabel("triglyceride (TG)"));
    p1.add(jtTG);	
    p1.add(new JLabel("LDL Cholesterol"));
    p1.add(jtLDLC);										
    jtLDLC.setEditable(false);
								

    // Add p1 to the frame
    this.getContentPane().setLayout(new BorderLayout());
    this.getContentPane().add(p1,BorderLayout.CENTER);	
    this.getContentPane().add(jbCompute,BorderLayout.SOUTH);

    // Register listenerS
    jbCompute.addActionListener(this);
    
  }
  
 

  public void actionPerformed(ActionEvent e) {				
    if (e.getSource() == jbCompute) {						
        //set up the event of the button
        try {
            Double TC = Double.parseDouble(jtTC.getText());
            Double HDLC = Double.parseDouble(jtHDLC.getText());
            Double TG = Double.parseDouble(jtTG.getText());
            Double LDLC = TC-HDLC-(TG/5); 
            jtLDLC.setText(String.valueOf(LDLC.toString()));
        }catch ( NumberFormatException exceptionA ) {
            JOptionPane.showMessageDialog(null ,"Input Number Format Error!");
        }catch ( Exception exceptionE ) {
            JOptionPane.showMessageDialog(null, "Input Error!");
        }

    } // end of if
  } // end of ActionPerformed
} 

