public class Main {
    public static void main(String[] args) {

        ContaUniversitaria uni = new ContaUniversitaria(1231,001);

//        uni.depositar(100);
//        System.out.println(uni.getSaldo());
//        uni.depositar(100,002);
//        System.out.println(uni.getSaldo());
//        uni.depositar(100,001);
//        System.out.println(uni.getSaldo());

        ContaSocial social = new ContaSocial(1234,"comp");

        social.depositar(100);
        System.out.println(social.getSaldo());
        social.depositar(100,"como");
        System.out.println(social.getSaldo());
        social.depositar(100,"comp");
        System.out.println(social.getSaldo());
    }
}