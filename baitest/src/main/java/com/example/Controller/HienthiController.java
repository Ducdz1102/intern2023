/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Controller;

import com.example.ServiceImpl.TienlaiServiceImpl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nguye
 */
@RestController
@RequestMapping("/doanhthu")
public class HienthiController {

    @Autowired
    private TienlaiServiceImpl tlservice;

    @GetMapping("/forweek/{weekNumber}")
    public Integer getTotalLaiForWeek(@PathVariable Integer weekNumber) {
        return tlservice.getTotalLaiForWeek(weekNumber);
    }

    @GetMapping("/allweek")
    public ResponseEntity<List<Object[]>> getAllTuan() {
        List<Object[]> result = tlservice.getAllWeek();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/allday")
    public ResponseEntity<List<Object[]>> getAllDay() {
        List<Object[]> laiTheoNgay = tlservice.getAllDay();
        return ResponseEntity.ok(laiTheoNgay);
    }
}
