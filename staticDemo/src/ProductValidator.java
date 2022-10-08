public class ProductValidator {

    static {
        System.out.println("Statik yapıcı blok çalışır.");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalışır.");
    }
    public static boolean isValid(Product product){
        return product.getUnitPrice() > 0 && !product.getName().isEmpty();
    }
}
