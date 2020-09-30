import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int HI, HF, TOTAL;
        HI = teclado.nextInt();
        HF = teclado.nextInt();
        TOTAL = HF-HI;
        if (TOTAL<=0) {
            TOTAL= TOTAL+24;
        }
        System.out.println("O JOGO DUROU " +TOTAL + " HORA(S)");
    }
}    
    
