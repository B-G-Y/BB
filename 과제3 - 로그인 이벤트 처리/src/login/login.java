/*
 * <����> 11���� ���Ǹ� �����ؾ� ������ �ۼ��� �� �ֽ��ϴ�.
 * ID�� PW�� �Է¹޾� �̸� ����ϴ� Swing ���α׷� �ۼ��ϱ�
 * - �Է� �� ����Ű�� ġ�ų�,
 * - "�α���" ��ư�� Ŭ���ϸ� �̺�Ʈ�� ó���ǰ� ��

 * 
 * �̺�Ʈ ó�� ��� - ���ٽ� �̿��ϴ� ��� p.463
 * 
 */

package login;

import java.awt.Color;
import javax.swing.*;


class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setSize(400, 340);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�α��� �̺�Ʈ ó�� ����");
		this.setLayout(null);
		
		JLabel d = new JLabel("   | ����Ʈ LMS");    // id/pw �Է��ض�
		d.setFont(d.getFont().deriveFont(23.0f));
		d.setBounds(20, 20, 340, 40);
		this.add(d);
		
		JLabel box = new JLabel("���̵�/��й�ȣ �α���");    // id/pw �Է��ض�
		box.setFont(box.getFont().deriveFont(17.0f));
		box.setBounds(20, 60, 340, 40);
		this.add(box);
		
		JTextField id = new JTextField();             // id �Է�ĭ
		id.setBounds(20, 105, 340, 40);
		this.add(id); 
		
		JPasswordField pw= new JPasswordField();      // pw �Է�ĭ - ����ڰ� �Է��ϴ� ������ ������ �ʵ��� password�ʵ�
		pw.setBounds(20, 150, 340, 40);
		this.add(pw);
		
		JButton b = new JButton("�α���");              // �α��� ��ư
		b.setFont(b.getFont().deriveFont(17.0f));
		b.setBounds(20, 195, 340, 50);
		b.setBackground(new Color(2,160,140));
		this.add(b);
		
		JLabel view = new JLabel();                   // ���â
		view.setFont(view.getFont().deriveFont(15.0f));
		view.setBounds(20, 260, 340, 30);
		this.add(view);
		
		pw.addActionListener( (e) -> {   // pw�Է�ĭ���� ���� Ŭ���� �̺�Ʈ ó�� : ���ٽ�
			String result= "ID  :  " + id.getText() + "       PW  :  " + new String(pw.getPassword());
			view.setText(result);
		});
		
		b.addActionListener( (e) -> {    // �α��� ��ư Ŭ���� �̺�Ʈ ó�� : ���ٽ�
			String result= "ID  :  " + id.getText() + "       PW  :  " + new String(pw.getPassword());
			view.setText(result);
		});
		 
		
		//������ ��ü�� �ѹ��� 
		this.setVisible(true);
	}
}

public class login{
	public static void main(String args[]) {
		MyFrame t = new MyFrame();
	}
}
