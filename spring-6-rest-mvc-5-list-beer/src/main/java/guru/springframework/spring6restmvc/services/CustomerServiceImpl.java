package guru.springframework.spring6restmvc.services;
import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.model.BeerStyle;
import guru.springframework.spring6restmvc.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    private Map<UUID, Customer> customerMap;

    public  CustomerServiceImpl(){
        this.customerMap = new Hashtable<>();

        Customer cus1 = Customer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .customerName("David Millet")
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer cus2 = Customer.builder()
                .id(UUID.randomUUID())
                .version(2)
                .customerName("Oglov Copenheggan")
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer cus3 = Customer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .customerName("Nia Dravidov")
                .lastModifiedDate(LocalDateTime.now())
                .build();

        customerMap.put(cus1.getId(), cus1);
        customerMap.put(cus2.getId(), cus2);
        customerMap.put(cus3.getId(), cus3);

    }



    @Override
    public List<Customer> listCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getCustomerById(UUID id) {
        log.debug("Get Customer by Id - in service. Id: " + id.toString());
        return customerMap.get(id);
    }
}
