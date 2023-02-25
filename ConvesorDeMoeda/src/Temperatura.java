import javax.swing.*;

public class Temperatura {
    public Temperatura() {
        Double valor = null;
        Double resultado = null;
        try {

            String[] temperaturas = {"Celsius(Cº) para Fahrenheit(ºF)", "Celsius(Cº) para Kelvin(K)",
                    "Fahrenheit(ºF) para Celsius(Cº)", "Fahrenheit(ºF) para Kelvin(K)",
                    "Kelvin(K) para Celsius(Cº)", "Kelvin(K) para Fahrenheit(ºF)"};

            String temperatura = JOptionPane.showInputDialog(null, "Escolha à escala de Temperatura:", "Escalas de Temperatura",
                    JOptionPane.PLAIN_MESSAGE, null, temperaturas, null).toString();

            String input = JOptionPane.showInputDialog("Digite à temperatura:");
            valor = Double.parseDouble(input);

            Temperaturas converterTemperatura = new Temperaturas();
            switch (temperatura) {
                case "Celsius(Cº) para Fahrenheit(ºF)": {
                    resultado = converterTemperatura.converterCelsiusParaFah(valor);
                    JOptionPane.showMessageDialog(null, resultado+"ºF");
                }break;

                case "Celsius(Cº) para Kelvin(K)": {
                    resultado = converterTemperatura.converterCelsiusParaKelvin(valor);
                    JOptionPane.showMessageDialog(null, resultado+"K");
                }break;

                case "Fahrenheit(ºF) para Celsius(Cº)": {
                    resultado = converterTemperatura.converterFahParaCelsius(valor);
                    JOptionPane.showMessageDialog(null, resultado+"Cº");
                }break;

                case "Fahrenheit(ºF) para Kelvin(K)": {
                    resultado = converterTemperatura.converterFahParaKelvin(valor);
                    JOptionPane.showMessageDialog(null, resultado+"K");
                }break;

                case "Kelvin(K) para Celsius(Cº)": {
                    resultado = converterTemperatura.converterKelvinParaCelsius(valor);
                    JOptionPane.showMessageDialog(null, resultado+"Cº");
                }break;

                case "Kelvin(K) para Fahrenheit(ºF)": {
                    resultado = converterTemperatura.converterKelvinParaFah(valor);
                    JOptionPane.showMessageDialog(null, resultado+"ºF");
                }break;

                default:
                    break;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Você não digitou um numero", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?");
            if (resposta == JOptionPane.YES_OPTION) {
                Tela tela = new Tela();
                tela.loop();
            } else {
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar!");
            }
        }
    }
}