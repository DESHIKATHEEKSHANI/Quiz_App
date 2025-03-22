package edu.icet.repository;

import edu.icet.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity,Integer> {

    ExamEntity getByCourseId(Integer courseId);
}
