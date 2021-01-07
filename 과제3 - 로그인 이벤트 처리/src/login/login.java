/*
 * <참고> 11주차 강의를 수강해야 과제를 작성할 수 있습니다.
 * ID와 PW를 입력받아 이를 출력하는 Swing 프로그램 작성하기
 * - 입력 후 엔터키를 치거나,
 * - "로그인" 버튼을 클릭하면 이벤트가 처리되게 함

 * 
 * 이벤트 처리 방법 - 람다식 이용하는 방법 p.463
 * 
 */

package login;

import java.awt.Color;
import javax.swing.*;


class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setSize(400, 340);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("로그인 이벤트 처리 과제");
		this.setLayout(null);
		
		JLabel d = new JLabel("   | 스마트 LMS");    // id/pw 입력해라
		d.setFont(d.getFont().deriveFont(23.0f));
		d.setBounds(20, 20, 340, 40);
		this.add(d);
		
		JLabel box = new JLabel("아이디/비밀번호 로그인");    // id/pw 입력해라
		box.setFont(box.getFont().deriveFont(17.0f));
		box.setBounds(20, 60, 340, 40);
		this.add(box);
		
		JTextField id = new JTextField();             // id 입력칸
		id.setBounds(20, 105, 340, 40);
		this.add(id); 
		
		JPasswordField pw= new JPasswordField();      // pw 입력칸 - 사용자가 입력하는 내용이 보이지 않도록 password필드
		pw.setBounds(20, 150, 340, 40);
		this.add(pw);
		
		JButton b = new JButton("로그인");              // 로그인 버튼
		b.setFont(b.getFont().deriveFont(17.0f));
		b.setBounds(20, 195, 340, 50);
		b.setBackground(new Color(2,160,140));
		this.add(b);
		
		JLabel view = new JLabel();                   // 출력창
		view.setFont(view.getFont().deriveFont(15.0f));
		view.setBounds(20, 260, 340, 30);
		this.add(view);
		
		pw.addActionListener( (e) -> {   // pw입력칸에서 엔터 클릭시 이벤트 처리 : 람다식
			String result= "ID  :  " + id.getText() + "       PW  :  " + new String(pw.getPassword());
			view.setText(result);
		});
		
		b.addActionListener( (e) -> {    // 로그인 버튼 클릭시 이벤트 처리 : 람다식
			String result= "ID  :  " + id.getText() + "       PW  :  " + new String(pw.getPassword());
			view.setText(result);
		});
		 
		
		//별도의 객체로 한번만 
		this.setVisible(true);
	}
}

public class login{
	public static void main(String args[]) {
		MyFrame t = new MyFrame();
	}
}
