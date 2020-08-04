package com.qf.dao;

import com.qf.pojo.Subject;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SubjectMapper {
    List<Subject> selectAll();

    Subject selectSubjectById(String id);

    void deleteSubjectById(String id);
}
