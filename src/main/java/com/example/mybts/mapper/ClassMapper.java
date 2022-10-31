package com.example.mybts.mapper;

import java.util.List;
import com.example.mybts.model.Class;
public interface ClassMapper {

    List<Class> selectLike(Class c);
}
