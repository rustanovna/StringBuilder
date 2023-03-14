import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("AlphabitEnglishAndNumbers");
            char h='a';
        for (char i = 'A'; i <= 'Z'; i++) {
            fw.write(i);
            fw.write(h+"\n");
            h++;
        }
            for (int j = 0; j <= 10; j++) {
                fw.write(j + "\n");
            }

        fw.close();
        FileReader fr=new FileReader("AlphabitEnglishAndNumbers");
        Scanner s =new Scanner(fr);
        int o=0;
        while (s.hasNextLine()){
            o++;
            System.out.println(o+":"+s.nextLine());
        }

    }
}