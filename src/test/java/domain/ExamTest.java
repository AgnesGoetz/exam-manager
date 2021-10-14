package domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ExamTest {
	
	@Test
	void generate_calledWithOnExercise_shouldReturnExercise(){
		String exercise1Content = "Exercise1";
		Exercise exercise1 = new Exercise(exercise1Content);
		List<Exercise> exercises = List.of(exercise1);
		Exam exam = new Exam(exercises);
		
		exercise1Content.equals(assertThat(exam.generate()));
	}
}
