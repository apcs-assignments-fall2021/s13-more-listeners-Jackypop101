import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class HotAndColdGame {
    JFrame frame;
    JPanel panel1;
    JTextField field1;
    int x = (int) (Math.random()*500);
    int y = (int) (Math.random()*500);
    double h = Integer.MAX_VALUE;
    String i = "";
    String p = "";

    public HotAndColdGame() {
        // Set up the frame
        frame = new JFrame("Mouse Listener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up components/panels
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(500,500));
        frame.add(panel1, BorderLayout.NORTH);

        field1 = new JTextField();
        frame.add(field1, BorderLayout.SOUTH);

        // Set up MouseListener
        panel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double k = 0;

                k = Math.sqrt(Math.pow(e.getX() - x, 2) + Math.pow(e.getY() - y, 2));


                if (k > 50){
                    i = ("Very Cold");
                }
                else if ((k > 30)&&(k < 50)){
                    i = ("Cold");
                }
                else if ((k > 15)&&(k < 30)){
                    i = ("Room Temperature");
                }
                else if ((k > 8)&&(k < 15)){
                    i = ("Hot");
                }
                else if ((k > 3)&&(k < 8)){
                    i = ("Very Hot");
                }
                else if (k == 0){
                    i = ("Perfect!");
                }

                if (k < h){
                    p = "Hotter Than Last Time!";
                }
                if (k > h){
                    p = "Colder Than Last Time!";
                }

                field1.setText( i + " [" + p + "]");
                h = k;
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HotAndColdGame s = new HotAndColdGame();
    }
}
