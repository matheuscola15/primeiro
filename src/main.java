import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*Considerando que para um consórcio, sabe-se o número total de prestações,
        a quantidade de prestações pagas e  o  valor  atual  da  prestação,
        escreva  um  algoritmo  que  determine  o  total  pago  pelo  consorciado  e  o  saldo devedor.
         */
        Scanner sc = new Scanner(System.in);

        prestacao consorcio = new prestacao();

        consorcio.total = 10;
        consorcio.qntd = 4;
        consorcio.atual = 100;

        System.out.println(consorcio.getConsorcio());

        prestacao calc = new prestacao();

        System.out.println("---------------------------------------------");
        System.out.println("total  pago  pelo  consorciado: " + consorcio.getCalc());
        System.out.println("---------------------------------------------");
        System.out.println("saldo devedor: " + consorcio.getSaldo());
    }
}
