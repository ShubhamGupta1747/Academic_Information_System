package Project.MyCollege.DataStudentAndProfesssor.services;

import Project.MyCollege.DataStudentAndProfesssor.entities.AdmissionRecordEntity;
import Project.MyCollege.DataStudentAndProfesssor.repositories.AdmissionRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Configuration
@Service
public class AdmissionRecordService{
    @Autowired
    AdmissionRecordRepository  admissionRecordRepository;


    //Add Student
    public AdmissionRecordEntity addAdmissionRecord(AdmissionRecordEntity admissionRecord){
        return admissionRecordRepository.save(admissionRecord);
    }


    public List<AdmissionRecordEntity> getAllStudent() {
        return admissionRecordRepository.findAll();
    }


    public Optional<AdmissionRecordEntity> getStudentById(Long id){
        return admissionRecordRepository.findById(id);

    }


    public void deleteById(Long id) {
        admissionRecordRepository.deleteById(id);
    }

    public List<AdmissionRecordEntity> getStudentsById(List<Long> id){
        return admissionRecordRepository.findAllById(id);

    }

    public void deleteAllByIds(List<Long> id) {
        admissionRecordRepository.deleteAllByIdInBatch(id);
    }
    
    public AdmissionRecordEntity saveEmployee(AdmissionRecordEntity admissionRecord) {
        return admissionRecordRepository.save(admissionRecord);
    }

    public void updateEndTime1(Long id, LocalDateTime updateDate) {
        Optional<AdmissionRecordEntity> ans=admissionRecordRepository.findById(id);
        AdmissionRecordEntity admissionRecord = ans.get();
        admissionRecord.setUpdateDate(updateDate);
        admissionRecordRepository.save(admissionRecord);

    }



//    private final RestTemplate restTemplate;
//
//    @Value("${AdmissionRecord.base.url}")
//    private String baseUrl;
//
//    public List<AdmissionRecordEntity> getAllAdmissionRecordsFromExternalService() {
//        String url = baseUrl + "Admission";
//        return restTemplate.getForObject(url, List.class);
//    }





}
