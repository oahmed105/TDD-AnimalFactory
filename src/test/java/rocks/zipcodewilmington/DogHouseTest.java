package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    public void addTest() {
        Dog dog = new Dog(null, null, null);
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog);
        Integer expected = 1;

        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void removeTest() {
        Dog dog = new Dog(null, null, null);
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog);
        dogHouse.remove(dog);
        Integer expected = 0;

        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        Dog dog = new Dog(null, null, 4);
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog);
        dogHouse.add(dog);
        dogHouse.remove(4);

        Integer expected = 1;

        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest() {
        Dog dog = new Dog(null,null,4);
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog);
        Dog expected = dog;

        Dog actual = dogHouse.getDogById(4);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberOfDogTest() {
        Dog dog = new Dog(null,null,null);
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog);
        dogHouse.add(dog);
        dogHouse.add(dog);
        Integer expected = 3;

        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }
}
