import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Juego_de_la_vida_Grafico extends JApplet {
	public class g {
		public g() {
		}
		public int[][] M() {
			int M[][] = new int[300][300];
			int contador = 0;
			for (int i = 0; i < 300; i++) {
				for (int j = 0; j < 300; j++) {
					M[i][j] = Math.random() < 0.5 ? 0 : 1;
				}
			}
			System.out.println("Juego de la vida");
			while (true) {
				for (int i = 0; i < M.length; i++) {
					for (int j = 0; j < M.length; j++) {
						contador = M[(i - 1 + M.length) % M.length][(j - 1 + M.length) % M.length]
								+ M[(i - 1 + M.length) % M.length][j]
								+ M[(i - 1 + M.length) % M.length][((j + 1) % M.length)]
								+ M[i][(j - 1 + M.length) % M.length] + M[i][(j + 1) % M.length]
								+ M[(i + 1) % M.length][(j - 1 + M.length) % M.length] + M[(i + 1) % M.length][j]
								+ M[(i + 1) % M.length][(j + 1) % M.length];
						if (M[i][j] == 1) {
							if (contador > 3 || contador < 2) {
								M[i][j] = 0;
							}
						} else {
							if (contador == 3) {
								M[i][j] = 1;
							}
						}
					}
				}
				return M;
			}
		}
	}
	
	private static final long serialVerionUID = 1L;

	private int ca_lenght = 300; // longitud de fractal 
	private int screen_size = 600; // tamaño de el cuadro en la pantalla
	private int delay_time = 0;

	public void init() {
		setSize(screen_size, screen_size);
		setBackground(Color.white);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		int x = 0;
		int y = 0;

		g fractal = new g();
		// mientas la aplicacion estuva abierta
		while (true) {
			int[][] M = fractal.M(); // hacer un nuevo fractal
										
			y = 0; // empieza en la izquierda 
			for (int i = 0; i < M.length; i++) {
				// empieza en la izquierda 
				x = 0;
				for (int j = 0; j < M.length; j++) {
					// si la posicion en la matrix es 0, pinte el cuadro de color
					// amrillo 
					if (M[i][j] == 0) {
						g2.setPaint(Color.yellow);
					} else // si la posicion en la matrix es 1, pinte el cuadro de color
						// verde
					{
						g2.setPaint(Color.green);
					}
					//  pinte el cuadro en cada posicion de coordenada
					g2.fill(new Rectangle2D.Double(x, y, 2, 2));

					x += 2; //se mueve en la siguiente coordenada de manera horizontal
				}

				y += 2; // se mueve en la siguiente coordenada de manera vertical
			}
			try {
				Thread.sleep(delay_time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String arg[]) {
		JFrame frame = new JFrame("Fractales");

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Juego_de_la_vida_Grafico applet = new Juego_de_la_vida_Grafico();

		frame.getContentPane().add("Center", applet);
		applet.init();

		frame.pack();
		frame.setSize(new Dimension(800, 800));
		frame.setVisible(true);

	}
}
