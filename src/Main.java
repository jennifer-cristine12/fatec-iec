import Model.Calculadora;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String operation;
        Object[] options = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        Double result = 0.0;

        Double firstNumber = Double.parseDouble(JOptionPane.showInputDialog("Escolha o primeiro número"));
        Double secondNumber = Double.parseDouble(JOptionPane.showInputDialog("Escolha o segundo número"));

        operation = (String) JOptionPane.showInputDialog(
                null,
                "Escolha a operação desejada",
                "Calcular",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        switch (operation) {
            case "Soma" -> result = Calculadora.somar(firstNumber, secondNumber);
            case "Subtração" -> result = Calculadora.subtrair(firstNumber, secondNumber);
            case "Multiplicação" -> result = Calculadora.multiplicar(firstNumber, secondNumber);
            case "Divisão" -> result = Calculadora.dividir(firstNumber, secondNumber);
        }

        JOptionPane.showMessageDialog(null, "O resultado foi: " + result);

    }

}