package com.example.mybts.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String  name;
    private String grade;
    private String major;
    private int number;

}
