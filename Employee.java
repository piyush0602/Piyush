package com.example.demo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Getter
@Setter
@Document(collection = "employee")

public class Employee {

    @Id
    private String id;

    private String name;

    private String city;

    private String phone;

    private String project;

    private String mobileName;
    private String laptop;
    private String newCar;
    private String newMobile;

}
