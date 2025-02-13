public class RabbitVsBirdsGrowth {
    public static void main(String[] args){
        int numbersOfRabbits = 1042;
        int numbersOfBirds = 2272;
        double rabbitGrowthRate = 0.038; 
        double birdGrowthRate = 0.012; 
        int years = 0;

        while (numbersOfRabbits <= numbersOfBirds) {
            numbersOfRabbits += (int) (numbersOfRabbits * rabbitGrowthRate);
            numbersOfBirds += (int) (numbersOfBirds * birdGrowthRate);
            years++;
        }

        System.out.println("It will take " + years + " years for the number of rabbits to exceed the number of birds.");

    }
}
