package ${{values.java_package_name}}.controller;
import ${{values.java_package_name}}.entity.${{values.resource_name}};
import ${{values.java_package_name}}.service.DerbyIntegrationService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@RestController
public class ${{ values.component_id }}Controller {

    @Value("${spring.application.username}")
    String username;

    @Value("${spring.application.name}")
    String appname;

    @RequestMapping("/service/health")
    public String hello()
    {
        return "Hello World, "+username + "from " + appname;
    }

    @Autowired
    private DerbyIntegrationService derbyIntegrationService;

    @RequestMapping("/customers")
    public List<${{values.resource_name}}> get${{values.resource_name}}List(){
        return derbyIntegrationService.getCustomerList();
    }

    @RequestMapping(method = RequestMethod.POST, value="/customers")
    public void create${{values.resource_name}}(@RequestBody ${{values.resource_name}} customer){
        derbyIntegrationService.createCustomer(customer);
        ;
    }

}