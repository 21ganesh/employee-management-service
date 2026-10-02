package employee_crud.data.Repository;

import employee_crud.data.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("NullableProblems")
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
