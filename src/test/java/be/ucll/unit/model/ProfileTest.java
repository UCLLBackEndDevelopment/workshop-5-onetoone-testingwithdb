package be.ucll.unit.model;

import be.ucll.model.Profile;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfileTest {

    private static ValidatorFactory validatorFactory;
    private static Validator validator;

    @BeforeAll
    public static void setUp() {
        validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @AfterAll
    public static void tearDown() {
        validatorFactory.close();
    }

    @Test
    void givenValidValues_whenCreatingProfile_thenProfileIsCreatedWithThoseValues() {
        Profile profile = new Profile("Some bio", "Some location", "Some interests");
        assertEquals("Some bio", profile.getBio());
        assertEquals("Some location", profile.getLocation());
        assertEquals("Some interests", profile.getInterests());

    }

    @Test
    void givenInvalidBio_whenCreatingProfile_thenConstrainValidationsAreThrown() {
        Profile profile = new Profile("", "x", "x");
        Set<ConstraintViolation<Profile>> violations = validator.validate(profile);
        assertEquals(1, violations.size());
        assertEquals("Bio is required", violations.iterator().next().getMessage());
    }

    @Test
    void givenInvalidLocation_whenCreatingProfile_thenConstrainValidationsAreThrown() {
        Profile profile = new Profile("x", "", "x");
        Set<ConstraintViolation<Profile>> violations = validator.validate(profile);
        assertEquals(1, violations.size());
        assertEquals("Location is required", violations.iterator().next().getMessage());

    }

    @Test
    void givenInvalidInterest_whenCreatingProfile_thenConstrainValidationsAreThrown() {
        Profile profile = new Profile("x", "x", "");
        Set<ConstraintViolation<Profile>> violations = validator.validate(profile);
        assertEquals(1, violations.size());
        assertEquals("Interests are required", violations.iterator().next().getMessage());
    }
}
