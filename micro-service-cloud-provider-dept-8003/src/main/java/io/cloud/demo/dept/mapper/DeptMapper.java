package io.cloud.demo.dept.mapper;

import io.cloud.demo.api.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Cloud_J
 * @Create 2023/2/10 16:48
 * @Description TODO
 */
@Mapper
public interface DeptMapper {

    Dept selectByPrimaryKey(Integer deptNo);

    List<Dept> selectAll();

}
