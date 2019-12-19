package com.oyft.springcloud.dao;

import com.oyft.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//必须添加注解
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
