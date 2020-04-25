package com.controllador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.dao.Imp_Empleado;
import com.service.Empleado;

@Controller
@RequestMapping("/update") 
@SessionAttributes("empleado")
public class ControllerUpdate {
	
	private Empleado empleado;
	private Imp_Empleado imp_Empleado = new Imp_Empleado();
	
	@Autowired
	public ControllerUpdate(Imp_Empleado imp_Empleado) {
		this.imp_Empleado = imp_Empleado;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		empleado = new Empleado();
		model.addAttribute("empleado", empleado);
		return "update";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm( @ModelAttribute("empleado") Empleado empleado, BindingResult result, SessionStatus status, Model model) {
		if(imp_Empleado.actualizar(empleado) == true) {
			model.addAttribute("empleado", empleado);
			return "update";
		}else
			return "errorUpdate";
	}
}
