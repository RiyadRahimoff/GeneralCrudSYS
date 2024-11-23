package productp;

import java.util.List;

public interface ProductService {
    void add(String productName, int price);

    void delete(int id);

    void update(int id, String productName, int price);

    Product get(int id);

    List<Product> getAll();
}
