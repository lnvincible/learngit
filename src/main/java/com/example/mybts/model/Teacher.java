package com.example.mybts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private long id;
    private String Name;
    private String work_number;
    private String id_card;
    private String school;
    private String sex;
}
