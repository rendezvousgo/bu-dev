package exam01;
public class CompanyExample {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        if (c1 == c2) {
            System.out.println("c1과 c2는 동일한 Company 객체입니다.");
        } else {
            System.out.println("c1과 c2는 다른 Company 객체입니다.");
        }
    }
}

