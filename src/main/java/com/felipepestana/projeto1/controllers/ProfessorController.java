package com.felipepestana.projeto1.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.felipepestana.projeto1.models.Professor;
import com.felipepestana.projeto1.models.StatusProfessor;





@Controller
public class ProfessorController {
	
	@GetMapping("/professores")
	public ModelAndView index  () {
		
		BigDecimal big = new BigDecimal("200.00");
		Professor felipe = new Professor("Felipe", big, StatusProfessor.ATIVO);
		felipe.setId(1L);

		Professor rafael = new Professor("Rafael", big, StatusProfessor.INATIVO);
		rafael.setId(2L);
		Professor carla = new Professor("Carla", big, StatusProfessor.APOSENTADO);
		carla.setId(3L);
		
		List<Professor> professores = Arrays.asList(felipe, rafael, carla);
		
		ModelAndView mv = new ModelAndView("professores/index");
		
		mv.addObject("professores", professores);
		
		return mv;
		
	}

}
