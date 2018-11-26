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

public class Ex1 extends JFrame implements ActionListener {
  private JTextField jtfWeight			= new JTextField(10);
  private JTextField jtfHeight   		= new JTextField(10);
  private JTextField jtfCofficient 	= new JTextField(20);
  private JTextField jtfResult   		= new JTextField(20);
  private JButton jbCompute  			= new JButton("Compute");
																	
  // Main method
  public static void main(String[ ] args) {
    Ex1 frame = new Ex1( );
    frame.pack();
    frame.setTitle("Fat Coefficient");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Ex1( ) {
    // Panel p1 to hold labels and text fields
    //set up the GUI table
    JPanel p1 = new JPanel( );
    p1.setLayout(new GridLayout(4, 2));						
    p1.add(new JLabel("Weight (kg)"));
    p1.add(jtfWeight);											
    p1.add(new JLabel("Height (m)"));
    p1.add(jtfHeight);											
    p1.add(new JLabel("Coefficient, good if 15 to 25"));
    p1.add(jtfCofficient);										
    jtfCofficient.setEditable(false);
    p1.add(new JLabel("Result"));							
    p1.add(jtfResult);
    jtfResult.setEditable(false);								

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
            Double weight = Double.parseDouble(jtfWeight.getText());
            Double height = Double.parseDouble(jtfHeight.getText());
            Double coeffcient = weight/(height*height);             // calculates the fat coeffcient
            jtfCofficient.setText(String.valueOf(coeffcient.toString()));  
            
            //start the if statment to identify the out put result
            if(coeffcient > 25) {
                jtfResult.setText("Too Fat, need to keep fit!");
            } else if(coeffcient < 15) {
                jtfResult.setText("Too Thin, need to keep fat!");
            } else {
                jtfResult.setText("Just fit, keep on!");
            }
        }catch ( NumberFormatException exceptionA ) {
            JOptionPane.showMessageDialog(null ,"Input Number Format Error!");
        }catch ( Exception exceptionE ) {
            JOptionPane.showMessageDialog(null, "Input Error!");
        }
    } // end of if
  } // end of ActionPerformed
}
