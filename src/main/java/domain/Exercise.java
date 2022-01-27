package domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
	private final String exerciseContent;
	
	public Exercise(String pathOfThefileContainingTheExercise) throws FileNotFoundException {
		final String exerciseContent = getExerciseContentFrom(pathOfThefileContainingTheExercise);
		this.exerciseContent = exerciseContent;
	}

	private String getExerciseContentFrom(String pathOfThefileContainingTheExercise) throws FileNotFoundException {
		File fileContainingTheExercise = new File(pathOfThefileContainingTheExercise);
		List<String> linesInFileContainingTheExercise = getLinesFrom(fileContainingTheExercise);

		final var exerciseContent = linesInFileContainingTheExercise
				.stream().reduce((line1, line2) -> line1 + "\n" + line2).orElse(null);
		
		return exerciseContent;
	}

	private List<String> getLinesFrom(File fileContainingTheExercise) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(fileContainingTheExercise);
		List<String> linesInFileContainingTheExercise = new ArrayList<>();

		while (fileScanner.hasNextLine()) {
			linesInFileContainingTheExercise.add(fileScanner.nextLine());
		}
		
		return linesInFileContainingTheExercise;
	}

	public String getContent() {
		return this.exerciseContent;
	}
}
