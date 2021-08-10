package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

            boolean running = true;
            while (running) {
                System.out.println(returnMenuDisplay());

                int response = promptAndReturnUserChoice();

                running = executeUserChoice(response);

            }
    }

    private static boolean executeUserChoice(int choice){
        boolean continueRunningApp = true;

        switch(choice) {
            case 0:
                System.out.println("Good bye! ");
                continueRunningApp = false;
                break;
            case 1: //VIEW ALL MOVIES
                for(Movie movie: MoviesArray.findAll()){
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCatagory());

                }
                break;
            case 2:
                System.out.println();
                viewMoviesByCatagory("animated");
                System.out.println();
                break;
            case 3:
                System.out.println();
                viewMoviesByCatagory("drama");
                System.out.println();
                break;
            case 4:
                System.out.println();
                viewMoviesByCatagory("horror");
                System.out.println();
                break;
            case 5:
                System.out.println();
                viewMoviesByCatagory("sci-fi");
                System.out.println();
                break;
        }
                return continueRunningApp;
    }

    private static void viewMoviesByCatagory(String catagory){
        for(Movie movie: MoviesArray.findAll()){
            if(movie.getCatagory().equalsIgnoreCase(catagory)) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCatagory());
            }
        }
    }

    private static int promptAndReturnUserChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int userResponse = (int) input.getInt(0, 5);
        return userResponse;
    }

    private static  String returnMenuDisplay() {
        String menu = "what would ou like to do? \n" + "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";

        return menu;
    }
}
