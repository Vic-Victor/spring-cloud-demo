package io.cloud.demo.dept.service.impl;

import io.cloud.demo.api.entity.Dept;
import io.cloud.demo.dept.mapper.DeptMapper;
import io.cloud.demo.dept.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Cloud_J
 * @Create 2023/2/10 16:58
 * @Description TODO
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public Dept selectByPrimaryKey(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }
}
