package com.ylybox.linyuan.teacher;

import com.ylybox.linyuan.teacher.Bean.TeacherVO;
import com.ylybox.linyuan.teacher.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherService{
    @Autowired
    private TeacherMapper teacherMapper;

    public List<TeacherVO> findAll(Map<String,Object> param){
        if(param.get("pageSize") != null && param.get("pageNum") != null){

            int pageNum = Integer.parseInt(String.valueOf(param.get("pageNum").toString()));
            int pageSize = Integer.parseInt(String.valueOf(param.get("pageSize").toString()));
            param.put("pageNum", (pageNum - 1) * pageSize );
            param.put("pageSize",pageSize);
        }
        List<TeacherVO> list = teacherMapper.listTeacher(param);
        return list;
    }

    public Integer addTeacher(TeacherVO teacherVO) {
        int iCount = 0;
        if(teacherVO.getId() == null){
            iCount += teacherMapper.insert(teacherVO);
        }
        return iCount;

    }

    public Integer updateTeacher(TeacherVO teacherVO){
        int iCount = 0;
        iCount += teacherMapper.update(teacherVO);
        return iCount;
    }

    public Integer deleteById(Map<String,Object> param) {
        int iCount = 0;
        String id = "";
        if(param.get("id") != null){
            id = param.get("id").toString();
        }
        iCount += teacherMapper.delete(id);
        return iCount;
    }
}
