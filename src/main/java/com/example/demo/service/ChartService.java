/*
 * Author : Naveen Kumar
 * Date : 09-06-2024
 * Created With : IntelliJ IDEA Community Edition
 */

package com.example.demo.service;

import com.example.demo.model.Chart;
import com.example.demo.repository.ChartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartService {

    @Autowired
    private ChartRepo chartRepo;

    public ChartService(ChartRepo chartRepo) {
        this.chartRepo = chartRepo;
    }

    public List<Chart> getAllCharts() {
        return chartRepo.findAll();
    }


}
