package domain;

import java.util.List;
import java.util.stream.Collectors;

public class ExamGenerator {
	static final String SEPARATOR = "\n-----------------------\n ";

	private final List<Exercise> exercises;
	
	public ExamGenerator(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public Exam generateExam() {
		final List<String> exercisesAsStrings = exercises.stream().map(exercise -> exercise.getContent()).collect(Collectors.toList());
		return new Exam(exercisesAsStrings.stream()
				.reduce((exercise1,exercise2) -> exercise1 + SEPARATOR + exercise2).orElse(new String())
		);
	}

	public String generateExamContent() {
		return generateExam().getContent();
	}
}
