package com.example.mybts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private long id;
    private String studentName;
    private StudentSexEnum  studentSex;
    private String grade;
    private String major;

//    public Student(){}
//
//    public Student(String studentName,StudentSexEnum studentSex,String grade,String major){
//        this.studentName=studentName;
//        this.studentSex=studentSex;
//        this.grade=grade;
//        this.major=major;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentSex=" + studentSex +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public StudentSexEnum getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(StudentSexEnum studentSex) {
        this.studentSex = studentSex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
