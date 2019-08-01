package edu.uw.info360.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import edu.uw.info360.models.Path;

@Component
public class PathValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Path.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
	}

}