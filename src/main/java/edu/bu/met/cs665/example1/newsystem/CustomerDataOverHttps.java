/**
 * Assignment-4
 * Description: Software system that can allow the interface of the old system
 * to be used as the new interface and is able to
 * convert these two interfaces.
 */

package edu.bu.met.cs665.example1.newsystem;

import edu.bu.met.cs665.example1.other.Customer;

/**
 * new interface and is able to convert these two interfaces. Interface:This is the adaptee
 * interface new eay.
 */
public interface CustomerDataOverHttps {

  String printHttpsCustomer(Customer c);

  String getHttpsConnectCustomer(Customer c);
}
