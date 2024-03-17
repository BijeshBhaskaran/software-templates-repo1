package ${{values.java_package_name}}.repository;

import ${{values.java_package_name}}.entity.${{values.resource_name}};
import org.springframework.data.repository.CrudRepository;

public interface ${{values.resource_name}}Repo extends CrudRepository<${{values.resource_name}}, Integer> {

}



