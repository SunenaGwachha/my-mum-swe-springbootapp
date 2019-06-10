package edu.mum.cs.cs425.elibrary.config;


	import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import edu.mum.cs.cs425.elibrary.ElibraryLab8Application;


	public class ServletInitializer extends SpringBootServletInitializer {

		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(ElibraryLab8Application.class);
		}

	}
