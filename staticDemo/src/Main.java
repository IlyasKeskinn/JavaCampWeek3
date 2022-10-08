public class Main {

    public static void main(String[] args) {

        Product product  = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setUnitPrice(10000);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}
