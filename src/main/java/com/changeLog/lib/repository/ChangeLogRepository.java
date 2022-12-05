package com.changeLog.lib.repository;

import com.changeLog.lib.model.ChangeLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface ChangeLogRepository extends JpaRepository<ChangeLog, Long> {

    @Transactional(readOnly = true)
    List<ChangeLog> findAllByOrderByIdDesc();

}
