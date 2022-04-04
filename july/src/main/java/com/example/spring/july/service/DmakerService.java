package com.example.spring.july.service;

import com.example.spring.july.entity.Developer;
import com.example.spring.july.repository.DeveloperRepository;
import com.example.spring.july.type.DeveloperLevel;
import com.example.spring.july.type.DeveloperSkillType;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class DmakerService {
    private final DeveloperRepository developerRepository;

    @Transactional
    public void createDeveloper(){
        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.NEW)
                .developerSkillType(DeveloperSkillType.BACK_END)
                .experienceYears(2)
                .name("Olaf")
                .age(5)
                .build();


        developerRepository.save(developer);

    }
}
