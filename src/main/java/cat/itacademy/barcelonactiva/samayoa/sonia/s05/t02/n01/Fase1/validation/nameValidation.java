package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.validation;

@Documented
@Constraint(validatedBy = NameValidatorC.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public interface nameValidation {
	
	  String message() default "{nameValidatorMsg.messageValid}";

	    Class<?>[] groups() default {};

	    Class<? extends Payload>[] payload() default {};

}
