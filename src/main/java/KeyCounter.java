import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class KeyCounter {
    JFrame frame;
    JButton button1;
    JTextField field1, field2;
    int w = 0;

    public KeyCounter() {
        // Set up the frame
        frame = new JFrame("Key Counter");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Need to create this before button ActionListener code
        field1 = new JTextField();
        field2 = new JTextField();

        button1 = new JButton("Calculate Total Presses:");

        frame.add(field1);
        frame.add(button1);
        frame.add(field2);

        field1.addKeyListener(new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
              w = w +1;
              // field1.setText(field1.getText()+ e.getKeyChar());

          }

          @Override
          public void keyPressed(KeyEvent e) {
          }

          @Override
          public void keyReleased(KeyEvent e) {
              field2.setText(("" + w));

          }
                              });

        button1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                field2.setText(("" + w));

            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        KeyCounter s = new KeyCounter();
    }
}
