/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project01.biblioteka;

import junit.framework.TestCase;

/**
 *
 * @author Bogus
 */
public class PracownikTest extends TestCase
{
    public PracownikTest(String testName)
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
     * Test of assingGrupa method, of class Pracownik.
     */
    public void testAssingGrupa()
    {
        System.out.println("assingGrupa");
        Grupa newGrupa = new Grupa("grupa1");
        Grupa newGrupa2 = new Grupa("grupa2");
        Pracownik instance = new Pracownik();
        
        newGrupa.getPracownicy().add(instance); // init
        instance.setGrupa(newGrupa);            // init
        
        instance.assingGrupa(newGrupa2);
        assertEquals(instance.getGrupa().getNazwa(), newGrupa2.getNazwa());
        
        assertEquals(newGrupa.getPracownicy().size(), 0);
    }

    /**
     * Test of getId method, of class Pracownik.
     */
    public void testGetId()
    {
        System.out.println("getId");
        Pracownik instance = new Pracownik();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Pracownik.
     */
    public void testSetId()
    {
        System.out.println("setId");
        Long id = null;
        Pracownik instance = new Pracownik();
        instance.setId(id);
    }

    /**
     * Test of getGrupa method, of class Pracownik.
     */
    public void testGetGrupa()
    {
        System.out.println("getGrupa");
        Pracownik instance = new Pracownik();
        Grupa expResult = null;
        Grupa result = instance.getGrupa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrupa method, of class Pracownik.
     */
    public void testSetGrupa()
    {
        System.out.println("setGrupa");
        Grupa grupa = null;
        Pracownik instance = new Pracownik();
        instance.setGrupa(grupa);
    }

    /**
     * Test of hashCode method, of class Pracownik.
     */
    public void testHashCode()
    {
        System.out.println("hashCode");
        Pracownik instance = new Pracownik();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Pracownik.
     */
    public void testEquals()
    {
        System.out.println("equals");
        Object object = null;
        Pracownik instance = new Pracownik();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Pracownik.
     */
    public void testToString()
    {
        System.out.println("toString");
        Pracownik instance = new Pracownik();
        String expResult = "";
        String result = instance.toString();
       // assertEquals(expResult, result);
    }
}
