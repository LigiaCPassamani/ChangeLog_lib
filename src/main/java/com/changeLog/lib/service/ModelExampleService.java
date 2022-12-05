package com.changeLog.lib.service;

import com.changeLog.lib.model.ChangeLog;
import com.changeLog.lib.model.ModelExample;
import com.changeLog.lib.repository.ModelExampleRepository;
import org.springframework.stereotype.Service;

@Service
public class ModelExampleService {

    private final ModelExampleRepository modelExampleRepository;

    private final ChangeLogService changeLogService;

    public ModelExampleService(ModelExampleRepository modelExampleRepository, ChangeLogService changeLogService) {
        this.modelExampleRepository = modelExampleRepository;
        this.changeLogService = changeLogService;
    }

    public ModelExample insertExample(ModelExample object) {
        insertChangeLog();
        return modelExampleRepository.save(object);
    }

    private Long insertChangeLog() {
        ChangeLog changeLog = new ChangeLog();
        changeLog = changeLogService.insertChangeLog(changeLog);
        return changeLog.getId();
    }

}
