public class AlgoritmoQuatorze {
    public static void main(String[] args) {
        int op = Integer.parseInt(IO.readln("Informe um número de 1 a 3: "));
        switch (op) {
            case 1: IO.print(" jogo iniciado");
                break;
            case 2: IO.print( " suas vidas estão acabando");
                break;
            case 3: IO.print("Game Over!");
        
            default:IO.println("Número inválido");
                break;            
        }
    }
    
}
