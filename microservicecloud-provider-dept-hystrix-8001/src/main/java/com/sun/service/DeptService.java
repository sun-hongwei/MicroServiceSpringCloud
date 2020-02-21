package com.sun.service;

import com.sun.entities.Dept;

import java.util.List;

public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();

}
