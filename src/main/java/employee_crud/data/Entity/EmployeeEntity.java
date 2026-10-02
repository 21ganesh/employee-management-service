package employee_crud.data.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name="empName")
    private String name;
    @NonNull
    private String gender;
    @NonNull
    private String address;
    @NonNull
    private String department;
    @NonNull
    private String emailId;
    @NonNull
    private Double salary;

}
