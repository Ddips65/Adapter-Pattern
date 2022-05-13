/**
 * Assignment-4
 * Description: Software system that can allow the interface of the old system to be used
 * as the new interface and is able to convert these two interfaces.
 */

package edu.bu.met.cs665.testsystem;

import static org.junit.Assert.assertEquals;
import edu.bu.met.cs665.Main;
import org.junit.Test;
import edu.bu.met.cs665.example1.other.Customer;

/**
 * Test class is performing testing on different method. To check expected output is generated or
 * not.
 */
public class TestSysAccess {

  /** test case for accessing the data new way. */
  @Test
  public void dataAccess() {
    Customer customer = new Customer(11, "Keli");
    assertEquals("HTTPS connection with customer id: 11", customer.dataAccess());
  }

  /** Test case for get customer ID. */
  @Test
  public void testCustomerGetId() {

    Customer customer = new Customer(3, "Lucy");
    assertEquals(3, customer.getCustomerId());
  }

  /** Test case for get customer name */
  @Test
  public void testCustomerGetName() {

    Customer customer = new Customer(3, "Lucy");
    assertEquals("Lucy", customer.getCustomerName());
  }

  /** test main method passing array of the argument. */
  @Test
  public void testMainMethod() {

    String[] args = {"one", "two", "three"};
    Main.main(args);
  }

  @Test
  public void testDisplayUser1() {
    Customer customer = new Customer(11, "Keli");
    assertEquals("HTTPS customer's name is: Keli with id: 11", customer.showCustomerData());
  }

  /** Test case for show customer name with new way. */
  @Test
  public void testDisplayUser2() {

    Customer customer = new Customer(51, "Backy");
    assertEquals("HTTPS customer's name is: Backy with id: 51", customer.showCustomerData());
  }
}
