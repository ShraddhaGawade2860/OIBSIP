import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Question {
    private String question;
    private String correctAnswer;

    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

public class OnlineExamSystem {
    private static Map<String, User> users = new HashMap<>();
    private static Map<String, Question> questions = new HashMap<>();
    private static Map<String, Integer> userScores = new HashMap<>();
    private static String currentUser = null;

    public static void main(String[] args) {
        initializeData(); // Load initial data (users, questions)

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Online Examination System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Take Test");
            System.out.println("4. View Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    takeTest(scanner);
                    break;
                case 4:
                    viewMarks();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void initializeData() {
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));

        questions.put("q1", new Question("What is 2 + 2?", "4"));
        questions.put("q2", new Question("What is the capital of France?", "Paris"));
    }

    private static void registerUser(Scanner scanner) {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        User newUser = new User(username, password);
        users.put(username, newUser);

        System.out.println("Registration successful. You can now log in.");
    }

    private static void loginUser(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        if (!users.containsKey(username)) {
            System.out.println("User not found. Please register first.");
            return;
        }

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = users.get(username);

        if (user.getPassword().equals(password)) {
            currentUser = user.getUsername();
            System.out.println("Login successful. Welcome, " + user.getUsername() + "!");
        } else {
            System.out.println("Incorrect password. Please try again.");
        }
    }

    private static void takeTest(Scanner scanner) {
        if (currentUser == null) {
            System.out.println("You must log in before taking the test.");
            return;
        }

        int score = 0;
        for (String questionId : questions.keySet()) {
            Question question = questions.get(questionId);

            System.out.println("Question: " + question.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(question.getCorrectAnswer())) {
                score++;
            }
        }

        userScores.put(currentUser, score);
        System.out.println("Test completed. Your score: " + score);
    }

    private static void viewMarks() {
        if (currentUser == null) {
            System.out.println("You must log in to view your marks.");
            return;
        }

        Integer userScore = userScores.get(currentUser);

        if (userScore == null) {
            System.out.println("You haven't taken any tests yet.");
        } else {
            System.out.println("Your marks: " + userScore);
        }
    }
}
