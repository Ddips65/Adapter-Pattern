/**
 * Assignment-4
 * Description: Software system  that can allow the interface of the old system
 * to be used as the new interface and is able to convert these two interfaces.
 * It is Adapter class.
 */

package edu.bu.met.cs665.example1.adapterpattern;

import edu.bu.met.cs665.example1.newsystem.CustomerDataOverHttps;
import edu.bu.met.cs665.example1.oldsystem.CustomerDataOverUsb;
import edu.bu.met.cs665.example1.other.Customer;

/** class UsbToHttpsAdapter implement old way data access, CustomerDataOverUsb interface. */
public class UsbToHttpsAdapter implements CustomerDataOverUsb {

  private CustomerDataOverHttps custDataHttps;

  /**
   * UsbToHttpsAdapter constructor take CustomerDataOverHttps. *
   *
   * @param custDataHttps CustomerDataOverHttps
   */
  public UsbToHttpsAdapter(CustomerDataOverHttps custDataHttps) {
    this.custDataHttps = custDataHttps;
  }

  /**
   * Get the data old way using getUsbConnectCustomer.
   *
   * @param c Customer
   * @return get old way of the data.
   */
  @Override
  public String getUsbConnectCustomer(Customer c) {
    return custDataHttps.getHttpsConnectCustomer(c);
  }

  /**
   * print the data old way using getUsbConnectCustomer.
   *
   * @param c Customer
   * @return new way of the data.
   */
  @Override
  public String showUsbCustomer(Customer c) {
    return custDataHttps.printHttpsCustomer(c);
  }
}
