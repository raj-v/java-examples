
public class BuilderPatternTest {
	public static void main(String[] args) {
		NutritionLabels n =  (new NutritionLabels.Builder(100, 2)).calories(100).fat(10).build();
		System.out.println(n.getFat());
	}
}
