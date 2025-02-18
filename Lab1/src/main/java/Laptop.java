public class Laptop {
    private String brand;
    private String processor;
    private int ram; // in GB
    private double price;

    public Laptop(String brand, String processor, int ram, double price) {
        setBrand(brand);
        setProcessor(processor);
        setRam(ram);
        setPrice(price);
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
        this.brand = brand;
    }

    public void setProcessor(String processor) {
        if (processor == null || processor.trim().isEmpty()) {
            throw new IllegalArgumentException("Processor cannot be null or empty.");
        }
        this.processor = processor;
    }

    public void setRam(int ram) {
        if (ram <= 0) {
            throw new IllegalArgumentException("RAM must be greater than 0GB.");
        }
        this.ram = ram;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram + "GB" +
                ", price=$" + price +
                '}';
    }
}
