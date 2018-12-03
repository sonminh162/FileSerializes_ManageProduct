import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class testOutput {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("D:\\test.txt"));
            Product product = new Product(1,"CASE-PC","APPC",4000000,"HOT");
            oos.writeObject(product);
            System.out.println("Success...");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            oos.close();
        }
    }
}
