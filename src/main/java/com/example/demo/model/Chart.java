/*
 * Author : Naveen Kumar
 * Date : 09-06-2024
 * Created With : IntelliJ IDEA Community Edition
 */

package com.example.demo.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "chartcollection")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Chart {
    @Id
    private String id;
    private String endYear;
    private Integer intensity;
    private String sector;
    private String topic;
    private String insight;
    private String url;
    private String region;
    private String startYear;
    private String impact;
    private String added;
    private String published;
    private String country;
    private Integer relevance;
    private String pestle;
    private String source;
    private String title;
    private Integer likelihood;


}
