import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        // aqui vou declarar as variáveis
        int x; //representando a distância
        float y; //representando o consumo
        float media; //representando a media do consumo

        //entrada
        x = teclado.nextInt(); // espera o usuário digitar o valor
        y = teclado.nextFloat(); // espera o usuário digitar um valor real 
    // processamento
        media = x/y;
        //saida
        System.out.printf("%.3f km/l\n",media);
    }
}


