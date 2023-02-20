package com.ylybox.linyuan.teacher.Bean;

import lombok.Data;

@Data
public class TeacherVO {
    // 数据ID
    private String id;

    // 教师名称
    private String tname;

    // 教师年龄
    private String tage;

    // 关联ID
    private int course_id;


}
