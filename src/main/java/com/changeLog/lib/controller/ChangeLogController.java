package com.changeLog.lib.controller;

import com.changeLog.lib.model.ChangeLog;
import com.changeLog.lib.service.ChangeLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/changelog")
public class ChangeLogController {

    private final ChangeLogService changeLogService;

    @Autowired
    public ChangeLogController(ChangeLogService changeLogService) {
        this.changeLogService = changeLogService;
    }


    @GetMapping("/find/all")
    public List<ChangeLog> findAll() {
        return changeLogService.findAllChangeLogs();
    }

    @GetMapping(value = "/find/{id}")
    public ChangeLog findById(@PathVariable Long id) throws Exception {
        return changeLogService.findById(id);
    }

}
