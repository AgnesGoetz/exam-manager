package domain;

import org.junit.jupiter.api.Test;
import repository.ExerciseRepository;
import repository.ExerciseRepositoryContent;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static domain.ExamGenerator.SEPARATOR;
import static org.assertj.core.api.Assertions.assertThat;

public class ExamGeneratorTest {
	
	@Test
	void generate_calledWithOneExercise_shouldReturnExerciseContent() throws FileNotFoundException {
		Exercise exercise1 = new Exercise(ExerciseRepository.EXERCISE_WITH_ID_1_PATH);
		List<Exercise> exercises = List.of(exercise1);
		ExamGenerator examGenerator = new ExamGenerator(exercises);

		final var expectedExamContent = ExerciseRepositoryContent.CONTENT_OF_EXERCISE_WITH_ID_1;
		
		assertThat(examGenerator.generateExam()).isEqualTo(new Exam(expectedExamContent));
	}


	@Test
	void generate_calledWithMultipleExercises_shouldReturnExercisesContent() throws FileNotFoundException {
		ExamGenerator examGenerator = new ExamGenerator(List.of(
				new Exercise(ExerciseRepository.EXERCISE_WITH_ID_1_PATH), 
				new Exercise(ExerciseRepository.EXERCISE_WITH_ID_2_PATH), 
				new Exercise(ExerciseRepository.EXERCISE_WITH_ID_3_PATH)));

		final var expectedExamContent = ExerciseRepositoryContent.CONTENT_OF_EXERCISE_WITH_ID_1 + SEPARATOR +
						ExerciseRepositoryContent.CONTENT_OF_EXERCISE_WITH_ID_2 + SEPARATOR +
						ExerciseRepositoryContent.CONTENT_OF_EXERCISE_WITH_ID_3;

		assertThat(examGenerator.generateExam()).isEqualTo(new Exam(expectedExamContent));
	}
	
	@Test
	void generate_calledWithEmptyList_ReturnsEmptyString() {
		ExamGenerator examGenerator = new ExamGenerator(new ArrayList<Exercise>());

		assertThat(examGenerator.generateExam()).isEqualTo(new Exam(""));
	}
	
}
