public class Estudos02 {
    public static void main(String[] args){
        // Operadores
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        // output: 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        // output: 1111

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        // output: 1111

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        // output: 1111

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        // output: 13
    }
}
