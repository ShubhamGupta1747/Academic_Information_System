package Project.MyCollege.DataStudentAndProfesssor.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String StudentName;

    @Column
    private List<String> professorName;

    @Column
    private List<String> subjectName;

}
