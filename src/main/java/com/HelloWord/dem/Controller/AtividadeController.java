package com.HelloWord.dem.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AtividadeController {

	
	@GetMapping("Habilidades")
	public String Habilidades() {
		return "<As Habilidades e Mentalidades Usadas Nessa Atividade Foram: </h1>"
				+ "<h2>Atenção aos Detalhes e Persistencia.</h2>";
	}
	@GetMapping("/Qualidades")
	public String Qualidades() {
		return "<h1>Os objetivos para essa semana são: </h1>"
				+"<ul>"
				+"<li><b>Persistencia</b>: Como Praticar?"
				+"<li><b>Motivação</b>: escrever Codigos e ser Feliz</h1>"
				+"<li><b>Tecnicas</b>:Melhorar HardSkills</h1>"
				+"<li><b>Metas Conquistadas Indepedente"
				+"<li><b>Te encontro lá"
				+"</ul>";
	}
}
 