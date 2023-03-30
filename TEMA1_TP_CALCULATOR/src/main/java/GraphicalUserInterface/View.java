package GraphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class View extends JFrame{
    private JFrame frame;
    private JLabel t;
    private JLabel p1;
    private JTextField tf1;
    private JLabel p2;
    private JTextField tf2;
    private JLabel p3;
    private JTextField tf3;
    private JLabel q;
    private JLabel r;
    private JTextField tf4;
    private JTextField tf5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton reset;
    private JCheckBox c1;
    private JCheckBox c2;
    public View() {
        {
            frame = new JFrame("Polynom Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 800);

            JPanel title = new JPanel();
            t = new JLabel("Polynomial Calculator");
            t.setFont(new Font("Arial", Font.BOLD, 24));
            title.add(t);
            title.setLayout(new FlowLayout());

            JPanel panel1 = new JPanel();
            p1 = new JLabel("Polynom 1     = ");
            p1.setFont(new Font("Arial", Font.HANGING_BASELINE, 18));
            tf1 = new JTextField(30);
            tf1.setPreferredSize(new Dimension(150,30));
            c1 = new JCheckBox();
            panel1.add(p1);
            panel1.add(tf1);
            panel1.add(c1);
            panel1.setLayout(new FlowLayout());

            JPanel panel2 = new JPanel();
            p2 = new JLabel("Polynom 2     = ");
            p2.setFont(new Font("Arial", Font.HANGING_BASELINE, 18));
            tf2 = new JTextField(30);
            tf2.setPreferredSize(new Dimension(150,30));
            c2 = new JCheckBox();
            panel2.add(p2);
            panel2.add(tf2);
            panel2.add(c2);
            panel2.setLayout(new FlowLayout());

            JPanel panel3 = new JPanel();
            p3 = new JLabel("Result               ");
            p3.setFont(new Font("Arial", Font.HANGING_BASELINE, 18));
            p3.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 0));
            q = new JLabel("Quotient            ");
            q.setFont(new Font("Arial", Font.HANGING_BASELINE, 18));
            q.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 0));
            r = new JLabel("Remainder        ");
            r.setFont(new Font("Arial", Font.HANGING_BASELINE, 18));
            r.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 0));
            panel3.add(p3);
            panel3.add(q);
            panel3.add(r);
            panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));

            JPanel panel4 = new JPanel();
            tf3 = new JTextField(30);
            tf3.setPreferredSize(new Dimension(10,30));
            tf4 = new JTextField(30);
            tf4.setPreferredSize(new Dimension(150,30));
            tf5 = new JTextField(30);
            tf5.setPreferredSize(new Dimension(150,30));
            panel4.add(tf3);
            panel4.add(tf4);
            panel4.add(tf5);
            panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));

            JPanel middle = new JPanel();
            middle.add(panel3);
            middle.add(panel4);
            middle.add(Box.createRigidArea(new Dimension(60,10)));
            middle.setLayout(new BoxLayout(middle,BoxLayout.X_AXIS));

            JPanel buttons = new JPanel();
            button1 = new JButton("Multiplication");
            button1.setPreferredSize(new Dimension(100,50));
            button1.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            buttons.add(button1);

            button2 = new JButton("Division");
            button2.setPreferredSize(new Dimension(100,50));
            button2.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            buttons.add(button2);

            button3 = new JButton("Addition");
            button3.setPreferredSize(new Dimension(100,50));
            button3.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            buttons.add(button3);

            button4 = new JButton("Subtraction");
            button4.setPreferredSize(new Dimension(100,50));
            button4.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            buttons.add(button4);

            button5 = new JButton("Derivation");
            button5.setPreferredSize(new Dimension(100,50));
            button5.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            buttons.add(button5);

            button6 = new JButton("Integration");
            button6.setPreferredSize(new Dimension(100,50));
            button6.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            buttons.add(button6);

            buttons.setLayout(new GridLayout(3,2));

            JPanel panel7 = new JPanel();
            reset = new JButton("Reset");
            reset.setPreferredSize(new Dimension(100,50));
            reset.setFont(new Font("Book Antiqua", Font.BOLD, 20));
            panel7.add(reset);
            panel7.setLayout(new FlowLayout());

            JPanel p = new JPanel();
            p.add(title);
            p.add(panel1);
            p.add(panel2);
            p.add(middle);
            p.add(panel7);
            p.add(buttons);
            p.setLayout(new GridLayout(8,1));

            JPanel finalPanel = new JPanel();
            finalPanel.add(p);
            finalPanel.setLayout(new BoxLayout(finalPanel, BoxLayout.Y_AXIS));

            frame.setContentPane(finalPanel);
            frame.setVisible(true);

            c1.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange()==ItemEvent.SELECTED){
                        c2.setSelected(false);
                    }
                }
            });

            c2.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange()==ItemEvent.SELECTED){
                        c1.setSelected(false);
                    }
                }
            });

        }

    }
    public void addAddition(ActionListener actionListener){
        this.button3.addActionListener(actionListener);
    }

    public void addSubtraction(ActionListener actionListener){
        this.button4.addActionListener(actionListener);
    }

    public void addMultiplication(ActionListener actionListener){
        this.button1.addActionListener(actionListener);
    }

    public void addDivision(ActionListener actionListener){
        this.button2.addActionListener(actionListener);
    }

    public void addDerivation(ActionListener actionListener){
        this.button5.addActionListener(actionListener);
    }

    public void addIntegration(ActionListener actionListener){
        this.button6.addActionListener(actionListener);
    }

    public void addReset(ActionListener actionListener){
        this.reset.addActionListener(actionListener);
    }

    public String getP1Input(){
        return this.tf1.getText();
    }

    public String getP2Input(){
        return this.tf2.getText();
    }

    public void updateResultLabel(String newValue){
        this.tf3.setText(newValue);
    }

    public void updateQuotientLabel(String newValue){
        this.tf4.setText(newValue);
    }

    public void updateRemainderLabel(String newValue){
        this.tf5.setText(newValue);
    }

    public void updateP1Label(String newValue){
        this.tf1.setText(newValue);
    }

    public void updateP2Label(String newValue){
        this.tf2.setText(newValue);
    }

    public void showNumberError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    public boolean getC1State() {
        if (c1.isSelected()) {
            return true;
        }else
            return false;
    }

    public boolean getC2State(){
        if(c2.isSelected()){
            return true;
        }else
            return false;
    }
}
