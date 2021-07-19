package Builder;

public class NutrictionFactsExample {
    public static void main(String[] args) {
        NutrictionFacts cocaCola = new NutrictionFacts.Builder(240, 8)
                .carbohydrate(2)
                .fat(3)
                .calories(100)
                .build();

        System.out.println(cocaCola.toString());
    }
}
