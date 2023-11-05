import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class belajarstring {
    // Tipe Data String
    // Merupakan tipe data Non Primitive / reference
    // merupakan penggembangan dari tipe data char
    // string adalah terdiri dari beberapa karakter
    // string juga dapat dikatakan sebagai array of char
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// momery cpu, create new Construct
        System.out.println("masukan kalimat = ");
        String p = reader.readLine();
        //karena string terdiri dari beberapa karakter
        //maka karakter di dalam suatu string dapat dihitung
        // karena String terdiri dari beberapa karakter
        // maka karakter di dalam suatu String dapat dihitung
        // dalam kata lain suatu String memiliki panjang karakter
        // contoh: "saya sedang makan" = ???karakter 17 --> spasi juga termasuk yang dihitung
        // karena sesuai dengan ketentuan ASCII
        // panjang 17 --> indexnya mulai dari 0 - 16
        // String memiliki nilai panjang (length)
        // contoh: String nama = "poltek harber" ---> nama.length = 13
        String nama = "Poltek Harber";
        System.out.println(nama.length());
        char karakter_pertama = nama.charAt(0);
        char karakter_terakhir = nama.charAt(0);
        System.out.println("Karakter pertama adalah : " + karakter_pertama);
        System.out.println("Karakter terakhir adalah : " + karakter_terakhir);

    }
}


