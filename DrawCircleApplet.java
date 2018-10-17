import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JTextField;

public class DrawCircleApplet 
{
	
	public static void main(String[] args) 
	{
		
		
		
	}
	
	public DrawCircleApplet()
	{
		
		JButton drawButton = new JButton("draw");
		
		class DrawButtonListener implements ActionListener
		{
			
			public void actionPerformed(ActionEvent event)
			{
				double x = Double.parseDouble(xCenter.getText());
				double y = Double.parseDouble(yCenter.getText());
				double r = Double.parseDouble(radius.getText());
				
				circle.setFrame(x-r, y-r, r*2, r*2);
				repaint();
				
			}
			
			
			
		}
		
		ActionListener listener = new DrawButtonListener();
		drawButton.addActionListener(listener);
		
	}
	
	public void paint(Graphics g)
	{
		
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
	}
	
	Ellipse2D circle;
	
	final JTextField xCenter = new JTextField();
	final JTextField yCenter = new JTextField();
	final JTextField radius = new JTextField();
	
}
