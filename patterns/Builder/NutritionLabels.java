
public class NutritionLabels {

	
	private final  int servingSize;
	private final  int servings; //Per container
	private final  int calories;
	private final  int fat;
	private final  int sodium;
	
	
	public static class Builder implements IBuilder<NutritionLabels> {
		private   int servingSize;
		private   int servings; //Per container
		private   int calories;
		private   int fat;
		private   int sodium;
		
		public Builder(int sS, int servings) {
			this.servings = servings;
			this.servingSize = sS;
		}
		
		public Builder calories(int inCalories) {
			this.calories = inCalories;
			return this;
		}
		
		public Builder fat(int inFat) {
			this.fat = inFat;
			return this;
		}
		
		public Builder sodium(int inSodium) {
			this.sodium = inSodium;
			return this;
		}
		
		public NutritionLabels build() {
			return new NutritionLabels(this);
		}
	
	}
	
	private NutritionLabels(Builder b) {
		this.servings = b.servings;
		this.servingSize = b.servingSize;
		this.fat = b.fat;
		this.sodium = b.sodium;
		this.calories = b.calories;
	}

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}
	
}
