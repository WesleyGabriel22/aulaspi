package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento"; 
	}

	@PostMapping("/eventos")
	public String receberFormulario(Evento evento) {
		
		System.out.println(evento);
		
		System.out.println("O formulário foi submetido com sucesso!");
		return "confirmacao"; 
	}
}
