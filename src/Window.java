import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private static JFrame window;
    public Window(){
        window = new JFrame("Hey, I'm Lawggin here!");
        window.setSize(1200,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        JPanel workScreen = new JPanel();
        workScreen.setBackground(Color.decode("#1f2a36"));


        JPanel logContainer = new JPanel();
        logContainer.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        //logContainer.setPreferredSize(new Dimension(300,560));
        logContainer.setLayout(new BoxLayout(logContainer,BoxLayout.Y_AXIS));


        JPanel logPanel = new JPanel();
        logPanel.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
        logPanel.setPreferredSize(new Dimension(300,30));
        logPanel.setBackground(Color.decode("#32404f"));
        JLabel logText = new JLabel("Log");
        logText.setForeground(Color.WHITE);
        logPanel.add(logText);

        JPanel log = new JPanel();
        log.setPreferredSize(new Dimension(300,500));
        log.setBackground(Color.decode("#1e2730"));
        JTextArea logArea = new JTextArea();
        logArea.setEditable(false);
        log.add(logArea);




        JPanel logNew = new JPanel();
        logNew.setBorder(new MatteBorder(2, 0, 0, 0, Color.BLACK));
        logNew.setPreferredSize(new Dimension(300,30));
        logNew.setBackground(Color.decode("#1e2730"));
        JTextField newLogText = new JTextField();
        logNew.add(newLogText);
        newLogText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = newLogText.getText();
                logArea.append(input + "\n");
                newLogText.setText(""); // Clear the text field
            }
        });



        logContainer.add(logPanel);
        logContainer.add(log);
        logContainer.add(logNew);






        logContainer.setBackground(Color.decode("#1e2730"));

        workScreen.add(logContainer);
        window.add(workScreen);


        window.setVisible(true);
    }

}
