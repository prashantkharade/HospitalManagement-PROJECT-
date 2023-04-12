import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame
        implements ActionListener {

    public HomePage() {
        Container container = new Container();
        getContentPane();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(0);
        hn = new JLabel("KHARADE HOSPITAL");
        hn.setBounds(500, 0, 1000, 300);
        hn.setForeground(Color.red);
        hn.setFont(new Font("Times New Roman", 1, 50));
        container.add(hn);
        hn1 = new JLabel("( General & Maternity Home )");
        hn1.setBounds(600, 150, 600, 100);
        hn1.setForeground(Color.darkGray);
        hn1.setFont(new Font("Times New Roman", 1, 20));
        container.add(hn1);
        dn = new JLabel("Dr. Prashant kharade");
        dn.setBounds(900, 200, 600, 100);
        dn.setFont(new Font("Monotype Corsiva", 1, 25));
        container.add(dn);
        ql = new JLabel("M.B.B.S (Neuro)");
        ql.setForeground(Color.blue);
        ql.setBounds(900, 220, 600, 100);
        ql.setFont(new Font("Arial", 1, 14));
        container.add(ql);
        ql1 = new JLabel("(Neurology & Nephrology)");
        ql1.setForeground(Color.blue);
        ql1.setBounds(900, 240, 600, 100);
        ql1.setFont(new Font("Arial", 1, 14));
        container.add(ql1);
        fa = new JLabel("Facilities :");
        fa.setForeground(Color.black);
        fa.setBounds(100, 250, 600, 100);
        fa.setFont(new Font("Georgia", 1, 25));
        container.add(fa);
        fa1 = new JLabel("1. 24 Hours Emergency Service");
        fa1.setForeground(Color.darkGray);
        fa1.setBounds(100, 300, 600, 100);
        fa1.setFont(new Font("Arial", 1, 16));
        container.add(fa1);
        fa2 = new JLabel("2. Ultrasonography(2D & 3D)");
        fa2.setForeground(Color.darkGray);
        fa2.setBounds(100, 320, 600, 100);
        fa2.setFont(new Font("Arial", 1, 16));
        container.add(fa2);
        fa3 = new JLabel("3. X-ray");
        fa3.setForeground(Color.darkGray);
        fa3.setBounds(100, 340, 600, 100);
        fa3.setFont(new Font("Arial", 1, 16));
        container.add(fa3);
        fa4 = new JLabel("4. Operation Theater");
        fa4.setForeground(Color.darkGray);
        fa4.setBounds(100, 360, 600, 100);
        fa4.setFont(new Font("Arial", 1, 16));
        container.add(fa4);
        fa5 = new JLabel("5. Infertility Clinic");
        fa5.setForeground(Color.darkGray);
        fa5.setBounds(100, 380, 600, 100);
        fa5.setFont(new Font("Arial", 1, 16));
        container.add(fa5);
        fa6 = new JLabel("6. Laproscopy");
        fa6.setForeground(Color.darkGray);
        fa6.setBounds(100, 400, 600, 100);
        fa6.setFont(new Font("Arial", 1, 16));
        container.add(fa6);
        a1 = new JLabel("Address :");
        a1.setForeground(Color.black);
        a1.setBounds(1000, 420, 600, 100);
        a1.setFont(new Font("Georgia", 1, 20));
        container.add(a1);
        a1 = new JLabel("At post RALEGAN(MHASOBA),");
        a1.setForeground(Color.blue);
        a1.setBounds(1000, 440, 600, 100);
        a1.setFont(new Font("Arial", 1, 14));
        container.add(a1);

        a1 = new JLabel("Tal-Nagar,Dist-Ahmednagar,");
        a1.setForeground(Color.blue);
        a1.setBounds(1000, 460, 600, 100);
        a1.setFont(new Font("Arial", 1, 14));
        container.add(a1);

        a3 = new JLabel("Maharashtra-414101");
        a3.setForeground(Color.blue);
        a3.setBounds(1000, 480, 600, 100);
        a3.setFont(new Font("Arial", 1, 14));
        container.add(a3);
        a4 = new JLabel("Phone No: +91 7058965015");
        a4.setForeground(Color.blue);
        a4.setBounds(1000, 500, 600, 100);
        a4.setFont(new Font("Arial", 1, 14));
        container.add(a4);
        cmdNext = new JButton("Next");
        cmdNext.setBounds(500, 700, 300, 50);
        cmdNext.setVisible(true);
        cmdNext.setEnabled(true);
        cmdNext.addActionListener(this);
        container.add(cmdNext);
        cmdExit = new JButton("Exit");
        cmdExit.setBounds(800, 700, 300, 50);
        cmdExit.setVisible(true);
        cmdExit.setEnabled(true);
        cmdExit.addActionListener(this);
        container.add(cmdExit);
        getContentPane().add(container);
        setBounds(0, 0, 1600, 1000);
        setResizable(true);
        setTitle("Home Page");
        setVisible(true);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent windowevent) {
                System.exit(0);
                Exit_Frame exit_frame = new Exit_Frame();
            }

            final HomePage this$0;

            {
                this$0 = HomePage.this;

            }
        });
    }

    public void actionPerformed(ActionEvent actionevent) {
        Exit_Frame exit_frame;
        if (actionevent.getActionCommand() == "Next") {
            frmLogin frmlogin = new frmLogin();
            dispose();
        } else if (actionevent.getActionCommand() == "Exit")
            exit_frame = new Exit_Frame();
    }

    public static void main(String args[]) {
        HomePage homepage = new HomePage();
    }

    JLabel hn;
    JLabel hn1;
    JLabel dn;
    JLabel ql;
    JLabel ql1;
    JLabel fa;
    JLabel fa1;
    JLabel fa2;
    JLabel fa3;
    JLabel fa4;
    JLabel fa5;
    JLabel fa6;
    JLabel a1;
    JLabel a2;
    JLabel a3;
    JLabel a4;

    JButton cmdNext;
    JButton cmdExit;
}
