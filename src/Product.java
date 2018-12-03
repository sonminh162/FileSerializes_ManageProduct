import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String model;
    private int price;
    private String note;

    public Product(){

    }
    public Product(int productId,String productName, String model, int price, String note){
        this.productId = productId;
        this.productName = productName;
        this.model = model;
        this.price = price;
        this.note = note;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public int getProductId(){
        return productId;
    }
    @Override
    public String toString(){
        return "Product@[ ID = "+productId+",Name: "+productName+",Model: "+model+",Price: "+price+",Note: "+note+"]";
    }
}
