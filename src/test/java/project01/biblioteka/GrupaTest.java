/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project01.biblioteka;

import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Bogus
 */
public class GrupaTest extends TestCase
{
    public GrupaTest(String testName)
    {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    /**
     * Test of getId method, of class Grupa.
     */
    public void testGetId()
    {
        System.out.println("getId");
        Grupa instance = new Grupa("grupa1");
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Grupa.
     */
    public void testSetId()
    {
        System.out.println("setId");
        Long id = null;
        Grupa instance = new Grupa("grupa1");
        instance.setId(id);
    }

    /**
     * Test of getPracownicy method, of class Grupa.
     */
    public void testGetPracownicy()
    {
//        System.out.println("getPracownicy");
//        Grupa instance = new Grupa();
//        List expResult = null;
//        List result = instance.getPracownicy();
//        assertEquals(expResult, result);
    }

    /**
     * Test of setPracownicy method, of class Grupa.
     */
    public void testSetPracownicy()
    {
        System.out.println("setPracownicy");
        List<Pracownik> pracownicy = null;
        Grupa instance = new Grupa("grupa1");
        instance.setPracownicy(pracownicy);
    }

    /**
     * Test of hashCode method, of class Grupa.
     */
    public void testHashCode()
    {
        System.out.println("hashCode");
        Grupa instance = new Grupa("grupa1");
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Grupa.
     */
    public void testEquals()
    {
        System.out.println("equals");
        Object object = null;
        Grupa instance = new Grupa("grupa1");
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Grupa.
     */
    public void testToString()
    {
        System.out.println("toString");
        Grupa instance = new Grupa("grupa1");
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
    }

    /**
     * Test of assignPracownik method, of class Grupa.
     */
    public void testAssignPracownik()
    {
        System.out.println("assignPracownik");
        Pracownik newPracownik = new Pracownik();
        Grupa instance = new Grupa("grupa1");
        
        instance.assignPracownik(newPracownik);
        
        assertEquals(instance.getPracownicy().get(0), newPracownik);
    }
}
