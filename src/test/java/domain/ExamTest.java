package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExamTest {
	
	@Test
	void testGenerateExam(){
		assertThat(Exam.generate()).isNotEmpty();
	}
}
