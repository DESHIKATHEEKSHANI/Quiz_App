package edu.icet.service.impl;

import edu.icet.dto.Exam;
import edu.icet.entity.ExamEntity;
import edu.icet.repository.ExamRepository;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    final ExamRepository examRepository;
    final ModelMapper mapper;

    @Override
    public void createExam(Exam exam) {
        examRepository.save(mapper.map(exam, ExamEntity.class));
    }

    @Override
    public Exam getExamByCourseId(Integer id) {
        return mapper.map(examRepository.getByCourseId(id), Exam.class);
    }

    @Override
    public List<Exam> getAll() {
        return List.of();
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer courseId) {

    }
}
