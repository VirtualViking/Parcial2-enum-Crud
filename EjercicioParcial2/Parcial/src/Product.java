public class Product {

    public Integer id;
    private String productName;
    private String category;
    private double quantity;

    public Product(Integer id, String productName, String category, double quantity ){
        id= id;
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }
}
