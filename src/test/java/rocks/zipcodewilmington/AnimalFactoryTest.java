package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {

        Dog dog = AnimalFactory.createDog("Mario", new Date(12/31/04));

        String expected = "Mario";
        Date date = new Date(12/31/04);

        String actual = dog.getName();
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(date, actualDate);

    }

    @Test
    public void createCatTest() {
        Cat cat = AnimalFactory.createCat("Gato", new Date(12 / 31 / 04));

        String expected = "Gato";
        Date date = new Date(12 / 31 / 04);

        String actual = cat.getName();
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(date, actualDate);
    }
}
