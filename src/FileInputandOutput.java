import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
//salam
public class FileInputandOutput {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
            String s = "I love myself";
            byte[] byteArray = s.getBytes();
            fileOutputStream.write(byteArray);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            int a = 0;
            while ((a = fileInputStream.read()) != -1)
            {
                System.out.print((char) a);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
