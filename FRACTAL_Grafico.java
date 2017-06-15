import java.util.*;
import javax.swing.JApplet;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.*;

public class FRACTAL_Grafico extends JApplet {
	public class regla115 {

		public regla115() {
		}

		public int[][] regla() {
			Random ram = new Random();
			int[][] M = new int[800][800];
			int[] regla = { 0, 1, 0, 0, 1, 0, 1, 0 };
			for (int j = 0; j < M.length; j++) {
				M[0][j] = M[0][j] = Math.random() < 0.5 ? 0 : 1;
			}
			for (int i = 1; i < 400; i++) {
				for (int j = 0; j < 400; j++) {
					if (j == 0) {
						M[i][j] = regla[(M[i - 1][j] * 2) + (M[i - 1][j + 1] * 4)];
					} else {
						if (j == (M[0].length - 1)) {
							M[i][j] = regla[(M[i - 1][j - 1] * 1) + (M[i - 1][j] * 2)];
						} else {
							M[i][j] = regla[(M[i - 1][j - 1] * 4) + (M[i - 1][j] * 2) + (M[i - 1][j + 1]) * 1];
						}
					}
				}
			}
			return M;
		}
	}

	private static final long serialVerionUID = 1L;

	private int ca_lenght = 400; // longitud de fractal 
	private int screen_size = 800; // tamaño de el cuadro en la pantalla
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

		regla115 fractal = new regla115();
		// mientas la aplicacion estuva abierta
		while (true) {
			int[][] M = fractal.regla(); // hacer un nuevo fractal
										
			y = 0; // empieza en la izquierda 
			for (int i = 0; i < 400; i++) {
				// empieza en la izquierda 
				x = 0;
				for (int j = 0; j < 400; j++) {
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
		FRACTAL_Grafico applet = new FRACTAL_Grafico();

		frame.getContentPane().add("Center", applet);
		applet.init();

		frame.pack();
		frame.setSize(new Dimension(800, 800));
		frame.setVisible(true);

	}
}
