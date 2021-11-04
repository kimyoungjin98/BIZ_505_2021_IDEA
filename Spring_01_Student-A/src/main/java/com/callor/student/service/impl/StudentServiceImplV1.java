package com.callor.student.service.impl;

import com.callor.student.model.StudentVO;
import com.callor.student.repository.StDao;
import com.callor.student.repository.StDaoImpl;
import com.callor.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

// Ioc 컨테이너에게 StudentServiceImplV1 클래스를 사용하여 객체를 생성하고
// 필요한 곳에 주입해 달라
@Service
public class StudentServiceImplV1 implements StudentService {

    private StDao stDao;

    public StudentServiceImplV1(){
        stDao = new StDaoImpl();
    }

    public StudentServiceImplV1(StDao stDao) {
        this.stDao = stDao;
    }

    @Override
    public List<StudentVO> selectAll() {
        List<StudentVO> stList = stDao.selectAll();
        return stList;
    }

    @Override
    public StudentVO findByNum(String st_num) {
        return null;
    }

    @Override
    public List<StudentVO> findByName() {
        return null;
    }

    @Override
    public List<StudentVO> findByTel() {
        return null;
    }

    @Override
    public void insert(StudentVO vo) {

    }

    @Override
    public void delete(String st_num) {

    }

    @Override
    public void update(StudentVO vo) {

    }
}
