package com.example.mybts;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybts.mapper.TeacherMapper;
import com.example.mybts.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static net.sf.jsqlparser.util.validation.metadata.NamedObject.column;

@SpringBootTest
public class TeacherMapperTest {
    @Autowired
    TeacherMapper teacherMapper;

    @Test
    void test1(){
        System.out.println(teacherMapper.selectById(1));
    }
    @Test //添加
    void testinsert(){
        System.out.println(teacherMapper.selectCount( null));;
        Teacher teacher =new Teacher();
        teacher.setName("王五");
        teacher.setId_card("12354687894");
        teacher.setSchool("商学院");
        teacher.setWork_number("123456");
        teacherMapper.insert(teacher);
        System.out.println(teacherMapper.selectCount( null));;
    }
    @Test
    void testSelectList(){
        QueryWrapper<Teacher> wrappe = new QueryWrapper<>();
        wrappe.eq("name","张三");
        System.out.println(teacherMapper.selectList(wrappe));;
    }
    @Test //查询
    void testSelectOne(){
        System.out.println( teacherMapper.selectOne(
                new QueryWrapper<Teacher>().eq("id",2)));;
    }

    @Test
    void selectIds(){
        List<String> idList=new ArrayList<String>();
        idList.add("1");
        idList.add("2");
        idList.add("3");
        System.out.println(teacherMapper.selectBatchIds(idList));;
    }

    @Test
    void updateById(){
        Teacher teacher =new Teacher();
        teacher.setId(2);
        teacher.setSchool("电子技术");
        System.out.println(teacherMapper.updateById(teacher));
    }
    @Test
    void update(){
        Teacher teacher =new Teacher();
        teacher.setName("李四");
        teacherMapper.update(teacher,
                new QueryWrapper<Teacher>().eq("school","商学院"));
    }

    @Test //删除
    void deleteById(){
        System.out.println(teacherMapper.selectById(1));
        teacherMapper.deleteById(1);
        System.out.println(teacherMapper.selectById(1));
    }
    @Test //删除
    void delete(){

        teacherMapper.delete(
                new QueryWrapper<Teacher>().eq("school","商学院"));

    }

    @Test
    public void  Testwrappl(){
        QueryWrapper<Teacher> wrappe = new QueryWrapper<>();
        /*（1）编写测试类查询方法，调用selectList，使用条件构造器，查询二级学院为计算机且性别不为男的教师列表，
        按姓名升序，id升序排列。*/
        //wrappe.ge("id",2).lt("id",10).orderByDesc("school","id_card");

        /*编写测试类查询方法，调用selectList，使用2种条件构造器方法，查询id大于等于2且<10的教师列表，
        按二级学院降序，身份证号码降序排列。*/
       // wrappe.eq("school","计算机").ne("sex","男").orderByAsc("name","id");

        /*编写测试类查询方法，调用selectList，使用条件构造器，查询姓”王”且名字最后一个字是”家”的教师列表，
                按二级学院升序，姓名降序排列。*/
//        wrappe.likeRight("name","王").likeLeft("name","家").orderBy(true,false,"school","name");

  /*编写测试类查询方法，调用selectList，使用条件构造器，查询姓名包含”司”并且不包含”书”，
  并且身份证号不为空的教师列表，按姓名升序，性别降序排列。*/
       // wrappe.like("name","司").notLike("name","书").orderBy(true,false,"name","sex");

    /*（4）编写测试类查询方法，调用selectList，使用条件构造器，按二级学院分组，
    查询人数大于50的二级学院的名称和教师人数，按教师人数升序排列。*/
       // wrappe.select("school,count(*) as id").groupBy("school").having("count(*)>3");

        /*（5）编写测试类查询方法，调用selectList，使用条件构造器，查询二级学院是”计算机“或者性别是女，
        或者姓“王”的教师列表，按id降序排列。*/
        wrappe.eq("school","计算机").or().eq("sex","女").or()
                .likeRight("name","王").orderByDesc("id");
        System.out.println(teacherMapper.selectList(wrappe));
    }

    @Test
    public void page(){
        Page<Teacher> page = new Page<>(2,3);
        page=teacherMapper.selectPage(page,new QueryWrapper<Teacher>().like("name","王")
                .orderByDesc("id"));
        System.out.println("总条数-->"+page.getTotal());
        System.out.println("当前页面-->"+page.getCurrent());
        System.out.println("当前每页显示数-->"+page.getSize());
        System.out.println(page.getRecords());
    }
}
