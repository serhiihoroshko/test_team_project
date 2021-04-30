import javax.swing.*;
public class Azazaza {
    public static void main(String[] args) {
        JFrame window = new JFrame("ololo");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me!");
        JOptionPane jop = new JOptionPane();
        panel.add(button);
        window.add(panel);
        window.setSize(300,100);
        button.addActionListener(e -> jop.showMessageDialog(jop,"FBI OPEN DOOR"));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
