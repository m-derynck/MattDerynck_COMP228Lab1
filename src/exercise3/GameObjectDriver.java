package exercise3;

import javafx.geometry.Point2D;

import javax.swing.*;
import java.awt.GridLayout;
import java.util.Objects;

public class GameObjectDriver {
    public static void main(String[] args) {
        displayObjectInitialization(null);
    }

    //Displays the game objects information, gives options to update the gameobject or exit the application.
    public static void displayGameObjectMenu(GameObject obj) {
        Object[] options = {"Update", "Exit"};
        int selection = JOptionPane.showOptionDialog(null, obj.getGameObject(),
                "GameObject Menu", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        //Update GameObject option selected
        if (selection == JOptionPane.YES_OPTION) {
            displayObjectInitialization(obj);
        } else {
            System.out.println("Exited Application.");
        }
    }

    //Displays the panel/menu for accepting the users input to initialize the gameobject
    public static void displayObjectInitialization(GameObject obj) {
        //Input game object
        GameObject userObj;


        //Panel to get object input from user.
        JPanel panel = new JPanel(new GridLayout(0, 1));
        //Panel inputs
        JTextField centerXInput = new JTextField();
        JTextField centerYInput = new JTextField();
        JTextField rotationInput = new JTextField();
        JTextField velocityInput = new JTextField();
        String states[] = {"Alive", "Dead"};
        JComboBox<String> objStateInput = new JComboBox<>(states);

        //We're updating an existing object so preload the values into the input fields.
        if (obj != null) {
            centerXInput.setText(String.valueOf(obj.getCenter().getX()));
            centerYInput.setText(String.valueOf(obj.getCenter().getY()));
            rotationInput.setText(String.valueOf(obj.getRotation()));
            velocityInput.setText(String.valueOf(obj.getVelocity()));
            objStateInput.setSelectedIndex(obj.getObjectState() ? 0 : 1);
        }

        panel.add(new JLabel("Object Center"));
        panel.add(new JLabel("X:"));
        panel.add(centerXInput);
        panel.add(new JLabel("Y:"));
        panel.add(centerYInput);
        panel.add(new JLabel("Rotation:"));
        panel.add(rotationInput);
        panel.add(new JLabel("Velocity:"));
        panel.add(velocityInput);
        panel.add(new JLabel("Object State:"));
        panel.add(objStateInput);


        int inputResult = JOptionPane.showConfirmDialog(null,
                panel, "Game Object", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (inputResult == JOptionPane.OK_OPTION) {
            boolean objState = objStateInput.getSelectedItem().equals(states[0]);
            userObj = new GameObject(new Point2D(convertInputDouble(centerXInput.getText()), convertInputDouble(centerYInput.getText()))
                    , convertInputDouble(velocityInput.getText()), convertInputDouble(rotationInput.getText()), objState);
            displayGameObjectMenu(userObj);
        } else {
            if (obj != null) {
                displayGameObjectMenu(obj);
            } else {
                displayGameObjectMenu(new GameObject());
            }
        }
    }

    //Safely converts the string input from the user to a double.
    public static Double convertInputDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (Exception e) {
            //Input was invalid, display exception.
            JOptionPane.showMessageDialog(null, "Invalid input");
            return 0.0;
        }
    }
}
