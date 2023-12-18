package org.gof.creational.prototype;

public class PrototypeLesson {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setCash(10);
        System.out.println("Student1 Cash: " + student1.getCash());

        Student student2 = null;
        try {
            student2 = student1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        if (student2 != null) {
            System.out.println("Student Clone Cash: " + student2.getCash());
        }
    }
}

class Student implements Cloneable {
    private int cash;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}


