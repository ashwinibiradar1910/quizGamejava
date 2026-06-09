import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "Who developed Java?",
                "Which data structure uses FIFO?",
                "What is the largest ocean on Earth?"
        };

        String[][] options = {
                {"A. London", "B. Paris", "C. Berlin", "D. Madrid"},
                {"A. Venus", "B. Jupiter", "C. Mars", "D. Saturn"},
                {"A. Microsoft", "B. Apple", "C. Sun Microsystems", "D. Google"},
                {"A. Stack", "B. Queue", "C. Tree", "D. Graph"},
                {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"}
        };

        char[] answers = {'B', 'C', 'C', 'B', 'D'};

        int score = 0;

        System.out.println("=================================");
        System.out.println("       WELCOME TO QUIZ GAME      ");
        System.out.println("=================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

        System.out.println("\n=================================");
        System.out.println("            RESULTS              ");
        System.out.println("=================================");
        System.out.println("Score: " + score + "/" + questions.length);

        double percentage = (double) score / questions.length * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (percentage >= 80) {
            System.out.println("Grade: Excellent!");
        } else if (percentage >= 60) {
            System.out.println("Grade: Good!");
        } else if (percentage >= 40) {
            System.out.println("Grade: Average!");
        } else {
            System.out.println("Grade: Needs Improvement!");
        }

        sc.close();
    }
}