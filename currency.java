package currency;

import java.awt.*;

import java.awt.event.*;

public class firstApplication implements WindowListener, ActionListener

{

private Frame a;

private Panel b;

private TextField t;

private TextField t2;

private Button d;

private Button d2;

private Label c; 

private Label c2;

public firstApplication()

{

a = new Frame();

b = new Panel();

d = new Button("to USD");

d2 = new Button("to TRY");

t = new TextField(30);

t2 = new TextField(30);

c = new Label("TRY");

c2 = new Label("USD");

b.add(c);

b.add(t);

b.add(d);

b.add(c2);

b.add(t2);

b.add(d2);

b.setBackground(Color.blue);

a.add(b);

d.addActionListener(this);

d2.addActionListener(this);

a.addWindowListener(this);

a.pack();

a.setSize(400,200);

a.setResizable(false);

a.setVisible(true);

}

public static void main(String args[])

{

firstApplication uygulama = new firstApplication();

}

public void actionPerformed(ActionEvent e)

{
	String s = e.getActionCommand();
    if(s.equals("to USD")){
        String s1 = t.getText();
         double USD = Double.valueOf(s1);
         if(USD >= 0) {
        	   double TRY = USD/31;
               t2.setText(String.valueOf(TRY));
         }
         else {
        	 t2.setText("Value is not valid.");
         }
    }
    else if(s.equals("to TRY")){
        String s2 = t2.getText();
        double TRY = Double.valueOf(s2);
        if(TRY >= 0) {
        	   double USD = TRY*31;
               t.setText(String.valueOf(USD));
        }
        else {
       	 t.setText("Value is not valid.");
        }
    }
}

public void windowOpened(WindowEvent e) {}

public void windowClosing(WindowEvent e)

{

System.exit(0);

}

public void windowClosed(WindowEvent e) {}

public void windowIconified(WindowEvent e) {}

public void windowDeiconified(WindowEvent e) {}

public void windowActivated(WindowEvent e) {}

public void windowDeactivated(WindowEvent e) {}

}
