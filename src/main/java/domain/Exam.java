package domain;

import java.util.Objects;

public class Exam {
	private final String examInStringFormat;

	public Exam(String examInStringFormat) {
		this.examInStringFormat = examInStringFormat;
	}

	String getContent() {
		return this.examInStringFormat;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Exam exam = (Exam) o;
		return Objects.equals(examInStringFormat, exam.examInStringFormat);
	}

	@Override public int hashCode() {
		return Objects.hash(examInStringFormat);
	}
}
