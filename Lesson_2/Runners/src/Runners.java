public class Runners {

    public static void main(String[] args) {
        int[] time = new int[] {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        String[] name = new String[]{ "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};


        for (int i = 0; i < time.length; i++) {
            System.out.println(name[i] + " time is " + time[i]);
        }
    }
}