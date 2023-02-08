import java.awt.*;
import java.awt.event.*;
class AWTExample2
{
    TextField name,pass;
     Button b1,b2;
     Label msg;
     Label l1;
     Label l2;
     Frame f;
     AWTExample2()
    {
       f = new Frame();
       l1= new Label("User Name",Label.CENTER);
        l2= new Label("Password",Label.CENTER);
        name=new TextField(20);
        pass=new TextField(20);
        msg = new Label("");                         
        pass.setEchoChar('*');
        name = new TextField();
        pass= new TextField();
        b1 = new Button("Submit");
        b1.setBackground(Color.yellow);
        b1.addActionListener(new ActionListener() {    
        public void actionPerformed (ActionEvent e) {    
        
        String n=name.getText();
        String p=pass.getText();
       if(n.equals("Saif@123")&&p.equals("123456"))
     {
       Frame f1 = new Frame();
       f1.setSize(400,400);
       f1.setBackground(Color.blue);
       Button btn=new Button("Logout");
       f1.add(btn);
       btn.setBounds(130,160,80,40);
       btn.setBackground(Color.red);
       f1.setLayout(null);
       f1.setVisible(true); 
       f.setVisible(false); 

       btn.addActionListener(new ActionListener() {    
       public void actionPerformed (ActionEvent e) {    
       f.setVisible(true); 
       f.setSize(400,400);
       f1.setVisible(false);  
        }    
        });  
    }
    else 
     {
        msg.setText("Invald Password");
        name.setText("");
        pass.setText("");
     }    
        }    
        });  
        b2 = new Button("Cancel");
         b2.setBackground(Color.yellow);
         l1.setBounds(90,125,90,20);
         l2.setBounds(90,150,90,60);
         b1.setBounds(100,260,70,40);
         b2.setBounds(210,260,70,40);
         name.setBounds(180,120,80,30);
         name.setBackground(Color.green);
         pass.setBounds(180,170,80,30);
         pass.setBackground(Color.green);
         f.add(l1);
         f.add(name);
         f.add(l2);
         f.add(pass);
         f.add(b1);
         f.add(b2);
         f.add(msg);
         msg.setBounds(90,200,110,80);
         f.add(name);
         f.add(pass);
         f.setSize(400,400);

         f.setTitle("My New Loging Page");
         f.setLayout(null);
         f.setVisible(true);
    }
    public static void main(String args[])
     {
         AWTExample2 obj = new AWTExample2();
     }
}