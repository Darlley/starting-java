import java.util.Scanner;

public class ex07 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int umNumero  = scan.nextInt();
        System.out.println("Informe outro número: ");
        int outroNumero  = scan.nextInt();
        System.out.println("Informe mais um número: ");
        int maisUmNumero  = scan.nextInt();

        if(umNumero > outroNumero && outroNumero > maisUmNumero){
            System.out.println("O menor número é " + maisUmNumero);
        }else if(umNumero > outroNumero && outroNumero < maisUmNumero){
            System.out.println("O menor número é " + outroNumero);
        }else{
            System.out.println("O menor número é " + umNumero);
        }
    }
}
