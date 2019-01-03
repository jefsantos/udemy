package com.jeferson.cursomc.services.validation;




import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.jeferson.cursomc.dto.ClienteNewDTO;
import com.jeferson.cursomc.resources.exception.FieldMessage;
public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {
 @Override
 public void initialize(ClienteInsert ann) {
 }
 @Override
 public boolean isValid(ClienteNewDTO objDto, ConstraintValidatorContext context) {
 List<FieldMessage> list = new ArrayList<>();
 
 if(objDto.getTipo() ==null) {
	 list.add(new FieldMessage("tipo","Tipo não pode ser Nulo"));
 }

 // inclua os testes aqui, inserindo erros na lista

 for (FieldMessage e : list) {
 context.disableDefaultConstraintViolation();
 context.buildConstraintViolationWithTemplate(e.getMessage())
 .addPropertyNode(e.getFieldName()).addConstraintViolation();
 }
 return list.isEmpty();
 }
}


