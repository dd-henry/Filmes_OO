package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("INCRIVEL!!!");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Legalzinho");
        }else{
            System.out.println("Cai fora. . . . . . ");
        }
    }
}
