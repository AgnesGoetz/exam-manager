package client;

import domain.ExamGenerator;
import domain.Exercise;
import repository.ExerciseRepository;

import java.io.FileNotFoundException;
import java.util.List;

public class GenerateExamWith3Exercises {
	public static void main(String[] args){
		try {
			ExamGenerator generator = new ExamGenerator(List.of(
					new Exercise(ExerciseRepository.EXERCISE_WITH_ID_1_PATH),
					new Exercise(ExerciseRepository.EXERCISE_WITH_ID_2_PATH),
					new Exercise(ExerciseRepository.EXERCISE_WITH_ID_3_PATH))
			);
			System.out.println(generator.generateExamContent());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
