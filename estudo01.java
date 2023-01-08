public class estudo01{
    public static void main(String[]args){
        // data types:
        // int, byte, short, long, float, double, boolean, char

        // Variables // Ex.:
        // float pi = 3.14F
        // long cpf = 98765432100L
        // pi = 3.1415;

        // Constants // Ex.:
        // final type VARIABLE_NAME;
        // final int num = 5;
        
        // Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
        // números 4, 5 e 6. A soma das duas médias. A média das médias.

        double media1, media2, mediaMedias;
        media1 = (8 + 9 + 7) / 3.0;
        media2 = (4 + 5 + 6) / 3.0;

        double soma;

        soma = media1 + media2;
        mediaMedias = soma / 2;

        System.out.println("Média aritmética de 8, 9 e 7: " + media1);
        System.out.println("Média aritmética dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das médias: " + soma);
        System.out.println("Média das médias: " + mediaMedias);

    }
} 