package employee_crud.data.Service;

import employee_crud.data.Entity.EmployeeEntity;
import jakarta.validation.Valid;

public interface EmployeeService {
    EmployeeEntity createEmployee(EmployeeEntity emp);
}
