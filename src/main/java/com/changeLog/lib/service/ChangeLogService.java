package com.changeLog.lib.service;

import com.changeLog.lib.model.ChangeLog;
import com.changeLog.lib.repository.ChangeLogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ChangeLogService {

    @Autowired
    private ChangeLogRepository changeLogRepository;


    public List<ChangeLog> findAllChangeLogs() {
        return changeLogRepository.findAllByOrderByIdDesc();
    }

    public ChangeLog findById(Long id) throws Exception {
        Optional<ChangeLog> object = changeLogRepository.findById(id);
        if (object.isPresent()) {
            return object.get();
        } else {
            throw new Exception();
        }
    }

    public ChangeLog insertChangeLog(ChangeLog object) {
        object.setId(null);
        Date currentDate = new Date();
        object.setInsertOn(currentDate);
        return changeLogRepository.save(object);
    }


}
