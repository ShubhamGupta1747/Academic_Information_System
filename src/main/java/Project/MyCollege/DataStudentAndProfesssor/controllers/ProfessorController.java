package Project.MyCollege.DataStudentAndProfesssor.controllers;

import Project.MyCollege.DataStudentAndProfesssor.entities.ProfessorEntity;
import Project.MyCollege.DataStudentAndProfesssor.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Professor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;


    //    ADD TABLE
    @PostMapping("/addData")
    public ProfessorEntity addData(@RequestBody ProfessorEntity professor) {
        return professorService.addData(professor);
    }


    @GetMapping("/GetAllProfessor")
    public List<ProfessorEntity> GetAllProfessor(){
        return professorService.GetAll();
    }


    @GetMapping("/GetDataByID")
    public Optional<ProfessorEntity> GetDataByID(Long id){
        return professorService.GetDataByID(id);
    }


    @PostMapping("/deleteById")
    public String deleteById(@RequestParam Long id) {
        return professorService.deleteById(id);
    }

    @GetMapping("/getProfessorsBYId")
    public List<ProfessorEntity> getProfessorsBYId(@RequestBody List<Long> id){
        return professorService.getProfessorsBYId(id);
    }

    @GetMapping("/deleteAllByIds")
    public String deleteAllByIds(@RequestBody List<Long> id) {
        professorService.deleteAllByIds(id);
        return "delete in data base all id which you given me in list";
    }

}
