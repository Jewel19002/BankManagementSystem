
package bank.management.system;



import javax.swing.*;//for import JFrame
import java.awt.*;      // for color package import
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener
{
    
    JTextField pa,aadha;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religio,categor,incom,education,ocupatio; //decleare global
    String formno;
    
    
    SignupTwo(String formno){
        
        this.formno=formno;
        
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2"); //for set title
        
                      
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        additionalDetails.setBounds(290,80,300,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion [] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religio = new JComboBox(valReligion);
        religio.setForeground(Color.BLACK);
        religio.setBackground(Color.WHITE);
        religio.setBounds(300,140,400,30);
        add(religio);
        
               
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory [] = {"General","OBC","SC","ST","Other"};
        categor = new JComboBox(valCategory);
        categor.setBackground(Color.WHITE);
        categor.setFont(new Font("Raleway",Font.BOLD,12));
        categor.setBounds(300,190,400,30);
        add(categor);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String incomeCategory [] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        incom = new JComboBox(incomeCategory);
        incom.setBackground(Color.WHITE);
        incom.setFont(new Font("Raleway",Font.BOLD,12));
        incom.setBounds(300,240,400,30);
        add(incom);
                
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String educationalCategory [] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        education = new JComboBox(educationalCategory);
        education.setBackground(Color.WHITE);
        education.setFont(new Font("Raleway",Font.BOLD,12));
        education.setBounds(300,310,400,30);
        add(education);
        
        JLabel ocupation = new JLabel("Occupation:");
        ocupation.setFont(new Font("Raleway",Font.BOLD,20));
        ocupation.setBounds(100,390,200,30);
        add(ocupation);
        
        String ocupationCategory [] = {"Salaried","Self-Employed","Bussiness","Student","Reyired","Others"};
        ocupatio = new JComboBox(ocupationCategory);
        ocupatio.setBackground(Color.WHITE);
        ocupatio.setFont(new Font("Raleway",Font.BOLD,12));
        ocupatio.setBounds(300,390,400,30);
        add(ocupatio);
        
              
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        pa = new JTextField();
        pa.setFont(new Font("Raleway",Font.BOLD,12));
        pa.setBounds(300,440,400,30);
        add(pa);
        
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        
        aadha = new JTextField();
        aadha.setFont(new Font("Raleway",Font.BOLD,12));
        aadha.setBounds(300,490,400,30);
        add(aadha);
        
        JLabel seniorcityzen = new JLabel("Senior Cityzen:");
        seniorcityzen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcityzen.setBounds(100,540,200,30);
        add(seniorcityzen);
        
        syes = new JRadioButton("Yes"); //for radio button
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
             
        ButtonGroup seniorcityzengroup = new ButtonGroup();
        seniorcityzengroup.add(syes);
        seniorcityzengroup.add(sno);
             
        JLabel exixitingacount = new JLabel("Exisiting Account:");
        exixitingacount.setFont(new Font("Raleway",Font.BOLD,20));
        exixitingacount.setBounds(100,590,200,30);
        add(exixitingacount);
        
        eyes = new JRadioButton("Yes"); //for radio button
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
             
        ButtonGroup existingaccountgroup = new ButtonGroup();
        existingaccountgroup.add(eyes);
        existingaccountgroup.add(eno);
               
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,12));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
       
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
    
    //function override
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String)religio.getSelectedItem(); //get value from Combo Box
        String scategory = (String)categor.getSelectedItem();
        String sincome = (String)incom.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String socupation = (String)ocupatio.getSelectedItem();
        String seniorcityzen = null;
        if(syes.isSelected())
        {
            seniorcityzen = "Yes";
        }else if(sno.isSelected()){
            seniorcityzen = "No";
        }
        
      
        String existingacount = null;
        if(eyes.isSelected())
        {
            existingacount = "Yes";
        }else if(eno.isSelected()){
            existingacount="No";
        }
        
        String span = pa.getText();
        String saadhar = aadha.getText();
              
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+socupation+"','"+span+"','"+saadhar+"','"+seniorcityzen+"','"+existingacount+"')";
                c.s.executeUpdate(query);
                
                //signup 3 object
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);

        }catch(Exception e){
            
            System.out.println(e);
        }
        
        
//        "String'"+variable+"'String"
        
    }
   
   public static void main(String[] args){
       new SignupTwo("");
   }
}
