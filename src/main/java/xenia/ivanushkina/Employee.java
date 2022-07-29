package xenia.ivanushkina;

public class Employee {
    String name;
    double salary;
    int evaluation;

    public Employee(String name, double salary, int evaluation) {
        this.name = name;
        this.salary = salary;
        this.evaluation = evaluation;
    }

    void increaseEvaluation() {
        evaluation ++;
        System.out.println("Сотрудник " + name + " получил повышение оценки! Новая оценка: " + evaluation);
    }

    void decreaseEvaluation() {
        evaluation --;
        System.out.println("Сотруднику " + name + " понижена оценка. Новая оценка: " + evaluation);
    }

    void calculateSalary() {
        if (evaluation < 5) {
            salary = salary * 0.8;
            System.out.println("К сожалению, сотрудник " + name + " работал плохо. Его зарплата понижена на 20%. Новая зарплата составит: " + salary);
        } else if(evaluation > 5) {
            salary = salary *1.2;
            System.out.println("Поздравляем! Сотрудник " + name + " работал хорошо. Его зарплата выросла на 20%. Новая зарплата составит: " + salary);
        } else {
            System.out.println("Сотрудник " +  name + " работал нормально. Его зарплата осталась прежней: " + salary);
        }
    }
}
