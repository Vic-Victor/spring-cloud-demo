package io.cloud.demo.service;

import io.cloud.demo.api.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author Cloud_J
 * @Create 2023/2/13 15:49
 * @Description TODO
 */
@Component
@RequestMapping("/cloud/demo/dept")
@FeignClient(value = "MICROSERVICECLOUDPROVIDERDEPT")
public interface DeptFeignService {

    @GetMapping("/get/{id}")
    Dept get(@PathVariable("id") int id);

    @GetMapping("/list")
    List<Dept> list();
}
