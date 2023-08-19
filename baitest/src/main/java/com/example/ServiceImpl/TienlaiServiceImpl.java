/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ServiceImpl;

import com.example.Repository.TienlaiRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nguye
 */
@Service
public class TienlaiServiceImpl {
    @Autowired
    private TienlaiRepository tlrepo;

    
    public Integer getTotalLaiForWeek(Integer weekNumber) {
        return tlrepo.getTotalLaiForWeek(weekNumber);
    }

    public List<Object[]> getAllWeek() {
        return tlrepo.getlAllWeek();
    }
    
    public List<Object[]> getAllDay() {
        return tlrepo.getAllDay();
    }
    
}
