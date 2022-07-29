package xenia.ivanushkina;

public class Salary {

    public static void main(String[] args) {

        Employee qa = new Employee("Рыбин А.П.", 35000,5);
        Employee designer = new Employee("Петров У.К.", 25000,5);
        Employee developer = new Employee("Сидоров А.Р.", 55000,5);

        qa.increaseEvaluation();
        designer.decreaseEvaluation();

        qa.calculateSalary();
        designer.calculateSalary();
        developer.calculateSalary();
    }
}
