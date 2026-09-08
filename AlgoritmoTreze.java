public class AlgoritmoTreze {
    public static void main(String[] args){
        int num1 = Integer.parseInt(IO.readln("Informe o primeiro número: "));
        int num2 = Integer.parseInt(IO.readln("Informe o segundo número: "));
        if(num1 > num2){
            IO.println("O primeiro número é maior" + num1);
        }else if(num1 < num2){
            IO.println("O segundo número é o maior: " + num2);
        }else{
            IO.println("O número dois é o maior: " + num2);
        }
        }
    }
    

