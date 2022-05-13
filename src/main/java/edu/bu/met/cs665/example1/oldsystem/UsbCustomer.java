package edu.bu.met.cs665.example1.oldsystem;

import edu.bu.met.cs665.example1.other.Customer;

/** Implement old way system. */
public class UsbCustomer implements CustomerDataOverUsb {

  public int id;

  /**
   * old way to show the data.
   *
   * @param c Customer
   * @return OLD USB connection old customer id.
   */
  @Override
  public String showUsbCustomer(Customer c) {
    // System.out.println("USB connection with customer id:" + c.getId());
    return ("USB connection with customer id: " + c.getCustomerId());
  }

  /**
   * Get customer data old way.
   *
   * @param c Customer
   * @return old USB connection get customer name.
   */
  @Override
  public String getUsbConnectCustomer(Customer c) {
    // System.out.println("USB connection with customer's name " + c.getName() + c.getId());
    return ("USB! customer's name is: " + c.getCustomerName() + " with id: " + c.getCustomerId());
  }
}
