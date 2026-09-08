public class AlgoritmoDoze {
    public static void main(String[] args){

            int numero = Integer.parseInt(IO.readln("Digite um número inteiro: "));
        if(numero % 2 == 0){
            IO.println("O número é par");
        }else{
            IO.println("O número é ímpar");
        }
    }
}
