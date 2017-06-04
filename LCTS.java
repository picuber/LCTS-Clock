import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.time.LocalTime;




public class LCTS extends JFrame implements ActionListener {
	
	private final Timer t;
	
	private final HourPanel HOUR = new HourPanel(Color.BLUE, Color.GREEN, Color.RED);
	private final MinutePanel MINUTES = new MinutePanel(Color.BLUE, Color.GREEN, Color.RED);
	private final SecondPanel SECONDS = new SecondPanel(Color.BLUE, Color.GREEN, Color.RED);
	private final JPanel TIME = new JPanel();
	
	private final JLabel LT = new JLabel();
	private final JLabel STDT = new JLabel();
	
	private final JButton DECO = new JButton();
	private final JButton EXIT = new JButton();
	private final JButton PINTOP = new JButton();

	private static final Color transBG = new Color(0 ,0, 0, 0);
	//Constructor
	public LCTS(){
		super("LClock");
		t = new Timer(1000, this);
		
		//Window
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBackground(transBG);
		setSize(600, 250);
		// setLocation(200, 200);
		setLayout(null);

		EXIT.setBounds(0, 0, 10, 10);
		EXIT.setBackground(Color.RED);
		EXIT.addActionListener((ActionEvent evt) -> {
			System.exit(0);
		});
		add(EXIT);

		PINTOP.setBounds(0, 10, 10, 10);
		PINTOP.setBackground(Color.GREEN);
		PINTOP.addActionListener((ActionEvent evt) -> {
			setAlwaysOnTop(!isAlwaysOnTop());
		});
		add(PINTOP);

		DECO.setBounds(0, 20, 10, 10);
		DECO.setBackground(Color.BLUE);
		DECO.addActionListener((ActionEvent evt) -> {
			dispose();
			if(isUndecorated()){
				setBackground(Color.WHITE);
				setUndecorated(false);
			} else {
				setUndecorated(true);
				setBackground(transBG);
			}
			setVisible(true);
		});
		add(DECO);

		TIME.setBounds(0, 180, 600, 50);
		TIME.setBackground(Color.LIGHT_GRAY);
		
		LT.setFont(new Font("Cosolas", Font.BOLD, 22));
		LT.setForeground(Color.CYAN);
		TIME.add(LT);

		STDT.setFont(new Font("Cosolas", Font.BOLD, 22));
		STDT.setForeground(Color.MAGENTA);
		TIME.add(STDT);

		updateTimeText();
		add(TIME);

		HOUR.setBounds(0, 0, 200, 200);
		HOUR.setBackground(transBG);
		add(HOUR);

		MINUTES.setBounds(200, 0, 200, 200);
		MINUTES.setBackground(transBG);
		add(MINUTES);

		SECONDS.setBounds(400, 0, 200, 200);
		SECONDS.setBackground(transBG);
		add(SECONDS);

		setVisible(true);
		
		//Timer
		t.start();
	}


	//Timer
	@Override
	public void actionPerformed(ActionEvent e) {
		updateTimeText();
		repaint();
	}

	protected static int getTime(char unit) {
		int time = LocalTime.now().toSecondOfDay();//second of day

		if (unit == 's') return time % 25;
		time /= 25;
		if (unit == 'm') return time % 27;
		time /= 27;
		if (unit == 'h') return time;
		throw new IllegalArgumentException();
	}

	private void updateTimeText(){
		LT.setText(Integer.toString(getTime('h'), 16).toUpperCase() + " - " + Integer.toString(getTime('m'), 6) + " - " + Integer.toString(getTime('s'), 5));
		STDT.setText(LocalTime.now().withNano(0).toString());
	}

	public static void main (String[] args) {
		LCTS l = new LCTS();
		
	}
}
