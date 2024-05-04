import java.io.File;

public class CreateFile {
    public CreateFile(String file) {
        try{

            File myFile = new File(file);
            myFile.createNewFile();
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        }
    }

