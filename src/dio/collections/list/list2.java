package dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

/*
* Informações sobre os gatos:
* (nome - idade - cor)
*
* Gato 1 = nome: Jon, idade: 18, cor: preto
* Gato 2 = nome: Simba, idade: 6, cor: tigrado
* Gato 3 = nome: Jon, idade: 12, cor: amarelo
*
*  1. Criar lista com as informações dos gatos
*  2. Organizar por ordem de inserção
*  3. Organizar por ordem aleatória
*  4. Organizar por ordem natural

*
* */
public class list2 {
    public static <comparator> void main(String[] args) {
        class Gato implements Comparable <Gato> {
            private String nome;
            private Integer idade;
            private String cor;

            public Gato(String nome, Integer idade, String cor) {  /* Construtores: Alt + insert*/
                this.nome = nome;
                this.idade = idade;
                this.cor = cor;
            }
            /* Getters: Alt + insert*/
            public String getNome() {
                return nome;
            }

            public Integer getIdade() {
                return idade;
            }

            public String getCor() {
                return cor;
            }
            /* toString: Alt + insert*/
            @Override
            public String toString() {
                return "{" +
                        "nome='" + nome + '\'' +
                        ", idade=" + idade +
                        ", cor='" + cor + '\'' +
                        '}';
            }

            @Override
            public int compareTo(Gato gato) {
                return this.getNome().compareToIgnoreCase(gato.getNome());
                /* CompareTo retorna int. O IgnoreCase é para retornar String*/
            }
        }


        /* Item 1*/
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(meusGatos);


        /* Item 2*/
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        /* Item 3*/
        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        /* Item 4*/
        System.out.println("--\tOrdem Natural (nome)\t---");
        sort(meusGatos);
        System.out.println(meusGatos);


    }

}