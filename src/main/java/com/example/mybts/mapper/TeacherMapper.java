package com.example.mybts.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybts.model.Teacher;

import java.io.Serializable;

public interface TeacherMapper
    extends BaseMapper<Teacher> {
    @Override
    Teacher selectById(Serializable id);

}
