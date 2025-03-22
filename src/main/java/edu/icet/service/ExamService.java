package edu.icet.service;

import edu.icet.dto.Exam;

import java.util.List;

public interface ExamService {
    void createExam(Exam exam);
    Exam getExamByCourseId(Integer courseId);
    List<Exam> getAll();
    void updateExam(Exam exam);
    void deleteExamById(Integer id);
    void deleteExamByCourseId(Integer courseId);
}