package dio.collections.list;
/*
*  1. Crie uma lista com as 7 notas: 7.0, 8.5, 9.3, 5.0, 7.0, 0.0 e 7.0
*  2. Exiba a posição da nota 5.0
*  3. Adicione na lista a nota 8.0 na posição 4
*  4. Substitua a nota 5.0 pela nota 6.0
*  5. Confira se a nota 5.0 está na lista
*  6. Exiba todas as notas na ordem em que foram informadas
*  7. Exiba a 3° nota adcionada
*  8. Exiba a menor nota
*  9. Exiba a maior nota
*  10. Exiba a soma dos valores
*  11. Exiba a média das notas
*  12. Remova a nota 0.0
*  13. Remova a nota da posição 0
*  14. Remova as notas menoras que 7 e exiba a lista
*  15. Apague toda a lista
*  16. Confira se a lista está vazia
* */
import java.util.*;

public class list1 {

    public static void main(String[] args) {
        /* Item 1 */
        System.out.println("Lista com as sete notas: ");
        List <Double> notas = new ArrayList<Double>();
        notas.add (7.0);
        notas.add (8.5);
        notas.add (9.3);
        notas.add (5.0);
        notas.add (7.0);
        notas.add (0.0);
        notas.add (7.0);

        System.out.println (notas);

        /* Item 2 */
        System.out.println("A posição da nota 5.0 é: " + notas.indexOf(5.0));

        /* Item 3 */
        System.out.println ("Nota 8.0 adicionada na posição 4: ");
        notas.add (4, 8.0);

        /* Item 4 */
        System.out.println ("Substituição da nota 5.0 por 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println (notas);

        /* Item 5 */
        System.out.println ("Conferência da nota 5.0: "+ notas.contains(5.0));

        /* Item 6 */
        System.out.println ("Lista na ordem: ");
        for (Double nota: notas) System.out.println(nota);

        /* Item 7 */
        System.out.println ("A terceira nota adicionada é: " + notas.get (2)); /* a lista inicia na posição 0*/
        System.out.println(notas.toString());

        /* Item 8 */
        System.out.println ("A menor nota é: " + Collections.min(notas));

        /* Item 9 */
        System.out.println ("A maior nota é: " + Collections.max(notas));

        /* Item 10 */
        Iterator<Double> iterator = notas.iterator(); /* Interator: ctrl + alt + v */
        Double soma = 0d; /* posso usar 0d ou 0.0 para variáveis double */
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println ("A soma das notas é: " + soma);

        /* Item 11 */
        System.out.println ("A média das notas é: " + (soma / notas.size()));

        /* Item 12 */
        System.out.println ("Remoção da nota 0.0: " );
        notas.remove(0.0);
        System.out.println (notas);

        /* Item 13 */
        System.out.println ("Remoção da nota na posição 0: " );
        notas.remove(0);
        System.out.println (notas);

        /* Item 14 */
        System.out.println ("Remoção das notas menores que 7.0: " );
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next<7) iterator1.remove();
        }
        System.out.println(notas);

        /* Item 15 */
        System.out.println ("Remoção da lista: " );
        notas.clear();
        System.out.println(notas);

        /* Item 16 */
        System.out.println("Conferência da lista vazia: " + notas.isEmpty());

    }
}
