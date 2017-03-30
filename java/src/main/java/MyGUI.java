import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {

	public MyGUI() {
		super("My GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Button #1!");

		theButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1");
			}
		});

		JButton theButton2 = new JButton("Button #2!");

		theButton2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2");
			}
		});

		JPanel container = new JPanel();

		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS ));
		container.add( theButton );
		container.add( theButton2 );

		JPanel otherContainer = new JPanel();
		otherContainer.setLayout(new BoxLayout(otherContainer, BoxLayout.X_AXIS));
		otherContainer.add(new JButton("A"));
		otherContainer.add(new JButton("B"));
		otherContainer.add(new JButton("C"));

		container.add(otherContainer);
		
		this.add( container );
		this.pack(); // resize so all content is visible and contained
		this.setVisible( true );		
	}

	public static void main(String[] args) {
		new MyGUI(); //create the frame
	}
}