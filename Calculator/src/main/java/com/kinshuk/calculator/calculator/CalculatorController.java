package com.kinshuk.calculator.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML private TextField outputField;
    @FXML private Button button0;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button8;
    @FXML private Button button9;
    @FXML private Button addButton;
    @FXML private Button subtractButton;
    @FXML private Button multiplyButton;
    @FXML private Button divideButton;
    @FXML private Button equalsButton;
    @FXML private Button clearButton;

    private double total = 0;
    private String operator = "";

    @FXML
    public void initialize() {
        // Add event handlers to number buttons
        button0.setOnAction(this::numberButtonClicked);
        button1.setOnAction(this::numberButtonClicked);
        button2.setOnAction(this::numberButtonClicked);
        button3.setOnAction(this::numberButtonClicked);
        button4.setOnAction(this::numberButtonClicked);
        button5.setOnAction(this::numberButtonClicked);
        button6.setOnAction(this::numberButtonClicked);
        button7.setOnAction(this::numberButtonClicked);
        button8.setOnAction(this::numberButtonClicked);
        button9.setOnAction(this::numberButtonClicked);

        // Add event handlers to operator buttons
        addButton.setOnAction(this::operatorButtonClicked);
        subtractButton.setOnAction(this::operatorButtonClicked);
        multiplyButton.setOnAction(this::operatorButtonClicked);
        divideButton.setOnAction(this::operatorButtonClicked);
        equalsButton.setOnAction(this::equalsButtonClicked);

        // Add event handler to clear button
        clearButton.setOnAction(this::clearButtonClicked);
    }

    @FXML
    private void numberButtonClicked(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        outputField.setText(outputField.getText() + value);
    }

    @FXML
    private void operatorButtonClicked(ActionEvent event) {
        total = Double.parseDouble(outputField.getText());
        operator = ((Button) event.getSource()).getText();
        outputField.clear();
    }

    @FXML
    private void equalsButtonClicked(ActionEvent event) {
        double value = Double.parseDouble(outputField.getText());
        switch (operator) {
            case "+":
                total += value;
                break;
            case "-":
                total -= value;
                break;
            case "*":
                total *= value;
                break;
            case "/":
                total /= value;
                break;
        }
        outputField.setText(Double.toString(total));
    }

    @FXML
    private void clearButtonClicked(ActionEvent event) {
        total = 0;
        operator = "";
        outputField.clear();
    }
}
