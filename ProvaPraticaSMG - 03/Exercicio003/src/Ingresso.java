import javax.swing.JOptionPane;

public class Ingresso {
    public double valorReais = 200.00;

    public void ImprimeValor(){
        double valorReais = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
        this.valorReais = valorReais;
        JOptionPane.showMessageDialog(null, "Valor: " + " " +valorReais);
    }
}
