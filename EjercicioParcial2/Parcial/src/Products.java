import java.util.List;

public interface Products {

    Product findById(int id);
    List<Product> findAll();
    void save(Product product);
    void update(Product product);
    void delete(Product product);
}
