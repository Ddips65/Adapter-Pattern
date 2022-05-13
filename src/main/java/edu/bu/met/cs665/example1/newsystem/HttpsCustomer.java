/**
 * Assignment-4
 * Description: Software system that can allow the interface of the old system
 * to be used as the new interface and is able to convert these two interfaces.
 */

package edu.bu.met.cs665.example1.newsystem;

import edu.bu.met.cs665.example1.other.Customer;

public class HttpsCustomer implements CustomerDataOverHttps {

  /**
   * new way to access customer id.
   *
   * @param c Customer
   * @return new way to access data
   */
  @Override
  public String getHttpsConnectCustomer(Customer c) {
    // System.out.println("HTTPS connection with customer id: " + c.getId());
    return "HTTPS connection with customer id: " + c.getCustomerId();
  }

  /**
   * new way to access name of the customer.
   *
   * @param c Customer
   * @return new way to access data
   */
  @Override
  public String printHttpsCustomer(Customer c) {
    // System.out.println("HTTPS connection with customer's name " + c.getName() + c.getId());
    return ("HTTPS customer's name is: " + c.getCustomerName() + " with id: " + c.getCustomerId());
  }
}
