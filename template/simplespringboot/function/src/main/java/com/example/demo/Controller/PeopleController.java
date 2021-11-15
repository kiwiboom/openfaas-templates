package com.example.demo.Controller;

import com.example.demo.People;
import com.example.demo.PeopleRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PeopleController {
    @Resource
    private PeopleRepository peopleRepository;

    /**
     * 添加一个女生
     */
    @PostMapping(value = "/people")
    public People peopleAdd(@RequestParam("name") String name) {
        People girl = new People();
        girl.setName(name);
        People save = peopleRepository.save(girl);
        return save;
    }
    /**
     * 删除一个女生
     * */
    @DeleteMapping(value = "/people/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        peopleRepository.deleteById(id);
    }

}
