public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        int searchId = 104;

        Product linearResult =
                LinearSearch.search(products, searchId);

        if (linearResult != null)
            System.out.println("Linear Search Found: "
                    + linearResult);
        else
            System.out.println("Product Not Found");


        Product binaryResult =
                BinarySearch.search(products, searchId);

        if (binaryResult != null)
            System.out.println("Binary Search Found: "
                    + binaryResult);
        else
            System.out.println("Product Not Found");
    }
}