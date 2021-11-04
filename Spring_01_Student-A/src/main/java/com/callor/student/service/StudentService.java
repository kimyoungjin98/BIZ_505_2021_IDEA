package com.callor.student.service;

import com.callor.student.model.StudentVO;

import java.util.List;

public interface StudentService {

    public List<StudentVO> selectAll();
    public StudentVO findByNum(String st_num);

    public List<StudentVO> findByName();
    public List<StudentVO> findByTel();

    public void insert(StudentVO vo);

    public void delete(String st_num);

    public void update(StudentVO vo);


}
