package productp;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceHandler implements ProductService {
    ArrayList<Product> products = new ArrayList<>();
    private int idAuto = 1;
    private int count = 0;

    @Override
    public void add(String productName, int price) {
        products.add(new Product(idAuto, productName, price));
        System.out.println("Product added sucessfully!");
        idAuto++;
        count++;
    }

    @Override
    public void delete(int id) {
        try {
            products.remove(id - 1);
            System.out.println("Product removed!");
        } catch (IndexOutOfBoundsException exp) {
            System.out.println("Product not found");
        }
    }

    @Override
    public void update(int id, String productName, int price) {
        try {
            Product product = products.get(id - 1);
            product.setProductName(productName);
            product.setPrice(price);
        } catch (RuntimeException exp) {
            System.out.println("Id is incorrect");
        }
    }

    @Override
    public Product get(int id) {
        try {
            return products.get(id - 1);

        } catch (RuntimeException exception) {
            System.out.println("Id is incorrect!");
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void count() {
        System.out.println("Product count in your data:  " + count);
    }
}
