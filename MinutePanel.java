import java.awt.*;
import javax.swing.*;

public class MinutePanel extends JPanel {

	private Color offColour, fstColour, sndColour;

	protected MinutePanel(Color offColour, Color fstColour, Color sndColour) {
		this.offColour = offColour;
		this.fstColour = fstColour;
		this.sndColour = sndColour;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int time = LCTS.getTime('m'),
			fst = time / 3,
			snd = time % 3; 
		//BG
		g.setColor(Color.WHITE);
		g.fillOval(0, 0, 200, 200);
		
		//outer
		g.setColor(Color.BLACK);
		g.fillOval(2, 2, 196, 196);
		g.setColor(fstColour);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 52, 36);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 12, 36);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 332, 36);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 292, 36);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 252, 36);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 212, 36);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 172, 36);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 132, 36);
		if (--fst<0) g.setColor(offColour);
		g.fillArc(4, 4, 192, 192, 92, 36);

		//inner
		g.setColor(Color.BLACK);
		g.fillOval(35, 35, 130, 130);
		g.setColor(sndColour);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 332, 116);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 212, 116);
		if (--snd<0) g.setColor(offColour);
		g.fillArc(37, 37, 126, 126, 92, 116);
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
