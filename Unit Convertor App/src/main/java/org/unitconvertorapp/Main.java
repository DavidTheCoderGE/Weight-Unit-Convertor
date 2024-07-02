package org.unitconvertorapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame frame = new JFrame("Weight Unit Convertor");
    JPanel panel = new JPanel(null);
    JTextField convertFrom = new JTextField();
    JTextField converted = new JTextField();
    JButton button = new JButton("Convert");
    JComboBox<String> comboBox1 = new JComboBox<>();
    JComboBox<String> comboBox2 = new JComboBox<>();

    public Main() {
        converted.setFocusable(false);
        convertFrom.setBounds(110, 10, 350, 50);
        converted.setBounds(540, 10, 350, 50);

        panel.setBounds(100, 10, 1000, 80);
        panel.add(convertFrom);
        panel.add(converted);

        comboBox1.addItem("Kilogram");
        comboBox1.addItem("Gram");
        comboBox1.addItem("Milligram");
        comboBox1.addItem("Ton");
        comboBox1.addItem("Pound");
        comboBox1.addItem("Ounce");
        comboBox1.addItem("Carat");
        comboBox1.setBounds(10, 20, 100, 50);
        comboBox1.addActionListener(this);

        comboBox2.setBounds(1080, 20, 100, 50);
        comboBox2.addItem("Gram");
        comboBox2.addItem("Milligram");
        comboBox2.addItem("Ton");
        comboBox2.addItem("Pound");
        comboBox2.addItem("Ounce");
        comboBox2.addItem("Carat");

        button.setBounds(210, 100, 780, 40);
        button.addActionListener(this);

        frame.add(comboBox1);
        frame.add(comboBox2);
        frame.setLayout(null);
        frame.add(panel);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 200);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main unitConvertor = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == comboBox1) {
            String selectedItem = (String) comboBox1.getSelectedItem();
            switch (selectedItem) {
                case "Kilogram":
                    comboBox2.removeAllItems();
                    comboBox2.addItem("Gram");
                    comboBox2.addItem("Milligram");
                    comboBox2.addItem("Ton");
                    comboBox2.addItem("Pound");
                    comboBox2.addItem("Ounce");
                    comboBox2.addItem("Carat");
                    break;
                case "Gram":
                    comboBox2.removeAllItems();
                    comboBox2.addItem("Kilogram");
                    comboBox2.addItem("Milligram");
                    comboBox2.addItem("Ton");
                    comboBox2.addItem("Pound");
                    comboBox2.addItem("Ounce");
                    comboBox2.addItem("Carat");
                    break;
                case "Milligram":
                    comboBox2.removeAllItems();
                    comboBox2.addItem("Kilogram");
                    comboBox2.addItem("Gram");
                    comboBox2.addItem("Ton");
                    comboBox2.addItem("Pound");
                    comboBox2.addItem("Ounce");
                    comboBox2.addItem("Carat");
                    break;
                case "Ton":
                    comboBox2.removeAllItems();
                    comboBox2.addItem("Kilogram");
                    comboBox2.addItem("Gram");
                    comboBox2.addItem("Milligram");
                    comboBox2.addItem("Pound");
                    comboBox2.addItem("Ounce");
                    comboBox2.addItem("Carat");
                    break;
                case "Pound":
                    comboBox2.removeAllItems();
                    comboBox2.addItem("Kilogram");
                    comboBox2.addItem("Gram");
                    comboBox2.addItem("Milligram");
                    comboBox2.addItem("Ton");
                    comboBox2.addItem("Ounce");
                    comboBox2.addItem("Carat");
                    break;
                case "Ounce":
                    comboBox2.removeAllItems();
                    comboBox2.addItem("Kilogram");
                    comboBox2.addItem("Gram");
                    comboBox2.addItem("Milligram");
                    comboBox2.addItem("Pound");
                    comboBox2.addItem("Ton");
                    comboBox2.addItem("Carat");
                    break;
                case "Carat":
                    comboBox2.removeAllItems();
                    comboBox2.addItem("Kilogram");
                    comboBox2.addItem("Gram");
                    comboBox2.addItem("Milligram");
                    comboBox2.addItem("Pound");
                    comboBox2.addItem("Ounce");
                    comboBox2.addItem("Ton");
                    break;
            }
        }
        if (actionEvent.getSource() == button) {
            String converting = (String) comboBox2.getSelectedItem();
            if (comboBox1.getSelectedItem().equals("Kilogram")) {
                switch (converting) {
                    case "Gram":
                        double value1 = Integer.parseInt(convertFrom.getText());
                        double result1 = value1 * 1000;
                        converted.setText(String.valueOf(result1));
                        break;
                    case "Milligram":
                        double value2 = Integer.parseInt(convertFrom.getText());
                        double result2 = value2 * 1000000;
                        converted.setText(String.valueOf(result2));
                        break;
                    case "Ton":
                        double value3 = Integer.parseInt(convertFrom.getText());
                        double result3 = value3 * 0.001;
                        converted.setText(String.valueOf(result3));
                        break;
                    case "Pound":
                        double value4 = Integer.parseInt(convertFrom.getText());
                        double result4 = value4 * 2.2046244202;
                        converted.setText(String.valueOf(result4));
                        break;
                    case "Ounce":
                        double value5 = Integer.parseInt(convertFrom.getText());
                        double result5 = value5 * 35.273990723;
                        converted.setText(String.valueOf(result5));
                        break;
                    case "Carat":
                        double value6 = Integer.parseInt(convertFrom.getText());
                        double result6 = value6 * 5000;
                        converted.setText(String.valueOf(result6));
                        break;
                }
            }
            if (comboBox1.getSelectedItem().equals("Gram")) {
                switch (converting) {
                    case "Kilogram":
                        double value1 = Integer.parseInt(convertFrom.getText());
                        double result1 = value1 * 0.001;
                        converted.setText(String.valueOf(result1));
                        break;
                    case "Milligram":
                        double value2 = Integer.parseInt(convertFrom.getText());
                        double result2 = value2 * 1000;
                        converted.setText(String.valueOf(result2));
                        break;
                    case "Ton":
                        double value3 = Integer.parseInt(convertFrom.getText());
                        double result3 = value3 * 0.000001;
                        converted.setText(String.valueOf(result3));
                        break;
                    case "Pound":
                        double value4 = Integer.parseInt(convertFrom.getText());
                        double result4 = value4 * 0.0022046244;
                        converted.setText(String.valueOf(result4));
                        break;
                    case "Ounce":
                        double value5 = Integer.parseInt(convertFrom.getText());
                        double result5 = value5 * 0.0352739907;
                        converted.setText(String.valueOf(result5));
                        break;
                    case "Carat":
                        double value6 = Integer.parseInt(convertFrom.getText());
                        double result6 = value6 * 5;
                        converted.setText(String.valueOf(result6));
                        break;
                }
            }
            if (comboBox1.getSelectedItem().equals("Milligram")) {
                switch (converting) {
                    case "Kilogram":
                        double value1 = Integer.parseInt(convertFrom.getText());
                        double result1 = value1 * 0.000001;
                        converted.setText(String.valueOf(result1));
                        break;
                    case "Gram":
                        double value2 = Integer.parseInt(convertFrom.getText());
                        double result2 = value2 * 0.001;
                        converted.setText(String.valueOf(result2));
                        break;
                    case "Ton":
                        double value3 = Integer.parseInt(convertFrom.getText());
                        double result3 = value3 * 1000000000;
                        converted.setText(String.valueOf(result3));
                        break;
                    case "Pound":
                        double value4 = Integer.parseInt(convertFrom.getText());
                        double result4 = value4 * 0.0000022046;
                        converted.setText(String.valueOf(result4));
                        break;
                    case "Ounce":
                        double value5 = Integer.parseInt(convertFrom.getText());
                        double result5 = value5 * 0.000035274;
                        converted.setText(String.valueOf(result5));
                        break;
                    case "Carat":
                        double value6 = Integer.parseInt(convertFrom.getText());
                        double result6 = value6 * 0.005;
                        converted.setText(String.valueOf(result6));
                        break;
                }
            }
            if (comboBox1.getSelectedItem().equals("Ton")) {
                switch (converting) {
                    case "Kilogram":
                        double value1 = Integer.parseInt(convertFrom.getText());
                        double result1 = value1 * 1000;
                        converted.setText(String.valueOf(result1));
                        break;
                    case "Gram":
                        double value2 = Integer.parseInt(convertFrom.getText());
                        double result2 = value2 * 1000000;
                        converted.setText(String.valueOf(result2));
                        break;
                    case "Milligram":
                        double value3 = Integer.parseInt(convertFrom.getText());
                        double result3 = value3 * 1000000000;
                        converted.setText(String.valueOf(result3));
                        break;
                    case "Pound":
                        double value4 = Integer.parseInt(convertFrom.getText());
                        double result4 = value4 * 2204.6244202;
                        converted.setText(String.valueOf(result4));
                        break;
                    case "Ounce":
                        double value5 = Integer.parseInt(convertFrom.getText());
                        double result5 = value5 * 35273.990723;
                        converted.setText(String.valueOf(result5));
                        break;
                    case "Carat":
                        double value6 = Integer.parseInt(convertFrom.getText());
                        double result6 = value6 * 5000000;
                        converted.setText(String.valueOf(result6));
                        break;
                }
            }
            if (comboBox1.getSelectedItem().equals("Pound")) {
                switch (converting) {
                    case "Kilogram":
                        double value1 = Integer.parseInt(convertFrom.getText());
                        double result1 = value1 * 0.453592;
                        converted.setText(String.valueOf(result1));
                        break;
                    case "Gram":
                        double value2 = Integer.parseInt(convertFrom.getText());
                        double result2 = value2 * 453.592;
                        converted.setText(String.valueOf(result2));
                        break;
                    case "Milligram":
                        double value3 = Integer.parseInt(convertFrom.getText());
                        double result3 = value3 * 453592;
                        converted.setText(String.valueOf(result3));
                        break;
                    case "Ton":
                        double value4 = Integer.parseInt(convertFrom.getText());
                        double result4 = value4 * 0.000453592;
                        converted.setText(String.valueOf(result4));
                        break;
                    case "Ounce":
                        double value5 = Integer.parseInt(convertFrom.getText());
                        double result5 = value5 * 16;
                        converted.setText(String.valueOf(result5));
                        break;
                    case "Carat":
                        double value6 = Integer.parseInt(convertFrom.getText());
                        double result6 = value6 * 2267.96;
                        converted.setText(String.valueOf(result6));
                        break;
                }
            }
            if (comboBox1.getSelectedItem().equals("Ounce")) {
                switch (converting) {
                    case "Kilogram":
                        double value1 = Integer.parseInt(convertFrom.getText());
                        double result1 = value1 * 0.0283495;
                        converted.setText(String.valueOf(result1));
                        break;
                    case "Gram":
                        double value2 = Integer.parseInt(convertFrom.getText());
                        double result2 = value2 * 28.3495;
                        converted.setText(String.valueOf(result2));
                        break;
                    case "Milligram":
                        double value3 = Integer.parseInt(convertFrom.getText());
                        double result3 = value3 * 28349.5;
                        converted.setText(String.valueOf(result3));
                        break;
                    case "Ton":
                        double value4 = Integer.parseInt(convertFrom.getText());
                        double result4 = value4 * 0.0000283495;
                        converted.setText(String.valueOf(result4));
                        break;
                    case "Pound":
                        double value5 = Integer.parseInt(convertFrom.getText());
                        double result5 = value5 * 0.0625;
                        converted.setText(String.valueOf(result5));
                        break;
                    case "Carat":
                        double value6 = Integer.parseInt(convertFrom.getText());
                        double result6 = value6 * 141.7475;
                        converted.setText(String.valueOf(result6));
                        break;
                }
            }
            if (comboBox1.getSelectedItem().equals("Carat")) {
                switch (converting) {
                    case "Kilogram":
                        double value1 = Integer.parseInt(convertFrom.getText());
                        double result1 = value1 * 0.0002;
                        converted.setText(String.valueOf(result1));
                        break;
                    case "Gram":
                        double value2 = Integer.parseInt(convertFrom.getText());
                        double result2 = value2 * 0.2;
                        converted.setText(String.valueOf(result2));
                        break;
                    case "Milligram":
                        double value3 = Integer.parseInt(convertFrom.getText());
                        double result3 = value3 * 200;
                        converted.setText(String.valueOf(result3));
                        break;
                    case "Ton":
                        double value4 = Integer.parseInt(convertFrom.getText());
                        double result4 = value4 * 5000000;
                        converted.setText(String.valueOf(result4));
                        break;
                    case "Pound":
                        double value5 = Integer.parseInt(convertFrom.getText());
                        double result5 = value5 * 0.0004409249;
                        converted.setText(String.valueOf(result5));
                        break;
                    case "Ounce":
                        double value6 = Integer.parseInt(convertFrom.getText());
                        double result6 = value6 * 0.0070547981;
                        converted.setText(String.valueOf(result6));
                        break;
                }
            }
        }
    }
}