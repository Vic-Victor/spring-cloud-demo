package io.cloud.demo.controller;

import io.cloud.demo.api.entity.Dept;
import io.cloud.demo.service.DeptFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Cloud_J
 * @Create 2023/2/13 15:54
 * @Description TODO
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

    @Resource
    private DeptFeignService deptFeignService;

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") int id) {
        return deptFeignService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptFeignService.list();
    }
}
