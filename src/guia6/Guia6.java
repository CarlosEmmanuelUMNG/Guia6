package guia6;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Collections;
import java.util.List;
public class Guia6 extends Thread {
    private JLabel eti;
    private Carrera p;
    private boolean llegoMeta;

    public Guia6(JLabel eti, Carrera p) {
        this.eti = eti;
        this.p = p;
        this.llegoMeta = false;
    }

    @Override
    public void run() {
        long ti = System.currentTimeMillis();
        int carro = Integer.parseInt(eti.getName());

        while (!llegoMeta) {
            try {
                sleep((int) (Math.random() * 100));
                int carX = eti.getLocation().x;

                if (carX < p.getmeta().getLocation().x - 100) {
                    eti.setLocation(eti.getLocation().x + 10, eti.getLocation().y);
                    p.repaint();
                } else {
                    llegoMeta = true;
                    long tf = System.currentTimeMillis();
                    long td = (tf - ti);
                    p.agregarTiempo(carro, td);
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}