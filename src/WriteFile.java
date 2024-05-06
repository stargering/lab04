import java.io.FileWriter;
import java.io.IOException;
import java.lang.Throwable;

public class WriteFile {
    String filePath;
    public WriteFile(String filePath){
        this.filePath = filePath;
    }

    public void addString(String add){
        try{
            FileWriter writeSomething = new FileWriter(filePath);
            writeSomething.write(add);
            writeSomething.close();
        }catch(IOException e){
            System.out.println(e);
            e.printStackTrace();
        }

    }

    public void addInt(int add){
        try{
            FileWriter writeSomething = new FileWriter(filePath);
            writeSomething.write(Integer.toString(add));
            writeSomething.close();
        }catch(IOException e){
            System.out.println(e);
            e.printStackTrace();
        }

    }

}
