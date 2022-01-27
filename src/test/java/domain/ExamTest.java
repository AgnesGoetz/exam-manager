package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExamTest {
	@Test
	void get_ReturnsExamInStringFormat() {
		final var examInStringFormat= "test";
		Exam exam = new Exam(examInStringFormat);
		assertThat(exam.getContent()).isEqualTo(examInStringFormat);
	}
}
