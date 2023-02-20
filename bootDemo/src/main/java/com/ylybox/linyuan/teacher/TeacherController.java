package com.ylybox.linyuan.teacher;

import com.ylybox.linyuan.teacher.Bean.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /**
     * listTeacher :  获取教师列表数据
     **/
    @RequestMapping(value = "listTeacher", method = RequestMethod.POST)
    public List<TeacherVO> listTeacher(@RequestBody Map<String,Object> param){
        List<TeacherVO> list = teacherService.findAll(param);
        return list;
    }

    /**
     * addTeacher : 新增讲师信息
     */
    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    public Integer addTeacher(@RequestBody TeacherVO teacherVO){
        Integer msg = teacherService.addTeacher(teacherVO);
        return msg;
    }

    /**
     * updateTeacher : 新增讲师信息
     */
    @RequestMapping(value = "/updateTeacher",method = RequestMethod.POST)
    public Integer updateTeacher(@RequestBody TeacherVO teacherVO){
        Integer msg = teacherService.updateTeacher(teacherVO);
        return msg;
    }

    /**
     * deleteTeacher : 删除讲师信息
     */
    @RequestMapping(value = "/deleteTeacher",method = RequestMethod.POST)
    public Integer deleteTeacher(@RequestBody Map<String,Object> param){
        Integer msg = teacherService.deleteById(param);
        return msg;
    }

}
