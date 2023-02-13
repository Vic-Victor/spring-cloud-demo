package io.cloud.demo.dept.service;

import io.cloud.demo.api.entity.Dept;

import java.util.List;

/**
 * @Author Cloud_J
 * @Create 2023/2/10 16:57
 * @Description TODO
 */
public interface DeptService {

    Dept selectByPrimaryKey(Integer deptNo);

    List<Dept> selectAll();
}
