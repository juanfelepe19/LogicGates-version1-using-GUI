import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LogicGatesV1 extends JFrame implements ActionListener{
   
   JLabel lnum1, lnum2, lres;
   JTextField tnum1, tnum2, tres;
   JButton bAnd, bOr, bNor, bNand, bXor, bXnor;
   JPanel p1, p2;
   Container c = getContentPane();
   
   LogicGatesV1() //constructor serves as 1. GUI Components
   {
      super("Logic Gates v1");
      lnum1 = new JLabel("Input A: ");
      lnum2 = new JLabel("Input B: ");
      lres = new JLabel("Result: ");
      
      tnum1 = new JTextField(5);
      tnum2 = new JTextField(5);
      tres = new JTextField(5); tres.setEditable(false);
      
      bAnd = new JButton("AND"); bAnd.addActionListener(this);
      bOr = new JButton("OR"); bOr.addActionListener(this);
      bNand = new JButton("NAND"); bNand.addActionListener(this);
      bNor = new JButton("NOR"); bNor.addActionListener(this);
      bXor = new JButton("XOR"); bXor.addActionListener(this);
      bXnor = new JButton("XNOR"); bXnor.addActionListener(this);
      
      p1 = new JPanel(); p1.setLayout(new GridLayout(3,2));
      p1.add(lnum1); p1.add(tnum1);
      p1.add(lnum2); p1.add(tnum2);
      p1.add(lres); p1.add(tres);
      
      p2 = new JPanel(); p2.setLayout(new GridLayout(2,3));
      p2.add(bAnd); p2.add(bOr); p2.add(bNand); 
      p2.add(bNor); p2.add(bXor); p2.add(bXnor);
      
      c.setLayout(new BorderLayout());
      c.add(p1, BorderLayout.CENTER);
      c.add(p2, BorderLayout.SOUTH);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 200);
      setResizable(false);
   }
   
   public void actionPerformed(ActionEvent e){
      int num1 =0, num2=0;
      boolean res=false;

      try
      {
         
         num1 = Integer.parseInt(tnum1.getText());
         num2 = Integer.parseInt(tnum2.getText());
         
         if(e.getSource()==bAnd)
         {
            res = and(num1, num2);
         }
         else
         if(e.getSource()==bOr)
         {
            res = or(num1, num2);
         }
         else
         if(e.getSource()==bNand)
         {
            res = nAnd(num1, num2);
         }
         else
         if(e.getSource()==bNor)
         {
            res = nor(num1, num2);
         }
         else
         if(e.getSource()==bXor)
         {
            res = xOr(num1, num2);
         }
         else
         if(e.getSource()==bXnor)
         {
            res = xNor(num1, num2);
         }
         tres.setText(res+"");
      }

      catch(NumberFormatException nfe)
      {
         tres.setText("Boang ka!");
      }
   }
   //3. Application Methods
   public boolean and(int num1, int num2)
   {
      if(num1==1&&num2==1)
      return true;
      else if(num1==0&&num2==1)
      return false;
      else if(num1==1&&num2==0)
      return false;
      else if(num1==0&&num2==0)
      return false;
      else
      return false;
   }
   public boolean or(int num1, int num2)
   {
      if(num1==1&&num2==1)
      return true;
      else if(num1==0&&num2==1)
      return true;
      else if(num1==1&&num2==0)
      return true;
      else if(num1==0&&num2==0)
      return false;
      else
      return false;
   }
   public boolean nAnd(int num1, int num2)
   {
      if(num1==1&&num2==1)
      return false;
      else if(num1==0&&num2==1)
      return true;
      else if(num1==1&&num2==0)
      return true;
      else if(num1==0&&num2==0)
      return true;
      else
      return false;
   }
   public boolean nor(int num1, int num2)
   {
      if(num1==1&&num2==1)
      return false;
      else if(num1==0&&num2==1)
      return false;
      else if(num1==1&&num2==0)
      return false;
      else if(num1==0&&num2==0)
      return true;
      else
      return false;
   }
   public boolean xOr(int num1, int num2)
   {
      if(num1==1&&num2==1)
      return false;
      else if(num1==0&&num2==1)
      return true;
      else if(num1==1&&num2==0)
      return true;
      else if(num1==0&&num2==0)
      return false;
      else
      return false;
   }
   public boolean xNor(int num1, int num2)
   {
      if(num1==1&&num2==1)
      return true;
      else if(num1==0&&num2==1)
      return false;
      else if(num1==1&&num2==0)
      return false;
      else if(num1==0&&num2==0)
      return true;
      else
      return false;
   }
 
}

//--------------------------------------------
public class LogicGatesDemo
{
   public static void main(String args[])
   {
      LogicGatesV1 calc = new LogicGatesV1();
      calc.setVisible(true); //calc.show();
   }
}