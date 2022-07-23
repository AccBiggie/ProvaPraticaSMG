import java.util.Scanner;
public class Escola {
    public static void main(String[] args) throws Exception {
    try(Scanner entradaUsuario = new Scanner(System.in)){
        Alunos MediaAluno = new Alunos();

        System.out.println("Digite a nota do aluno");

        double notaProva1 = entradaUsuario.nextDouble();
        double notaProva2 = entradaUsuario.nextDouble();
        double notaDoTrabalho = entradaUsuario.nextDouble(); 
        MediaAluno.Media();
        MediaAluno.Final();
        MediaAluno.ImprimeDadosAluno();
        System.out.println(notaProva1 + notaProva2 + notaDoTrabalho);
    }
    }
}
