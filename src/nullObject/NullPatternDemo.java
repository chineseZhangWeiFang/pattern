package nullObject;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CumtomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CumtomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CumtomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CumtomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
