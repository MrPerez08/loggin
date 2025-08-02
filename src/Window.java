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

        JPanel log = new JPanel(new BorderLayout());
        log.setPreferredSize(new Dimension(300,500));
        log.setBackground(Color.decode("#1e2730"));
        JTextArea logArea = new JTextArea();
        logArea.setBackground(Color.decode("#1e2730"));
        logArea.setForeground(Color.WHITE);
        logArea.setOpaque(true);
        logArea.setLineWrap(true);      // Wrap lines when they exceed width
        logArea.setWrapStyleWord(true); // Wrap at word boundaries (not mid-word)
        logArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.decode("#1e2730")));

        log.add(scrollPane, BorderLayout.CENTER);





        JPanel logNew = new JPanel(new BorderLayout());
        logNew.setBorder(new MatteBorder(2, 0, 0, 0, Color.BLACK));
        logNew.setPreferredSize(new Dimension(300,30));
        logNew.setBackground(Color.decode("#1e2730"));
        JTextField newLogText = new JTextField();
        newLogText.setForeground(Color.WHITE);
        newLogText.setBackground(Color.decode("#1e2730"));
        newLogText.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.decode("#1e2730")));
        logNew.add(newLogText);

        //Okay, how to automate the task creation?
        newLogText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = newLogText.getText().trim(); // trim() removes leading/trailing whitespace
                if (!input.isEmpty()) { // Only append if the input is not empty

                    Task newTask = new Task(input);

                    logArea.append(newTask.getCreationTime()+ " | "+ input + " | " + "\n");
                    newLogText.setText(""); // Clear the text field
                }
                // If input is empty, do nothing
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
