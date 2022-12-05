package com.changeLog.lib.controller;

import com.changeLog.lib.model.ModelExample;
import com.changeLog.lib.service.ModelExampleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/model")
public class ModelExampleController {

    private final ModelExampleService modelExampleService;

    public ModelExampleController(ModelExampleService modelExampleService) {
        this.modelExampleService = modelExampleService;
    }

    @PostMapping("/insert")
    public ModelExample insert(@RequestBody ModelExample modelExample) {
        return modelExampleService.insertExample(modelExample);
    }
}
