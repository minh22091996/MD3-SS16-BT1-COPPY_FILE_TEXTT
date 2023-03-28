import java.io.*;

public class Main {
    public static void main(String[] args) {
       copyFire("src/text1.txt","src/text2.txt");
    }
    public static void copyFire(String path1,String path2){
        try {
            FileReader fileReader = new FileReader(path1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(path2,true);
            String line;
            int count = 0;
            while ((line=bufferedReader.readLine())!=null){
                fileWriter.write((line + "\n"));
                count+=line.length();
                System.out.println(line);
            }
            fileWriter.close();
            System.out.println("so lan xuat hien cua ki tu la " + count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("k thay");
        } catch (IOException e) {
            throw new RuntimeException("k thay file");
        }
    }
}