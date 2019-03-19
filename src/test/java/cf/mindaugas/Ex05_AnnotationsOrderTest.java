package cf.mindaugas;

import org.junit.*;

public class Ex05_AnnotationsOrderTest {

//    @Test
//    public void t1(){
//        System.out.println("@Test1");
//    }
//
//    @Test
//    public void t2(){
//        System.out.println("@Test2");
//    }

    @BeforeClass
    public static void bc(){
        System.out.println("@BeforeClass");
    }

    @Before
    public void b(){
        System.out.println("@Before");
    }

    @Test
    public void t1(){
        System.out.println("@Test1");
    }

    @Test
    public void t2(){
        System.out.println("@Test2");
    }

    @After
    public void a(){
        System.out.println("@After");
    }

    @AfterClass
    public static void ac(){
        System.out.println("@AfterClass");
    }

}
