package com.changeLog.lib.repository;

import com.changeLog.lib.model.ModelExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelExampleRepository extends JpaRepository<ModelExample, Long> {
}
