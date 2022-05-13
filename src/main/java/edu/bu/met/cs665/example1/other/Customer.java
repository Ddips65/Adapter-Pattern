/**
 * Assignment-4
 * Description: Software system  that can allow the interface of the old system
 * to be used as the new interface and is able to convert these two interfaces.
 */

package edu.bu.met.cs665.example1.other;

import edu.bu.met.cs665.example1.adapterpattern.UsbToHttpsAdapter;
import edu.bu.met.cs665.example1.newsystem.CustomerDataOverHttps;
import edu.bu.met.cs665.example1.newsystem.HttpsCustomer;
import edu.bu.met.cs665.example1.oldsystem.CustomerDataOverUsb;

/** Class: Customer class that need to access the data and to print the Customer. */
public class Customer {
  public int customerId;
  public String customerName;

  /**
   * parametrize constructor.
   *
   * @param customerId int
   * @param customerName String
   */
  public Customer(int customerId, String customerName) {
    this.customerId = customerId;
    this.customerName = customerName;
  }

  /**
   * get customer id.
   *
   * @return id
   */
  public int getCustomerId() {
    return customerId;
  }

  /**
   * set customer id.
   *
   * @param customerId int
   */
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  /**
   * get customer name.
   *
   * @return String
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * set customer name.
   *
   * @param customerName String
   */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  /**
   * An adaptee is the new version of access the data. An adapter is the old way to access the data.
   * Calling in the adapter the old method.
   *
   * @return old way to display data
   */
  public String dataAccess() {

    CustomerDataOverHttps customerDataHttps = new HttpsCustomer();
    CustomerDataOverUsb adapter = new UsbToHttpsAdapter(customerDataHttps);
    return adapter.getUsbConnectCustomer(this);
  }

  /**
   * An adaptee, the new version to print the customer. An adapter, the old way to print the
   * customer. Calling in the adapter the old method.
   *
   * @return old way to show data
   */
  public String showCustomerData() {

    CustomerDataOverHttps customerDataHttps = new HttpsCustomer();
    CustomerDataOverUsb adapter = new UsbToHttpsAdapter(customerDataHttps);
    return adapter.showUsbCustomer(this);
  }
}
