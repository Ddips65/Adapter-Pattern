package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.other.Customer;

public class Main {
  /**
   * A main method to run examples.
   *
   * @param args String[]
   */
  public static void main(String[] args) {

    Customer customer1 = new Customer(11, "Keli");
    System.out.println(customer1.dataAccess());
    System.out.println(customer1.showCustomerData());

    Customer customer2 = new Customer(51, "Backy");
    System.out.println(customer2.dataAccess());
    System.out.println(customer2.showCustomerData());
  }
}
