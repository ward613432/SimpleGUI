import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    private static int value = 0;
    private static int changes = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(2, 2, 25, 50));
        frame.add(panel);

        JLabel valueL = new JLabel("Value: 0");
        valueL.setHorizontalAlignment(JLabel.CENTER);
        panel.add(valueL);

        JLabel changesL = new JLabel("Number of Changes: 0");
        changesL.setHorizontalAlignment(JLabel.CENTER);
        panel.add(changesL);

        JButton dec = new JButton("-1");
        dec.setHorizontalAlignment(JLabel.CENTER);
        dec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value--;
                changes++;
                valueL.setText(String.format("Value: %d", value));
                changesL.setText(String.format("Changes: %d", changes));
            }
        });
        panel.add(dec);

        JButton inc = new JButton("+1");
        inc.setHorizontalAlignment(JLabel.CENTER);
        inc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value++;
                changes++;
                valueL.setText(String.format("Value: %d", value));
                changesL.setText(String.format("Changes: %d", changes));
            }
        });
        panel.add(inc);


        frame.setVisible(true);
    }
}