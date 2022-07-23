public class Alunos {
    public String nomeDoAluno ="André";
    public int matricula = 52269515;
    public int notaProva1;
    public int notaProva2;
    public int notaDoTrabalho;
    public double mediaAlunos;
    public double mediaFinal;

    public void Media(){
        this.mediaAlunos = ((notaProva1 + notaProva2*2.5f + notaDoTrabalho)*2)/7;
        System.out.println("Media de Alunos" +" " + mediaAlunos);
    }

    public void Final(){
        this.mediaFinal = (mediaAlunos);
        if(mediaAlunos >=7){
            System.out.println("Aluno aprovado, sua nota foi de:" +" "+ nomeDoAluno + mediaFinal);
        }else if(mediaAlunos < 7){
            System.out.println("Aluno reprovado");
        }
    }

    public void ImprimeDadosAluno(){
        System.out.println(nomeDoAluno);
        System.out.println(matricula);
        //System.out.println("Primeira Prova:" +notaProva1+" "+ "Segunda Prova:" + " "+ notaProva2 +" "+"Nota Trabalho:" +" "+" "+ notaDoTrabalho);
        System.out.println(mediaFinal);
    }
}
