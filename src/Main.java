import java.util.ArrayList;public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Book <Alice in Wonderland> ", 1, 4.3);
        Product product2 = new Product("Vase ", 10, 5.0);
        Product product3 = new Product("Doormat", 29, 4.2);
        // Создание категорий
        Category category1 = new Category("Books");
        category1.addProduct(product1);
        Category category2 = new Category("Household goods ");
        category2.addProduct(product2);
        category2.addProduct(product3);
        // Вывод каталога продуктов        System.out.println("Product catalog:");
        System.out.println("Category: " + category1.name);
        for (Product product : category1.products) {
            System.out.println( product.name + ", Price: $"
                    + product.price + ", Raiting: " + product.rating);        }
        System.out.println("Category: " + category2.name);
        for (Product product : category2.products) {
            System.out.println("  - " + product.name + ", Price: $"
                    + product.price + ", Raiting: " + product.rating);        }
        User user1 = new User("First person ", "password1");
        User user2 = new User("Second person", "password2");
        user1.add_product_toBasket(product1);
        user2.add_product_toBasket(product2);
        user2.add_product_toBasket(product3);
        System.out.println();
        System.out.println("User purchases:");
        System.out.println("User: " + user1.username);
        for (Product product : user1.basket.products) {
            System.out.println( " " + product.name + ", Price: $"
                + product.price + ", Raiting: " + product.rating);        }
        System.out.println("User: " + user2.username);
        for (Product product : user2.basket.products) {
            System.out.println(" "+ product.name + ", Price: $"
                    + product.price + ", Raiting: " + product.rating);
        }
    }
}
class Product {    public String name;
    public int price;
    public double rating;
    public Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}
class Category {
    public String name;
    ArrayList<Product> products;
    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }}
class Basket {    ArrayList<Product> products;
    public Basket() {
        products = new ArrayList<>();    }
    public void addProduct(Product product) {
        products.add(product);    }
}class User {
    public  String username;
    public  String password;
    Basket basket;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.basket = new Basket();
    }
    public void add_product_toBasket(Product product) {
        basket.addProduct(product);
    }
}