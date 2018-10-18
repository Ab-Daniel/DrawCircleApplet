import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrawCircleApplet  extends JApplet
{
	
	public static void main(String[] args) 
	{
		
		JPanel controlPanel = new JPanel();
		
		controlPanel.add(xCenter);
		controlPanel.add(yCenter);
		controlPanel.add(radius);
		
		JLabel xLabel = new JLabel("xCenter = ");
		JLabel yLabel = new JLabel("yCenter = ");
		JLabel radius = new JLabel("radius = ");
		
		JFrame controlFrame = new JFrame();
		
		controlFrame.add(controlPanel);
		controlFrame.pack();
		
		
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
		g2.draw(circle);
		
	}
	
	Ellipse2D circle;
	
	final static JTextField xCenter = new JTextField();
	final static JTextField yCenter = new JTextField();
	final static JTextField radius = new JTextField();
	
}
