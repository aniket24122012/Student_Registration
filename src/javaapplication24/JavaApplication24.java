/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author HP
 */
public class JavaApplication24 {
    static JLabel gender_label;
static JLabel dob_label;
   static JLabel name_label;
   static JLabel name_label1;
    static JTextField name_tf;
    static JLabel mobile_label;
  static JTextField mobile_tf;
  static JComboBox day;
  static JComboBox month;
  static JComboBox year;
  static JRadioButton male;
    static JRadioButton female;
  static JTextArea add_ta;
  static JCheckBox tandc;
  static JButton submit;
  static JTextArea output;
  static    JLabel add_label;
    public static void main(String[] args) {
        JFrame frame=new JFrame("Registeration");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,740,500);
        
        Container cntr=frame.getContentPane();
        cntr.setLayout(null);
        cntr.setBackground(Color.yellow);
        
        
        name_label1 =new JLabel("Registeration From");
        cntr.add(name_label1);
        name_label1.setBounds(700,2,200,50);
           
        
        name_label =new JLabel("Name");
        cntr.add(name_label);
        name_label.setBounds(50, 50, 60, 30);
        
        name_tf=new JTextField();
        name_tf.setBounds(150, 50, 150, 25);
        cntr.add(name_tf);
        
     mobile_label=new JLabel("Mobile");
        mobile_label.setBounds(50, 50, 60, 30);
       
        
        mobile_tf=new JTextField();
        mobile_label.setBounds(50, 100, 60, 30);
        
        mobile_tf=new JTextField();
        mobile_tf.setBounds(150, 100,150, 25);
        
        cntr.add(mobile_label);
        cntr.add(mobile_tf);
        
  dob_label=new JLabel("DOB");
        dob_label.setBounds(50, 150, 60, 30);
        cntr.add(dob_label);
        
        
        
        String[] day_arr=new String[31];
        for(int i=1;i<=31;i++)
            day_arr[i-1]=Integer.toString(i);
        day=new JComboBox(day_arr);
        day.setBounds(150, 150, 50, 25);
        cntr.add(day);
        
        String[] month_arr= {"jan","feb","mar","apr","may","july","aug"};
                month=new JComboBox(month_arr);
                month.setBounds(220,150,70,25);
                cntr.add(month);
                
                String[] year_arr=new String[70];
                for(int  i=1951;i<2020;i++)
                    year_arr[i-1951]=Integer.toString(i);
                year=new JComboBox(year_arr);
                year.setBounds(320,150,70,25);
                cntr.add(year);
                
                gender_label=new JLabel("Gender");
                gender_label.setBounds(50,200,60,30);
                
                male=new JRadioButton("Male");
                male.setBounds(150, 200, 80, 30);
                
                female=new JRadioButton("Female");
                female.setBounds(240, 200, 80, 30);
                
        ButtonGroup gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);
         
        cntr.add(gender_label);
        cntr.add(male);
        cntr.add(female);
        
        
         add_label=new JLabel("address");
         add_label.setBounds(50, 250, 60, 30);
         cntr.add(add_label);
         add_ta=new JTextArea();
         add_ta.setBounds(150, 250, 350, 50);
      cntr.add(add_ta);
         tandc=new JCheckBox("I am accept all terms and condition");
         tandc.setBounds(50, 320, 250, 25);
         cntr.add(tandc);
         submit=new JButton("Submit");
         submit.setBounds(100, 355, 80, 40);
         
         submit.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent event)
             {
                 submit_action(event);
             }
         });
         cntr.add(submit);
         output=new JTextArea();
         output.setBounds(600, 50, 300, 350);
         cntr.add(output);
    }
    public static void submit_action(ActionEvent event)
    {
        if(tandc.isSelected()==true)
        {
            String name=name_tf.getText();
            String mobile=mobile_tf.getText();
            String day_name=(String)day.getSelectedItem();
            String month_name=(String)month.getSelectedItem();
            String year_name=(String)year.getSelectedItem();
            String gen="Male";
            if(female.isSelected())
                gen="Female";
            String address=add_ta.getText();
            output.setText("Name :"+name+
                    "\nMobile :"+mobile+
                    "\nDOB :"+day_name+"/"+month_name+"/"+year_name+
                    "\nGender :"+gen+
                    "\nAddress :"+address);
            
      }
        else
        {
            output.setText("please accept term and condition");
        }
        
    }
    
}
