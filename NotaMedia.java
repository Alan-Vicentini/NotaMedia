import java.util.Scanner;

public class NotaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media, nota1, nota2, nota3;
        double menorNota;
        System.out.println("Digite a nota A1: ");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a nota A2: ");
        nota2 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a nota A3: ");
        nota3 = Double.parseDouble(sc.nextLine());
        if ((nota1 <= nota2) && (nota1 <= nota3)) {
            menorNota = nota1;            
        }

        else{

            if ((nota2 <= nota1) && (nota2 <= nota3)) {
                menorNota = nota2;                
            }
            else{
                menorNota = nota3;
            }
        }
        media = (((nota1 + nota2 + nota3) - menorNota)) / 2.0;
        System.out.println("A médida das duas maiores notas é:" + media);
        sc.close();
    }
}