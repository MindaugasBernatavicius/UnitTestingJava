package cf.mindaugas;

public class Ex00_SystemImplTest {
    public static void main(String[] args){
        int result = Ex00_SystemImpl.add(1, 6);

        if(result == 7)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}