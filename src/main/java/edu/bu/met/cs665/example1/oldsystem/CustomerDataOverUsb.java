/**
 * Assignment-4
 * Description: implement a software system that can allow the interface of the old system
 * to be used as the new interface and is able to convert these two interfaces.
 */

package edu.bu.met.cs665.example1.oldsystem;

import edu.bu.met.cs665.example1.other.Customer;

/**
 * old interface and is able to convert these two interfaces. Interface:This is the adaptee
 * interface old way.
 */
public interface CustomerDataOverUsb {

  String showUsbCustomer(Customer c);

  String getUsbConnectCustomer(Customer c);
}
