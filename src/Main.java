public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivanov", middleName = "Ivan", lastName = "Ivanovich", fullName;
        fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО сотрудника — " + fullName + ".");
        System.out.println("\nЗадание 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
        System.out.println("\nЗадание 3");
        fullName = "Иванов Семён Семёнович";
        String[] fullNameWords = fullName.split(" ");
        System.out.print("Данные ФИО сотрудника —");
        for (int i = 0; i < fullNameWords.length; i++) {
            if (fullNameWords[i].contains("ё")) {
                fullNameWords[i] = fullNameWords[i].replace('ё','е');
            }
            System.out.print(" " + fullNameWords[i]);
        }
        System.out.println("\n\nЗадание 5");
        fullName = "Ivanov Ivan Ivanovich";
        firstName = fullName.substring(0, fullName.indexOf(' '));
        System.out.println("Имя сотрудника — " + firstName);
        lastName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        System.out.println("Фамилия сотрудника — " + lastName);
        middleName = fullName.substring(fullName.lastIndexOf(' ') + 1, fullName.length());
        System.out.println("Отчество сотрудника — " + middleName);
        System.out.println("\nЗадание 6");
        fullName = "ivanov ivan ivanovich";
        char[] fullNameChar = fullName.toCharArray();
        fullNameChar[0] = Character.toUpperCase(fullNameChar[0]);
        fullNameChar[fullName.indexOf(' ') + 1] = Character.toUpperCase(fullNameChar[fullName.indexOf(' ') + 1]);
        fullNameChar[fullName.lastIndexOf(' ') + 1] = Character.toUpperCase(fullNameChar[fullName.lastIndexOf(' ') + 1]);
        fullName = new String(fullNameChar);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);
        System.out.println("\nЗадание 7");
        String string1 = "135", string2 = "246";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < string1.length(); i++) {
            sb.append(string1.charAt(i));
            sb.append(string2.charAt(i));
        }
        System.out.println("Данные строки — " + sb);
        System.out.println("\nЗадание 8");
        String abc = "aabccddefgghiijjkk";
        System.out.println(abc);
        sb.delete(0,sb.length());
        for (int i = 1; i < abc.length(); i++) {
            if (abc.charAt(i) == abc.charAt(i - 1)) {
                sb.append(abc.charAt(i));
            }
        }
        System.out.println(sb);
    }
}