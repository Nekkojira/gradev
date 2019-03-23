package com.nekkojira.gradev;

import com.nekkojira.gradev.web.controller.GradevController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GradevApplicationTests {

	@Autowired
	private GradevController gradevController;

	@Test
	public void contextLoads() {
		assertThat(gradevController).isNotNull();
	}

}
