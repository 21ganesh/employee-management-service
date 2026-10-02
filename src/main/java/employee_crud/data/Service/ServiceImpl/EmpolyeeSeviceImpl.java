package employee_crud.data.Service.ServiceImpl;

import employee_crud.data.Entity.EmployeeEntity;
import employee_crud.data.Repository.EmployeeRepository;
import employee_crud.data.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmpolyeeSeviceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity emp) {
        if(emp == null)
        {
            throw  new RuntimeException("Id must be required");
        }


        return repository.save(emp);
    }
}
