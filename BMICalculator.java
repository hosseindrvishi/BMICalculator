import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame {
    private JLabel weightLabel, heightLabel, resultLabel;
    private JTextField weightField, heightField;
    private JButton calculateButton;

    public BMICalculator() {
        setTitle("BMI Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        weightLabel = new JLabel("Weight (kg):");
        heightLabel = new JLabel("Height (m):");
        resultLabel = new JLabel("");

        weightField = new JTextField(10);
        heightField = new JTextField(10);

        calculateButton = new JButton("Calculate BMI");

        setLayout(new GridLayout(4, 2));
        add(weightLabel);
        add(weightField);
        add(heightLabel);
        add(heightField);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());
                double bmi = weight / (height * height);
                resultLabel.setText("Your BMI is: " + bmi);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new BMICalculator();
    }
}