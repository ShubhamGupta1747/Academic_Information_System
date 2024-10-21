package Project.MyCollege.DataStudentAndProfesssor.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Professor")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String ProfessorName;

    @Column
    private List<String> ProfessorSubject;

    @Column
    private List<String> StudentName;
}
