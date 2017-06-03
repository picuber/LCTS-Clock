import java.awt.*;
import javax.swing.*;

public class SecondPanel extends JPanel {

	private Color offColour, fstColour, sndColour;

	protected SecondPanel(Color offColour, Color fstColour, Color sndColour) {
		this.offColour = offColour;
		this.fstColour = fstColour;
		this.sndColour = sndColour;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int time = LCTS.getTime('s'),
			fst = time / 5,
			snd = time % 5; 
		//BG
		g.setColor(Color.WHITE);
		g.fillOval(0, 0, 200, 200);
		
		//outer
		g.setColor(Color.BLACK);
		g.fillOval(2, 2, 196, 196);
		g.setColor(fstColour);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 20, 68);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 308, 68);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 236, 68);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 164, 68);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 92, 68);

		//inner
		g.setColor(Color.BLACK);
		g.fillOval(35, 35, 130, 130);
		g.setColor(sndColour);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 20, 68);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 308, 68);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 236, 68);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 164, 68);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 92, 68);
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
