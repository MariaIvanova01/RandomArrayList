package Part2ReusingClasses;

public class Main {

    public static void main(String[] args) {
	    RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add(14);
        randomArrayList.add(21);
        randomArrayList.add(1);
        randomArrayList.add(5);
        randomArrayList.add(2021);

        System.out.println(randomArrayList.getRandomElement());
    }
}
