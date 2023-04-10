package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); // 자바가 뜰 때 얘를 생성해 줌.

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { // private 생성자로 외부에서 new 호출하는 것 막기

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
