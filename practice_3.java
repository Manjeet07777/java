public class practice_3 {
    public static void main(String[] args) {
        //question 1
        String name = "Manjeet Singh";
        name = name.toLowerCase();
        System.out.println(name);

        //question-2
        String text = "manjeet singh";
        text = text.replace(" ", "_");
        System.out.println(text);
        //question 3

        String letter = "Dear <|name|> thanks alot";
        letter = letter.replace("<|name|>","Manjeet");
        System.out.println(letter);
    }
}
