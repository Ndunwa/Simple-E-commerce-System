import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // a. Creating instances of products, customers, and orders.
        Product product1 = new Product(1, "Laptop", 1000);
        Product product2 = new Product(2, "Smartphone", 600);
        Product product3 = new Product(3, "Headphones", 2500);

        // customer
        Customer customer = new Customer(1, "Kene Ndunwa");

        // adding products to the shopping cart
        customer.addProductToCart(product1);
        customer.addProductToCart(product2);

        // Display shopping cart and total cost
        System.out.println("Shopping Cart:");
        for (Product product : customer.getShoppingCart()) {
            System.out.println(product);
        }
        System.out.println("Total Cost: " + customer.calculateTotalCost());

        //  placing an order
        Order order = new Order(1, customer, customer.getShoppingCart());

        // Display order summary
        System.out.println("\nOrder Summary:");
        System.out.println(order.getOrderSummary());

        // Error handling example: Attempt to remove a product not in the cart
        try {
            customer.removeProductFromCart(product3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
