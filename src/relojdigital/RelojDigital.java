package relojdigital;

import javax.swing.JFrame;
import modelos.Reloj;
import vistas.PanelLinea;
import java.sql.Timestamp;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class RelojDigital {

  public static void main(String[] args) {
    Reloj reloj = new Reloj();
    PanelLinea panel = new PanelLinea(reloj);

    JFrame f = new JFrame("Reloj Digital");
    f.setSize(1050, 350);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocation(100, 100);
    f.setResizable(false);
    f.add(panel);
    f.setVisible(true);

    while (true) {
      Timestamp d = new Timestamp(System.currentTimeMillis());
      String relojDos = d.toString().split(" ")[1];
      String[] horario = relojDos.split(":");
      int[] valores = {
        Integer.parseInt("" + horario[0].charAt(0)),
        Integer.parseInt("" + horario[0].charAt(1)),
        Integer.parseInt("" + horario[1].charAt(0)),
        Integer.parseInt("" + horario[1].charAt(1)),
        Integer.parseInt("" + horario[2].split("\\.")[0].charAt(0)),
        Integer.parseInt("" + horario[2].split("\\.")[0].charAt(1)),
      };
      reloj.setValores(valores);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Error = " + e);
      }
      panel.repaint();
    }
  }

}
<<<<<<< HEAD
  
=======
 
>>>>>>> master
