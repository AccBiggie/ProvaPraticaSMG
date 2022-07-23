public class ImplementaIngresso {
    public static void main(String[] args, int ImprimeValor, int valorVip) throws Exception {
        Ingresso novoIngresso = new Ingresso();
        IngressoVip novoIngressoVip = new IngressoVip();

        novoIngresso.ImprimeValor();
        novoIngressoVip.valorVip(0);

        System.out.println("Diferença de preços:" + (ImprimeValor - valorVip ));
    }
}
