import java.awt.*;
import javax.swing.*;

public class HourPanel extends JPanel {

	private Color offColour, fstColour, sndColour;

	protected HourPanel(Color offColour, Color fstColour, Color sndColour) {
		this.offColour = offColour;
		this.fstColour = fstColour;
		this.sndColour = sndColour;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int time = LCTS.getTime('h'),
			fst = time / 16,
			snd = time % 16; 
		//BG
		g.setColor(Color.WHITE);
		g.fillOval(0, 0, 200, 200);
		
		//outer
		g.setColor(Color.BLACK);
		g.fillOval(2, 2, 196, 196);
		g.setColor(fstColour);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 47, 41);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 2, 41);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 317, 41);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 272, 41);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 227, 41);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 182, 41);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 137, 41);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 92, 41);

		//inner
		g.setColor(Color.BLACK);
		g.fillOval(35, 35, 130, 130);
		g.setColor(sndColour);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 69, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 47, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 24, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 2, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 339, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 317, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 294, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 272, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 249, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 227, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 204, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 182, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 159, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 137, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 114, 19);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 92, 19);
		
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
