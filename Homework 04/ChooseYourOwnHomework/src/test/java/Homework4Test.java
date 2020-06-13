import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Homework4Test {
    
    StudentAccount student;

    @BeforeEach
    void defaultStart()
    {
    	student = new StudentAccount();
    }
    
    //Test Student Account Class Methods
    
    //Test Default Constructor 
    @Test
    void testStudentDefaultDay()
    {
    	assertEquals(0, student.day, "Day was not set to 0");
    }
    
    @Test
    void testStudentDefaultMonth()
    {
    	assertEquals(0, student.month, "Month was not set to 0");
    }
    
    //Test Set Month 
    @Test 
    void testStudentFall()
    {
    	assertEquals(4, student.setMonth('F'), "Did not get the right month for Fall");
    }
    
    @Test 
    void testStudentSummer()
    {
    	assertEquals(4, student.setMonth('R'), "Did not get the right month for Summer");
    }
    
    @Test 
    void testStudentSpring()
    {
    	assertEquals(11, student.setMonth('S'), "Did not get the right month for Spring");
    }
    
    @Test 
    void testStudentErrorSemester()
    {
    	assertEquals(-1, student.setMonth('M'), "Did not get the right value for an invalid Semester");
    }
    
    
    //Test Set Day in April 
    @Test 
    void testDayNovember1()
    {
    	assertEquals(20, student.setDayNov(5), "Was not the right day in November (20)");
    }
    
    @Test 
    void testDayNovember2()
    {
    	assertEquals(19, student.setDayNov(15), "Was not the right day in November (19)");
    }
    
    @Test 
    void testDayNovember3()
    {
    	assertEquals(18, student.setDayNov(25), "Was not the right day in November (18)");
    }
    
    @Test 
    void testDayNovember4()
    {
    	assertEquals(15, student.setDayNov(35), "Was not the right day in November (15)");
    }
    
    @Test 
    void testDayNovember5()
    {
    	assertEquals(14, student.setDayNov(45), "Was not the right day in November (14)");
    }
    
    @Test 
    void testDayNovember6()
    {
    	assertEquals(13, student.setDayNov(55), "Was not the right day in November (13)");
    }
    
    @Test 
    void testDayNovember7()
    {
    	assertEquals(12, student.setDayNov(65), "Was not the right day in November (12)");
    }
    
    @Test 
    void testDayNovember8()
    {
    	assertEquals(11, student.setDayNov(75), "Was not the right day in November (11)");
    }
    
    @Test 
    void testDayNovember9()
    {
    	assertEquals(8, student.setDayNov(95), "Was not the right day in November (8)");
    }
    @Test 
    void testDayNovember10()
    {
    	assertEquals(7, student.setDayNov(105), "Was not the right day in November (7)");
    }
    @Test 
    void testDayNovember11()
    {
    	assertEquals(6, student.setDayNov(115), "Was not the right day in November (6)");
    }
    @Test 
    void testDayNovember12()
    {
    	assertEquals(-1, student.setDayNov(-5), "Was not the right day in November for an invalid amount of credits");
    }
    
    //Test Set Day in November 
    
    @Test 
    void testDayApril1()
    {
    	assertEquals(15, student.setDayApr(5), "Was not the right day in April (15)");
    }
    
    @Test 
    void testDayApril2()
    {
    	assertEquals(14, student.setDayApr(15), "Was not the right day in April (14)");
    }
    
    @Test 
    void testDayApril3()
    {
    	assertEquals(13, student.setDayApr(25), "Was not the right day in April (13)");
    }
    
    @Test 
    void testDayApril4()
    {
    	assertEquals(10, student.setDayApr(35), "Was not the right day in April (10)");
    }
    
    @Test 
    void testDayApril5()
    {
    	assertEquals(9, student.setDayApr(45), "Was not the right day in April (9)");
    }
    
    @Test 
    void testDayApril6()
    {
    	assertEquals(8, student.setDayApr(55), "Was not the right day in April (8)");
    }
    
    @Test 
    void testDayApril7()
    {
    	assertEquals(7, student.setDayApr(65), "Was not the right day in April (7)");
    }
    
    @Test 
    void testDayApril8()
    {
    	assertEquals(6, student.setDayApr(75), "Was not the right day in April (6)");
    }
    
    @Test 
    void testDayApril9()
    {
    	assertEquals(3, student.setDayApr(95), "Was not the right day in April (3)");
    }
    @Test 
    void testDayApril10()
    {
    	assertEquals(2, student.setDayApr(105), "Was not the right day in April (2)");
    }
    @Test 
    void testDayApril11()
    {
    	assertEquals(1, student.setDayApr(115), "Was not the right day in April (1)");
    }
    @Test 
    void testDayApril12()
    {
    	assertEquals(-1, student.setDayApr(-5), "Was not the right day in April for an invalid amount of credits");
    }
    
    //Test Summer Gives the Right Date 
    @Test 
    void testSummerDate()
    {
    	student.getRegistrationDate(90, 'R');
    	
    	assertEquals(15, student.day, "Summer Did not get the right Date");
    }
    
    //Test Spring Gives the Right Date
    @Test 
    void testSpringDate()
    {
    	student.getRegistrationDate(75, 'S');
    	
    	assertEquals(11, student.day, "Spring Did not get the right Date");
    }
    
    //Test Summer Gives the Right Date 
    @Test 
    void testFallDate()
    {
    	student.getRegistrationDate(23, 'F');
    	
    	assertEquals(13, student.day, "Fall Did not get the right Date");
    }
    
    //Test Error handling when getting Registration Date 
    @Test
    void invalidSemesterMonth()
    {
    	student.getRegistrationDate(75, 'M');
    	assertEquals(-1, student.month, "Did not get -1 as Month");
    }
    
    @Test
    void invalidSemesterDay()
    {
    	student.getRegistrationDate(75, 'M');
    	assertEquals(0, student.day, "Did not get -1 as Day");
    }
    
    @Test 
    void invalidCreditsDay()
    {
    	student.getRegistrationDate(-5, 'F');
    	assertEquals(-1, student.day, "Did not get -1 as Day");
    	
    }
    
    @Test 
    void invalidCreditsDaySummer()
    {
    	student.getRegistrationDate(-5, 'R');
    	assertEquals(0, student.day, "Did not get 0 as Day");
    	
    }
    
}
