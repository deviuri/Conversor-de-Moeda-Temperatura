import javax.swing.*;


public class Tela extends JFrame {

    public static void main(String[] args) {
        String[] opcoes = {"Conversor de Moeda", "Conversor de Temperatura"};

        String type = JOptionPane.showInputDialog(null, "Escolha:","Menu",
                        JOptionPane.PLAIN_MESSAGE, null,opcoes,null).toString();
        if (type == "Conversor de Moeda"){
            new Moedas();
        }else if (type == "Conversor de Temperatura"){
            new Temperatura();
        }
    }
    public void loop(){
        String[] opcoes = {"Conversor de Moeda", "Conversor de Temperatura"};

        String type = JOptionPane.showInputDialog(null, "Escolha:","Menu",
                JOptionPane.PLAIN_MESSAGE, null,opcoes,null).toString();
        if (type == "Conversor de Moeda"){
            new Moedas();
        }else if (type == "Conversor de Temperatura"){
            new Temperatura();
        }
    }
}


