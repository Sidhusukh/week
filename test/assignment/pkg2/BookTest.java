/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class BookTest {
    Book validBook;
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     validBook = new Book("Sukhpreet" , "Kaur", "Cites & sourses","English",LocalDate.of(2018, Month.NOVEMBER, 10),10001,"Java");
    }
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentFirstName method, of class Book.
     */
    @Test
    public void testGetFirstName()
    {
        String expResult = "Sukhpreet";
        String result = validBook.getStudentFirstName();
        assertEquals(expResult, result);
    }


    /**
     * Test of setStudentFirstName method, of class Book.
     */
     @Test
    public void testSetStudentFirstName()
    {
        validBook.setStudentFirstName("Sukhpreet");
        String result = validBook.getStudentFirstName();
        assertEquals("Sukhpreet",result);        
    }
  
    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetStudentLastName()
    {
        String expResult = "Kaur";
        String result = validBook.getStudentLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetStudentLastName()
    {
        validBook.setStudentLastName("Kaur");
        assertEquals("Kaur", validBook.getStudentLastName());
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetStudentLastNameInvalid()
    {
        String studentLastName = "";
        try
        {
            validBook.setStudentLastName(studentLastName);
            fail("The setLastName method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
  @Test
    public void testGetBookName()
    {
        String expResult = "Cites & sourses";
        String result = validBook.getBookName();
        assertEquals(expResult, result);
    }


    /**
     * Test of setStudentFirstName method, of class Book.
     */
     @Test
    public void testSetBookName()
    {
        validBook.setBookName("Cites & sourses");
        String result = validBook.getBookName();
        assertEquals("Cites & sourses",result);        
    }
   
    /**
     * Test of getBookLanguage method, of class Book.
     */
    @Test
    public void testGetBookLanguage()
    {
        String expResult = "English";
        String result = validBook.getBookLanguage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBookLanguage method, of class Book.
     */
     @Test
    public void testSeBookLanguageEnglish()
    {
        String result = "English";
        validBook.setBookLanguage("English");
        assertEquals(result, validBook.getBookLanguage());
    }
   @Test
    public void testSeBookLanguagePunjabi()
    {
        String result = "Punjabi";
        validBook.setBookLanguage("Punjabi");
        assertEquals(result, validBook.getBookLanguage());
    }
     @Test
    public void testSeBookLanguageHindi()
    {
        String result = "Hindi";
        validBook.setBookLanguage("Hindi");
        assertEquals(result, validBook.getBookLanguage());
    }
     @Test
    public void testSeBookLanguageFrench()
    {
        String result = "French";
        validBook.setBookLanguage("French");
        assertEquals(result, validBook.getBookLanguage());
    }
    @Test
    public void testGetReserveDate()
    {
        LocalDate expResult = LocalDate.of(2018, Month.NOVEMBER, 10);
        LocalDate result = validBook.getReserveDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateEnrolled method, of class Student.
     */
    @Test
    public void testSetReserveDate()
    {
        LocalDate reserveDate = LocalDate.of(2018, Month.SEPTEMBER, 10);
        validBook.setReserveDate(reserveDate);
        assertEquals(reserveDate, validBook.getReserveDate());
    }
    
    
    /**
     * Test of setDateEnrolled method, of class Student.
     */
    @Test
    public void testSetReserveDateInvalid()
    {
        LocalDate reserveDate = LocalDate.of(2020, Month.SEPTEMBER, 1);
        try{
            validBook.setReserveDate(reserveDate); 
            fail("set reserve date with invalid date should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
     @Test
    public void testGetCourseName()
    {
        String expResult = "Java";
        String result = validBook.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseNameInvalid()
    {
        String courseName = "";
        try{
            validBook.setCourseName(courseName);
            fail("The course name cannot be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
   @Test
    public void testGetStudentNum()
    {
        int expResult = 10001;
        int result = validBook.getStudentNum();
        assertEquals(expResult, result);
    }
      @Test
    public void testInvalidStudentNumber()
    {
        try{
         validBook = new Book("Sukhpreet" , "Kaur", "Cites & sourses","English",LocalDate.of(2018, Month.NOVEMBER, 10),-10001,"Java");
            fail("-1 is not a valid student number and should be caught");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    
}
