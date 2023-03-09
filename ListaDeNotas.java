package listadenotas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author NekoYasha7
 */
public class ListaDeNotas {

    public static void main(String[] args) {
        
        
        //1 - Instanciar a lista de notas
        List<Double> listaDeNotas = new ArrayList<>();
        
        
        
        //2 - Adicionar notas na lista
        for(int i = 0 ; i < 7; i++){
            Random rand = new Random();
            double nota = (double) rand.nextInt(10);
            
            listaDeNotas.add(nota);
            
        }
        
        //3 - Imprimir todas as notas:
        imprimirNotas(listaDeNotas);
        
        //4 - Substituir um nota por indice:
        System.out.println("\n--------------------------------------\n");
        editarNota(listaDeNotas, 4, 6.7);
        imprimirNotas(listaDeNotas);
        
        //4 - Substituir um nota por nota:
        System.out.println("\n---------------------------------------\n");
        editarNota(listaDeNotas,0.0, 8.0);
        imprimirNotas(listaDeNotas);
        
        //5 - Ordenar notas:
        System.out.println("\n---------------------------------------\n");
        Collections.sort(listaDeNotas);
        imprimirNotas(listaDeNotas);
        
        //6 - Imprime a maior nota:
        System.out.println("\n---------------------------------------\n");
        System.out.println("Maior nota: " + Collections.max(listaDeNotas));
        
        
        //7 - Imprime a menor nota:
        System.out.println("\n---------------------------------------\n");
        System.out.println("Menor : " + Collections.min(listaDeNotas));
        
        
        //8 - Imprime a menor nota:
        System.out.println("\n---------------------------------------\n");
        System.out.printf("Média : %.2f ", calcularMedia(listaDeNotas));
        
        //9 - Remove por indice:
        System.out.println("\n---------------------------------------\n");
        listaDeNotas.remove(3);
        imprimirNotas(listaDeNotas);
      
        //10 - Remove por nota:
        System.out.println("\n---------------------------------------\n");
        listaDeNotas.remove(6.7);
        imprimirNotas(listaDeNotas);
       
        
    }
    
    
    
    //---------------------------------------{ Metódos Estáticos}---------------------------------------//
    public static void imprimirNotas(List<Double> listaDeNotas){
        
        for(double nota : listaDeNotas)
            System.out.println(nota);
    }
    
    public static void editarNota(List<Double> listaDeNotas, int indice, double novaNota){
        
        if(indice >= listaDeNotas.size())
                        {System.out.println("Indice inválido"); return;}
        
        listaDeNotas.set(indice, novaNota);
    }
    
    public static void editarNota(List<Double> listaDeNotas, double notaAtual, double novaNota){
        
        if(!listaDeNotas.contains(notaAtual))
            {System.out.println("Nota inválida"); return;}
        
        int indice = listaDeNotas.indexOf(notaAtual);
        listaDeNotas.set(indice, novaNota);
    }

    public static double calcularMedia(List<Double> listaDeNotas){
    
        double soma = 0;
        
        for(double nota : listaDeNotas)
            soma += nota;
        
        double media = (soma / listaDeNotas.size());
        
        
        return media;
    }
}
