import java.awt.*;
import java.awt.event.*;


class calc extends Frame implements ActionListener {
    TextField f1, f2, f3;
    Button b1, b2,b3,b4,b5;

    calc() {
        f1 = new TextField(" first number");
        f1.setBounds(50, 50, 150, 20);
        f2 = new TextField(" second number");
        f2.setBounds(50, 100, 150, 20);
        f3 = new TextField();
        f3.setBounds(50, 150, 150, 20);
        f3.setEditable(false);
        b1 = new Button("+");
        b1.setBounds(50, 200, 50, 50);
        b2 = new Button("-");
        b2.setBounds(120, 200, 50, 50);
        b3= new Button("X");
        b3.setBounds(50,250,50,50);
        b4= new Button("/");
        b4.setBounds(120,250,50,50);
        b5 = new Button("Clear");
        b5.setBounds(50,300,700,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        add(f1);
        add(f2);
        add(f3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String s1= f1.getText();
        String s2 =f2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c= a+b;
        }
        else if(e.getSource()==b2){
              c= a-b;
        }
        else if(e.getSource()==b3){
            c=a*b;
        }
        else if(e.getSource()==b4){
            c=a/b;
        }
        else if(e.getSource()==b5){
            c=0;
        }
        String result = String.valueOf(c);
        f3.setText(result);
    }
    public static void main(String[] args) {
       new calc();
    }
}
