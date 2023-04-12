import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class frmLogin extends JFrame {
	JButton btnCan, btnOk;
	JLabel hn, hn1, lg, un, pa;
	JTextField txtun;
	JPasswordField txtpa;

	public frmLogin() {
		Container cont = new Container();
		getContentPane();
		setLayout(new BorderLayout());

		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);

		// adding the label
		hn = new JLabel("kharade Hospital");
		hn.setBounds(260, 0, 600, 100);
		hn.setForeground(Color.red);
		hn.setFont(new Font("Times New Roman", Font.BOLD, 30));
		cont.add(hn);

		hn1 = new JLabel("( Maternity Home )");
		hn1.setBounds(392, 25, 600, 100);
		hn1.setForeground(Color.blue);
		hn1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cont.add(hn1);

		lg = new JLabel("Login");
		lg.setBounds(350, 100, 600, 100);
		lg.setForeground(Color.black);
		lg.setFont(new Font("Times New Roman", Font.BOLD, 30));
		cont.add(lg);

		un = new JLabel("User Name:");
		un.setBounds(250, 200, 600, 100);
		un.setForeground(Color.darkGray);
		un.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cont.add(un);

		pa = new JLabel("Password:");
		pa.setBounds(250, 270, 600, 100);
		pa.setForeground(Color.darkGray);
		pa.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cont.add(pa);

		// adding TextField

		txtun = new JTextField();
		txtun.setBounds(400, 240, 120, 30);
		cont.add(txtun);

		txtpa = new JPasswordField();
		txtpa.setBounds(400, 305, 120, 30);
		cont.add(txtpa);

		// Button

		btnOk = new JButton("Ok");
		btnOk.setBounds(500, 470, 100, 40);
		btnOk.setVisible(true);
		btnOk.setEnabled(true);
		btnOk.addActionListener(new MyActionListener());
		cont.add(btnOk);

		btnCan = new JButton("Cancel");
		btnCan.setBounds(600, 470, 100, 40);
		btnCan.setVisible(true);
		btnCan.setEnabled(true);
		btnCan.addActionListener(new MyActionListener());
		cont.add(btnCan);

		getContentPane().add(cont);
		setTitle("Login");
		setSize(800, 600);
		// setResizable(false);
		setVisible(true);

	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "Ok") {
				try {
					if (check_login(txtun.getText(), String.valueOf(txtpa.getPassword()))) {
						hide();
						MainFrame mf = new MainFrame();
					} else {
						msgbox mb = new msgbox("Login Unsuccessful  Please Check User name and Password", "Exception",
								null);
					}
				} catch (Exception e2) {
					msgbox mb = new msgbox(e2.toString(), "Exception", null);
				}
			} else if (e.getActionCommand() == "Cancel") {
				HomePage hp = new HomePage();
			}
		}
	}

	public boolean check_login(String uname, String passwd) throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:hosp");
		PreparedStatement st = con.prepareStatement("Select passwd from Login where Login_name = '" + uname + "';");
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			if (passwd.equals(rs.getString(1))) {
				con.close();
				return true;
			}
		}
		con.close();
		return false;
	}

}
