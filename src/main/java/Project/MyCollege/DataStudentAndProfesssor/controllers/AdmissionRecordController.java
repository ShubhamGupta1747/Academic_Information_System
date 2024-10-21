package Project.MyCollege.DataStudentAndProfesssor.controllers;

import Project.MyCollege.DataStudentAndProfesssor.entities.AdmissionRecordEntity;
import Project.MyCollege.DataStudentAndProfesssor.services.AdmissionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/Admission")
public class AdmissionRecordController {
    @Autowired
    AdmissionRecordService admissionRecordService;

//    ADD TABLE
    @PostMapping("/addStudent")
    public AdmissionRecordEntity addAdmissionRecord(@RequestBody AdmissionRecordEntity AdmissionRecord) {
        return admissionRecordService.addAdmissionRecord(AdmissionRecord);
    }


//    GET ALL STUDENT
    @GetMapping("/getAll")
    public List<AdmissionRecordEntity> getAllStudent(){
        return admissionRecordService.getAllStudent();
    }


//get record by id
    @GetMapping("/getStudentById")
    public Optional<AdmissionRecordEntity> getAllStudentById(Long id){
        return admissionRecordService.getStudentById(id);
    }


    //delete by id
    @PostMapping("/deleteById")
    public String deleteStudentbyId(Long id){
        admissionRecordService.deleteById(id);
        return "id "+ id +" is deleted in database.";
    }

    @GetMapping("/getStudentsById")
    public List<AdmissionRecordEntity> getStudentsById(@RequestBody List<Long> ids) {
        return admissionRecordService.getStudentsById(ids);
    }

    @GetMapping("/deleteAllByIds")
    public String deleteAllByIds(@RequestBody List<Long> id) {
        admissionRecordService.deleteAllByIds(id);
        return "delete in data base all id which you given me in list";
    }
    @PostMapping("/updateEndTime")
    public String updateEndTime(@RequestBody AdmissionRecordEntity request) {
        Long id = request.getId();
        LocalDateTime updateDateString=request.getUpdateDate();
        admissionRecordService.updateEndTime1(id, updateDateString);
        return "Id " + id + " is updated time.";
    }


//    @GetMapping("/external")
//    public List<AdmissionRecordEntity> getAllAdmissionRecordsFromExternalService() {
//        List<AdmissionRecordEntity> records = admissionRecordService.getAllAdmissionRecordsFromExternalService();
//        return records;
//    }


}
