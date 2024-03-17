package ${{values.java_package_name}}.service;

import ${{values.java_package_name}}.entity.${{values.resource_name}};
import ${{values.java_package_name}}.repository.${{values.resource_name}}Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DerbyIntegrationService {

    @Autowired
    private ${{values.resource_name}}Repo customerRepo;

    public List<${{values.resource_name}}> getCustomerList(){
        List<${{values.resource_name}}> customerList = new ArrayList<>();
        customerRepo.findAll().forEach(customerList::add);
        return customerList;
    }

    public void createCustomer(${{values.resource_name}} customer){
        customerRepo.save(customer);
    }
}
