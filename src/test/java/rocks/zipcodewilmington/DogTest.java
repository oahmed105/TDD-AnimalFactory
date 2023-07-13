package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {

        Dog dog = new Dog(null, null, null);

        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest() {

        Dog dog = new Dog(null, null, null);

        Date expected = new Date(12, 31, 05);
        dog.setBirthDate(expected);

        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {

        Dog dog = new Dog(null, null, null);

        Food food = new Food();

        dog.eat(food);
        Integer expected = 1;

        Integer actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest() {

        Dog dog = new Dog(null, null, 3);

        Integer expected = 3;

        Integer actual = dog.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest() {

        Dog dog = new Dog(null, null, null);

        boolean expected = true;

        boolean actual = dog instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest() {

        Dog dog = new Dog(null, null, null);

        boolean expected = true;

        boolean actual = dog instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }
}