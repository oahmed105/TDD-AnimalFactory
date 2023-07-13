package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest() {
        Cat cat = new Cat(null, null, null);
        CatHouse catHouse = new CatHouse();

        catHouse.add(cat);
        Integer expected = 1;

        Integer actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        Cat cat = new Cat(null, null, null);
        CatHouse catHouse = new CatHouse();

        catHouse.add(cat);
        catHouse.remove(cat);
        Integer expected = 0;

        Integer actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        Cat cat = new Cat(null, null, 4);
        CatHouse catHouse = new CatHouse();

        catHouse.add(cat);
        catHouse.add(cat);
        catHouse.remove(4);

        Integer expected = 1;

        Integer actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest() {
        Cat cat = new Cat(null,null,4);
        CatHouse catHouse = new CatHouse();

        catHouse.add(cat);
        Cat expected = cat;

        Cat actual = catHouse.getCatById(4);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberOfCatTest() {
        Cat cat = new Cat(null,null,null);
        CatHouse catHouse = new CatHouse();

        catHouse.add(cat);
        catHouse.add(cat);
        catHouse.add(cat);
        Integer expected = 3;

        Integer actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }
}
