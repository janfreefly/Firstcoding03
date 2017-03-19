package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jeff24 extends JFrame{
	private JButton open, save, exit;
	private painter painter;
	
	jeff24(){
		// super();
		super("閬����");
		setLayout(new BorderLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		painter = new painter();
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(open); top.add(save); top.add(exit);
		
		add(top, BorderLayout.NORTH);
		add(painter, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new jeff24();
	}

}
