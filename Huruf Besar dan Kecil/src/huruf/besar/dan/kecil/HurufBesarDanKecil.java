package huruf.besar.dan.kecil;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class HurufBesarDanKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf besar: " + hurufBesar);
        System.out.println("Huruf kecil: " + hurufKecil);
    }
    
}
