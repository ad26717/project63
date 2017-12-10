import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.JButton;


public class LearningGUI extends JFrame  {

        public LearningGUI() {


            // Create Grid Layout
            GridLayout gridLayoutExample = new GridLayout(2,2);

             // Create jPanel
            JPanel jPanel = new JPanel(gridLayoutExample);

             // Create buttons
            JButton [] button = new JButton[4];

             // Create TextFields
            JTextField [] textField = new JTextField[4];

             // Name buttons and add them to the layout
            for(int i=0; i<button.length; i++) {
                button[i] = new JButton("Magical Button " + (i+1));
                jPanel.add(button[i]);
            }

              // Name textfields and add them to the layout
            for(int j=0; j<textField.length; j++){
                textField[j] = new JTextField(" Text Field " + (j+1));
                jPanel.add(textField[j]);
            }
            // Set window size
            setSize(600,300);
            // Set panel to the layout
            add(jPanel);

            setLocation(400,200);
            // Display layout
            setVisible(true);
        }
    // Create main method
        public static void main(String[] args) {

           // Call the method
            new LearningGUI ();
        }
}
