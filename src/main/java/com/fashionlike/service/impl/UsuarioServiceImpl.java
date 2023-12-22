package com.fashionlike.service.impl;

import org.springframework.stereotype.Service;

import com.fashionlike.request.RequestUsuario;
import com.fashionlike.service.IUsuarioService;
@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Override
	public String registrarUsuario(RequestUsuario datosUsuario) {
		// Simular registro en vase de datos
		RequestUsuario registroDB = new RequestUsuario("Ferrer", "1234", "dndst001@live.com.mx", "Backend");
		RequestUsuario porRegistrar = new RequestUsuario();

		porRegistrar.setUsername(datosUsuario.getUsername());
		porRegistrar.setPassword(datosUsuario.getPassword());
		porRegistrar.setEmail(datosUsuario.getEmail());
		porRegistrar.setOcupacion(datosUsuario.getOcupacion());
		
		System.out.println("Dato del registro: " + porRegistrar);
		
		if (porRegistrar.getUsername()== null || porRegistrar.getUsername().isEmpty()) {
			return "No se puede registrar el usuario.";
			
		}else {
			return "Registro exitoso.";
		}
		
		
		
		
	}
	

}
