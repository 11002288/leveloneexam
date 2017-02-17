import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class level1exam implements ActionListener {
	JButton jb = new JButton();
	JButton button = new JButton();
	JButton b = new JButton();
	JButton bj = new JButton();
public static void main(String[] args) {
	level1exam exam = new level1exam();
}
	public level1exam() {
JFrame jf = new JFrame();
JPanel jp = new JPanel();
jf.setVisible(true);
jf.add(jp);
jp.add(bj);
jp.add(b);
jp.add(jb);
jp.add(button);

jp.add(b);
jb.setBackground(Color.green);
jb.setOpaque(true);
b.setBackground(Color.BLUE);
b.setOpaque(true);
button.setBackground(Color.red);
button.setOpaque(true);
bj.setBackground(Color.yellow);
bj.setOpaque(true);
bj.addActionListener(this);
button.addActionListener(this);
jb.addActionListener(this);
b.addActionListener(this);
jf.pack();

	}
void speak(String words)  {
try{
	Runtime.getRuntime().exec("say" + words);
} catch (IOException e)  {
	
	e.printStackTrace();
}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	JButton color = (JButton) e.getSource();
	if(color==(button)){
	System.out.println("Red");
	}else if (color==(bj)) {
		System.out.println("Yellow");}
		if(color==(jb)){
			System.out.println("Green");
			}else if (color==(b)) {
				System.out.println("blue");
			}
	
}

}
