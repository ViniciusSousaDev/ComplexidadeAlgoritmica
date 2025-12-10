public class ComplexidadeAlgoritmica {

    // Algoritmo O(n): percorre a lista apenas uma vez
    public static void exemploLinear(int[] numeros) {
        int soma = 0;

        // Este loop executa n vezes → complexidade O(n)
        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma (O(n)): " + soma);
    }


    // Algoritmo O(n²): compara todos os pares possíveis
    public static void exemploQuadratico(int[] numeros) {
        int contadorPares = 0;

        // Dois loops aninhados → n * n iterações = O(n²)
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    contadorPares++;
                }
            }
        }

        System.out.println("Número de comparações (O(n²)): " + contadorPares);
    }


    public static void main(String[] args) {

        int[] lista = {3, 1, 5, 2, 4};

        exemploLinear(lista);      // Executa um algoritmo O(n)
        exemploQuadratico(lista);  // Executa um algoritmo O(n²)
    }
}
