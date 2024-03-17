package ${{values.java_package_name}}.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ${{values.resource_name}} {
    @Id
    private Integer id;

    private String firstName;
    private String lastName;

    public ${{values.resource_name}}() {}

    public ${{values.resource_name}}(Integer id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
