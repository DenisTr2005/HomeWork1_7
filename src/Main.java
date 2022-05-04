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
    }
}