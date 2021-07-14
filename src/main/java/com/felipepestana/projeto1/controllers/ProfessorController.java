package com.felipepestana.projeto1.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.felipepestana.projeto1.dto.RequisicaoProfessor;
import com.felipepestana.projeto1.models.Professor;
import com.felipepestana.projeto1.models.StatusProfessor;
import com.felipepestana.projeto1.repository.ProfessorRepository;

@Controller
public class ProfessorController {
	@Autowired
	private ProfessorRepository professorRepository;

	@GetMapping("/professores")
	public ModelAndView index() {

		List<Professor> professores = this.professorRepository.findAll();

//		BigDecimal big = new BigDecimal("200.00");
//		Professor felipe = new Professor("Felipe", big, StatusProfessor.ATIVO);
//		felipe.setId(1L);
//
//		Professor rafael = new Professor("Rafael", big, StatusProfessor.INATIVO);
//		rafael.setId(2L);
//		Professor carla = new Professor("Carla", big, StatusProfessor.APOSENTADO);
//		carla.setId(3L);
//		
//		List<Professor> professores = Arrays.asList(felipe, rafael, carla);
		ModelAndView mv = new ModelAndView("professores/index");
		mv.addObject("professores", professores);
		return mv;
	}

	@GetMapping("/professor/new")
	public String nnew() {
		return "professores/new";
	}

	@PostMapping("/professores")
	public String create(@Valid RequisicaoProfessor requisicao, BindingResult result) {

		if (result.hasErrors()) {
			
			System.out.println("Tem Erros");
			return "redirect:/professores";
		} else {

			Professor professor = requisicao.toProfessor();
			professorRepository.save(professor);
			return "redirect:/professores";
		}
	}

}
