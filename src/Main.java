public class Main {
    public static void main(String[] args) {
        //Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //Задача 2
        System.out.println("ФИО сотрудника - " + fullName.toUpperCase());
        //Задача 3
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace ("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }
}