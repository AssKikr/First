--------------------------------------------------------------------------------------------------------------------------------
$Factorial$
--------------------------------------------------------------------------------------------------------------------------------
  package Fact;
  import javax.swing.JOptionPane;
//or could use -->  import javax.swing.*;
 public class Fact
 {
 static void Factorial()
    { 
        int i, no, fact=1;
        no=Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
        for(i=1;i<=no;i++)
        {
          fact=fact*i;    
        }
  JOptionPane.showMessageDialog(null,fact);
    }
    public static void main(String args[]) 
    {
    Factorial();
    }
}

--------------------------------------------------------------------------------------------------------------------------------
$Palindrone$
--------------------------------------------------------------------------------------------------------------------------------
 package Palin;
 import javax.swing.JOptionPane;
public class Palin
 {
 static void Palindrone()
    {                                         
        int a,b, c, d = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
        b=a;
        while (a > 0) 
        {
            c = a % 10;
            a = a / 10;
            d = (d * 10) + c;
        }
        if(d==b)
        JOptionPane.showMessageDialog(null, "It is a Palindrone Number"); 
        else
        JOptionPane.showMessageDialog(null, "It is not a Palindrone Number");
    }
    public static void main(String args[]) 
    {
    Palindrone();
    }
}
