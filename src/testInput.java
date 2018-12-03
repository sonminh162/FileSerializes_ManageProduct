import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class testInput {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("D:\\test.txt"));
            Product product = (Product)ois.readObject();
            System.out.println(product.toString());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            ois.close();
        }
    }
}