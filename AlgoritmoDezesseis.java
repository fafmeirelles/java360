public class AlgoritmoDezesseis {
      public static void main(String[] args) {
        int numero = 1;
        //int numero = Integer.parseInt(IO.readln("Informe o Primeiro Número: "));
        while(numero <= 200){
           if(numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;
        }
    }
}
