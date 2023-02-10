package io.cloud.demo.dept.controller;

import io.cloud.demo.api.entity.Dept;
import io.cloud.demo.dept.service.DeptService;
import io.cloud.demo.dept.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Cloud_J
 * @Create 2023/2/10 17:00
 * @Description TODO
 */
@RestController
@RequestMapping("/cloud/demo/dept")
public class DeptController {

    @Resource
    private DeptService deptService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") int id) {
        return deptService.selectByPrimaryKey(id);
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.selectAll();
    }
}
