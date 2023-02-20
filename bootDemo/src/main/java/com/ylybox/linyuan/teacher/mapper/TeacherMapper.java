package com.ylybox.linyuan.teacher.mapper;

import com.ylybox.linyuan.teacher.Bean.TeacherVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeacherMapper {


    public List<TeacherVO> listTeacher(Map<String,Object> param);


    public int insert(TeacherVO teacherVO);


    public int update(TeacherVO teacherVO);

    public int delete(String id);
}
