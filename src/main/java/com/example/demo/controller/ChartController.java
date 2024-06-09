/*
 * Author : Naveen Kumar
 * Date : 09-06-2024
 * Created With : IntelliJ IDEA Community Edition
 */

package com.example.demo.controller;

import com.example.demo.model.Chart;
import com.example.demo.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/charts")
public class ChartController {

    @Autowired
    private ChartService chartService;

    public ChartController(ChartService chartService) {
        this.chartService = chartService;
    }

    @GetMapping
    public List<Chart> getAllCharts() {
        return chartService.getAllCharts();
    }
}
