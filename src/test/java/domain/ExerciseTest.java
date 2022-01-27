package domain;

import org.junit.jupiter.api.Test;
import repository.ExerciseRepository;
import repository.ExerciseRepositoryContent;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class ExerciseTest {

	@Test
	void getContent_ReturnsExerciseContent() throws IOException {
		final var expectedExerciseContent = ExerciseRepositoryContent.CONTENT_OF_EXERCISE_WITH_ID_1;

		final var exercise = new Exercise(ExerciseRepository.EXERCISE_WITH_ID_1_PATH);
		
		assertThat(exercise.getContent()).isEqualTo(expectedExerciseContent);
	}
}