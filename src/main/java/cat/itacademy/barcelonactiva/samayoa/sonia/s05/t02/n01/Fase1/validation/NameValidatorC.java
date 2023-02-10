package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidatorC implements ConstraintValidator<nameValidation, T> {

	@Override
	public boolean isValid(String userName, ConstraintValidatorContext context) {
		
	
		if (UserName==" " || null) {
			UserName = "ANONIMO";
			
		return false;
	}

}
