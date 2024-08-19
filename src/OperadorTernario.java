public class OperadorTernario {

    public static void secundary(String[] args){
        int a, b;

        a = 6;

        b = 6;

        String resultado = "";
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";

        System.out.println(resultado);
    }    

    public static void main(String[] args){
        int a, b;

        a = 6;

        b = 6;

        int resultado = a == b ? 1 : 0;

        System.out.println(resultado);

    }
}
