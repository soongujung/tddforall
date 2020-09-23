package io.study.tdd.tddforall;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ExtendWith(MockitoExtension.class)
@BootstrapWith(SpringBootTestContextBootstrapper.class)
//@SpringBootTest
public class TempTest {

	@Test
	@DisplayName("Mockito, SpringExtension 테스트")
	void test(){
		System.out.println("TEST");
	}
}
