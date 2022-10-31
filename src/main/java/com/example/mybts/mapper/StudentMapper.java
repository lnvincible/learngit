package com.example.mybts.mapper;

import com.example.mybts.model.Student;
import com.example.mybts.model.StudentSexEnum;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.*;

public interface StudentMapper {
    @Insert("insert into student(student_name,student_sex,grade,major)" +
            "values(#{studentName},#{studentSex},#{grade},#{major})")
    void insert(Student student);

    @Select("select * from student where id = #{id} ")
    @Results({
            @Result(property = "studentName", column = "student_name"),
            @Result(property = "studentSex", column = "student_sex",javaType = StudentSexEnum.class)
    })
    Student getOne(long id);

    @Update("update student set student_name=#{studentName} where id=#{id}")
    void update(Student student);

    @Delete("delete from student where id=#{id}")
    void delete(long id);
}
