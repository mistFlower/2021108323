package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Main_class {
	public static void main(String[] args) {
        new Main_class();
    }
	
	public Main_class() {
		JFrame MainFrame = new JFrame("Main A");
		
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = MainFrame.getSize();
		
		//x,y,w,h
		MainFrame.setSize(900, 500);
				
		MainFrame.setLocation((windowSize.width - frameSize.width) / 4, (windowSize.height - frameSize.height) / 4);
		
		//TODO 부모 프레임이 보이도록 설정
		MainFrame.setVisible(true);
		
		//X버튼 클릭시 종료   
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//TODO 부모 프레임 창 크기 고정 실시
		MainFrame.setResizable(false);
		
		Color bg = new Color(69, 69, 69);  
		Color fn = new Color(247, 226, 205);
		
		//TODO 패널 
		JPanel MainPanel = new JPanel();
		JPanel UnionPanel = new JPanel();
		JPanel UnionBlockPanel = new JPanel();
		
		JButton union = new JButton();
		
		MainPanel.setSize(900, 500);
		UnionPanel.setSize(0, 500);
		MainPanel.setBackground(bg);
		UnionBlockPanel.setBackground(bg);
		UnionBlockPanel.setSize(400, 400);
		UnionPanel.add(UnionBlockPanel);
		
		union.setText("유니온");
		union.setBackground(bg);
		union.setForeground(fn); 
		
		union.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new Union();
                MainFrame.setVisible(false); // 창 안보이게 하기 
            }
        });
		MainPanel.add(union);
		MainFrame.setContentPane(MainPanel);
	}
	
	public class Union extends  JFrame{
	    Union(){
	        super("UNION"); //타이틀
	        JPanel jPanel = new JPanel();
	        JPanel LayOutBlock = new JPanel();
	        
	        Color bg = new Color(69, 69, 69);
	        jPanel.setBackground(bg);
	        setSize(900, 500);

	        add(jPanel);

	        Dimension frameSize = getSize();
	        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
	        setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        setVisible(true);
	    }
	}
}
