package ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;
import ifrn.pi.eventos.repositories.EventoRepository;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventosController {

	@Autowired
	private EventoRepository er;
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento"; 
	}

	@PostMapping("/eventos")
	public String receberFormulario(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		return "confirmacao"; 
	}
}
