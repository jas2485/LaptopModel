public class Main {
    public static void main(String[] args) {
        try {
            Laptop laptop1 = new Laptop("Dell", "Intel i7", 16, 1200.50);
            System.out.println(laptop1);

            Laptop laptop2 = new Laptop("HP","Intel i5", 8, 699.95);
            System.out.println(laptop2);

            // Test validation error
            Laptop laptop3 = new Laptop("", "AMD Ryzen 5", 8, 800.0); // Invalid brand

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
