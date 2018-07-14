
public class Exo11 {
public static void operation (double nb1, double nb2, double nb3, double nb4, double nb5, double nb6, double nb7) {
	double somme = nb1 * (nb2 - (nb2/nb3) + (nb2/nb4) - (nb2/nb5) + (nb2/nb6) - (nb2/nb7));
	System.out.print(somme);
}
	public static void main(String[] args) {
		operation (4.0, 1.0, 3.0, 5.0, 7.0, 9.0, 11.0);
	}

}
