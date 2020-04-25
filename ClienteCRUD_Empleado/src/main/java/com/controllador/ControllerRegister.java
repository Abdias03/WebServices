package com.controllador;

import javax.xml.rpc.ServiceException;
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
@RequestMapping("/registro") 
@SessionAttributes("empleado")
public class ControllerRegister {
	
	private Empleado empleado;
	private Imp_Empleado imp_Empleado = new Imp_Empleado();
	
	@Autowired
	public ControllerRegister(Imp_Empleado imp_Empleado) {
		this.imp_Empleado = imp_Empleado;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		empleado = new Empleado();
		model.addAttribute("empleado", empleado);
		return "registro";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm( @ModelAttribute("empleado")Empleado empleado, 
			BindingResult result, SessionStatus status, Model model) throws ServiceException {
		
		if(imp_Empleado.registro(empleado) == true) {
			model.addAttribute("nombre", empleado.getNombre());
			return "registroCompleto";
		}else
			return "registro";

	}
}