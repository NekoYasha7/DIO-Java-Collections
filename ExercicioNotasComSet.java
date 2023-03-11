package exercicio.notas.com.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.TreeSet;

public class ExercicioNotasComSet {

    public static void main(String[] args) {
        
        Set<Double> minhasNotas = new HashSet<>();
        
        //--+ Carrega o Set com notas aleatorias +--//
        minhasNotas = carregarSet(5);
        
        //--+ Mostrar todas as notas +--//
        System.out.println("Todas as notas: " + minhasNotas.toString());
        
        //--+ Exibir quantidade de notas +-//
        System.out.println("Quantidade de notas: " + minhasNotas.size());
        
        //--+ Exibir a maior nota +--//
        System.out.println("Maior nota: " + Collections.max(minhasNotas));
        
        //--+ Exibir a menor nota +--//
        System.out.println("Menor nota: " + Collections.min(minhasNotas));
        
        //--+ Calcular media das notas +--//
        System.out.println("Média das notas: " + calcularMedia(minhasNotas));
        
        //--+ Somar todas notas +--//
        System.out.println("Soma de todas as notas: " + somarNotas(minhasNotas));
        
        //--+ Ordenar notas +--//
        Set<Double> notasOrdenadas = new TreeSet<>(minhasNotas);
        System.out.println("Notas ordenadas por ordem crescente: " + notasOrdenadas.toString());
        
        //--+ Limpar notas +--//
        minhasNotas.clear();
        System.out.println("Notas: " + minhasNotas.toString());
        
        //---+ Verificar se há notas +--//
        System.out.println("minhasNotas está vazio? " + ((minhasNotas.isEmpty()) ? "Sim" : "Não") + "\nnotasOrdenadas está vazia? " + ((notasOrdenadas.isEmpty()) ? "Sim" : "Não"));
        
        //--+ Adicionar nota +--//
        minhasNotas.add(5.6);
        System.out.println("minhasNotas: " + minhasNotas.toString());
        
    }
    
    public static Set<Double> carregarSet(int tamanhoSet){
        
        Set<Double> notas = new HashSet<>();
        Random rand = new Random();

        for(int i = 0; i < tamanhoSet; i++)
            notas.add((double) rand.nextInt(10));
        
        return notas;
    }
    
    public static double calcularMedia(Set<Double> notas){
        
        double soma = 0.0;
        double media = 0.0;
        
        
        for(Double nota  : notas)
            soma += nota;
        
        media = (soma / notas.size());
        
        return media;
        
    }
    
    public static double somarNotas(Set<Double> notas){
        
        double soma = 0.0;
        
        for(Double nota : notas)
            soma += nota;
        
        return soma;
    }
    
}
