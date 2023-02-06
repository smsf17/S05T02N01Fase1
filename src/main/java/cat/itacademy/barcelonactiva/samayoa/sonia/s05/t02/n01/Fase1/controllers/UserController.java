package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.services.UserServicesImpl;

import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain.User;

@Controller
@RequestMapping("/players")
public class UserController {
	
	@Autowired
	private UserServicesImpl userService;
	
	@GetMapping("/getAll")
	public String getAllUsers(Model model) {
		List<User> listUsers= userService.getAllUser();
		model.addAttribute("listUsers", "Lista de Jugadores");
		model.addAttribute("listUsers", listUsers);
		return "/players/userList";
	}
	
	@GetMapping("/add")
	public String newUser(Model model) {
		User user = new User();
		model.addAttribute("newUser", "Formulario nuego jugador:");
		model.addAttribute("newUser", user);
		return "/players/newUserFormulary";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute User user, Model model) {
		userService.add(user);
		System.out.println("Usuario guardado correctamente");
		return "/players/userList";
	}


}
