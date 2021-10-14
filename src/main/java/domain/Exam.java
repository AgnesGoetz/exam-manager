package domain;

import java.util.List;

public class Exam {
	private final List<Exercise> exercises;
	
	public Exam(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public String generate() {
		return exercises.toString();
	}
}
