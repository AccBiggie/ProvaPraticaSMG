import javax.swing.JOptionPane;

public class BombaCombustivel {
    public String tipoCombustivel = "Gasolina";
    public double valorLitroCombustivel = 6.34;
    public double quantidadeCombustivel = 1000;

    public void abastecerPorValor(){
        double combustivelPorValor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para abastecimento "));
        double litros = combustivelPorValor / 6.34;
        JOptionPane.showMessageDialog(null, "Quantidade de" + " "+ tipoCombustivel + " "+  "abastecida: " + litros + " Litros");
        quantidadeCombustivel = quantidadeCombustivel - litros;
    }
    public void abastecerPorLitro(){
        double combustivelPorLitro = Double.parseDouble((JOptionPane.showInputDialog("Quantidade em litros")));
        double litros = combustivelPorLitro * 6.34;
        JOptionPane.showMessageDialog(null, "Valor pago: " + litros);
        quantidadeCombustivel = quantidadeCombustivel - litros;
    }
    public void alterarValorCombustivel(){
        double valorCombustivelAlterado = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor do combustivel: " + tipoCombustivel));
        JOptionPane.showMessageDialog(null, "Valor Alterado: "+" " + tipoCombustivel +": " + (valorLitroCombustivel = valorCombustivelAlterado) +" "+"Reais o Litro");
    }
    public void alterarCombustivel(){
        String novoCombustivel = String.format(JOptionPane.showInputDialog(null, "Informe o novo combustivel: "));
        JOptionPane.showMessageDialog(null, "Combustivel Alterado:"+" " + (tipoCombustivel.replace(this.tipoCombustivel, novoCombustivel)));
    }
    final void alterarQuantidadeCombustivel(){
        double quantidadeAlterada = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros do ultimo abastecimento:"));
        quantidadeCombustivel = quantidadeCombustivel - quantidadeAlterada;
        JOptionPane.showMessageDialog(null, "Quantidade de combustiveis restante: "+"  "+ quantidadeCombustivel);
    }
}
