package Protection;

public class Protect2package extends Protect1package {
    public void readStringextends() {
        System.out.println("Public String accessible within package : " + str1);
        System.out.println("Private String is not accessible within package");
        System.out.println("Protected String accessible within package : " + str3);
    }
}
