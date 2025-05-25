package bank.management.system;

import javax.swing.*;
import java.awt.*; //import image class
import java.awt.event.*; //import action listner
import java.sql.*; //for ResultSet Object

public class Login extends JFrame implements ActionListener{
    
    JButton login,clear,signup;
    JTextField cardtextfield;
    JPasswordField pintextfield;
    Login()
    {
        setTitle("AUTOMATED TELIER MACHINE");//set title
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg")); //for set Image
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);//for visible the image on from
        l1.setBounds(70,10,100,100);
        add(l1);
        
        JLabel l2 = new JLabel("WELCOME TO ATM"); 
        add(l2);
        l2.setBounds(200,40,400,40);
        l2.setFont(new Font("Onward",Font.BOLD,36));
        
        JLabel cardno = new JLabel("Card No:"); 
        add(cardno);
        cardno.setBounds(120,130,150,40);
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        
        cardtextfield = new JTextField();
        add(cardtextfield);
        cardtextfield.setBounds(300,130,230,40);
        cardtextfield.setFont(new Font("Arial",Font.BOLD,16));
        
        JLabel pin = new JLabel("PIN:"); 
        add(pin);
        pin.setBounds(120,200,150,30);
        pin.setFont(new Font("Raleway",Font.BOLD,26));
        
        pintextfield = new JPasswordField();
        add(pintextfield);
        pintextfield.setBounds(300,200,230,35);
        pintextfield.setFont(new Font("Arial",Font.BOLD,16));
        
        login = new JButton("SIGN IN");
        add(login);
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        
        clear = new JButton("CLEAR");
        add(clear);
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        
        signup = new JButton("SIGN UP");
        add(signup);
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);

        
        getContentPane().setBackground(Color.WHITE); //for frame colur change
        setSize(800,480); //make frame
        setVisible(true); //visible frame to user
        setLocation(350,200); //open location change
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public void actionPerformed(ActionEvent e1)
    {
        if(e1.getSource()== login){
            
            Conn conn = new Conn();
            String cardnumber = cardtextfield.getText();
            String pinnumber = pintextfield.getText();
            
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()){
                    
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
               
            }catch(Exception e){
                    
                    System.out.println(e);
                }
            
           
            
            
        } else if (e1.getSource()== clear){
            cardtextfield.setText("");
            pintextfield.setText("");
        } else if (e1.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String args[])
    {
        new Login();
    }
}
