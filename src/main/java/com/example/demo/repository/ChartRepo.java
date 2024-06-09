/*
 * Author : Naveen Kumar
 * Date : 09-06-2024
 * Created With : IntelliJ IDEA Community Edition
 */

package com.example.demo.repository;

import com.example.demo.model.Chart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChartRepo extends MongoRepository<Chart, String> {
}
