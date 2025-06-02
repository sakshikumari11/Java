import java.io.*;

public class Reader {
    public static void main(String[] args) {
        try {
            File f = new File("Input.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String l;
            while ((l = br.readLine()) != null) {
                System.out.println(l);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
