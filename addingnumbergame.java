
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.Random;
    import javax.swing.*;
    
    public class addingnumbergame {
     private static int score = 0;
     private static int timeLeft = 45; // 45 seconds
     private static Timer timer;
     private static final JButton submitbutton = new JButton("Submit");
     private static final JTextField inputframe = new JTextField();
     private static final JLabel num = new JLabel("");
     private static final JLabel num2 = new JLabel("");
     private static final JLabel operator = new JLabel("+");
     private static final JLabel equalsLabel = new JLabel("=");
     private static final JLabel timetable = new JLabel("TImer:");
     private static final JLabel scrollable = new JLabel();
        public static void main(String[] args) {
    
         JFrame frame = new JFrame("Addition game");
    
         frame.setLayout(null);
         frame.setSize(430,320);
         frame.setVisible(true);
         frame.setBackground(Color.blue);
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
            game(frame);
            random();
            timermethod();
        }
        static void game(JFrame frame) {
    
         submitbutton.setBounds(150,150,110,40);
         num.setBounds(100,100,50,50);
         num2.setBounds(160,100,50,50);
         operator.setBounds(140,100,50,50);
         inputframe.setBounds(230,110,80,30);
         equalsLabel.setBounds(200,100,50,50);
         timetable.setBounds(230,80,60,30);
         scrollable.setBounds(230,60,60,30);
    
         submitbutton.addActionListener(new SubmitButtonListener());
    
         frame.add(submitbutton);
         frame.add(inputframe);
         frame.add(num);
         frame.add(num2);
         frame.add(operator);
         frame.add(equalsLabel);
         frame.add(timetable);
         frame.add(scrollable);
    
         num.add(new JLabel());
        }
    
        private static void random(){
    
         Random rn = new Random();
         int n1 = rn.nextInt(100);
         int n2 = rn.nextInt(100);
    
         num.setText(String.valueOf(n1));
         num2.setText(String.valueOf(n2));
        }
        private static void timermethod(){
         timer = new Timer(1000, (ActionEvent e) -> {
             timeLeft--;
             timetable.setText("Time: " + timeLeft);
             if (timeLeft <= 0) {
                 timer.stop();
                 JOptionPane.showMessageDialog(null, "Time's up! Final Score: " + score);
             }
         });
         timer.start();
        }
    
    private static class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int nm1 = Integer.parseInt(num.getText());
                int nm2 = Integer.parseInt(num2.getText());
                int answer = Integer.parseInt(inputframe.getText());
                if (answer == nm1 + nm2) {
                    score++;
                    scrollable.setText("Score: " + score);
                    random();
                    inputframe.setText("");
                    timeLeft = 45; // reset timer
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect! Try again.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    }
    
}
