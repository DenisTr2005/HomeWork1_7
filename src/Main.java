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
        String fullNameE = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameE);
    }
}