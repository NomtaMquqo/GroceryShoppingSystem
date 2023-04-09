/**
 * ICustomerRepository.java
 * This is a repository interface for Customer class
 * @author Sinentlahla Pindani 219081328
 * 08 April 2023
 */
package repository;

import domain.Category;
import domain.Customer;

import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer, String>{

    public Set<Customer> getAll();
}
