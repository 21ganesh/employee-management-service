package employee_crud.data.Controller;

import employee_crud.data.Entity.EmployeeEntity;
import employee_crud.data.Service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/emp")
@SuppressWarnings("NullableProblems")
public class EmployeeController {

    @Autowired
    public EmployeeService service;

   // Logger log = (Logger) LoggerFactory.getLogger(EmployeeController.class);



    @PostMapping("/create")
    public ResponseEntity<EmployeeEntity> createEmployee( @Valid @RequestBody EmployeeEntity emp)
    {


        EmployeeEntity em = service.createEmployee(emp);


        return ResponseEntity.ok(em);
    }

}
