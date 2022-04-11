package Main;

import javax.swing.JFrame;

public class Main_class {

	public static void main(String []args) {
		JFrame MainFrame = new JFrame("Main A");
		MainFrame.setBounds(0, 0, 900, 500);//x,y,w,h
		MainFrame.setVisible(true);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//X버튼 클릭시 종료
		
		
	}
}
