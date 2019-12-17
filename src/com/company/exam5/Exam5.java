package com.company.exam5;

public class Exam5 {
    public static void main(String[] args) {
        Me me = new Me(new Phone(), new Money());
        me.getRight().ring();
        System.out.println(me.getLeft());
    }
}

class Me{
    private Ringable right;
    private AbstractPaper left;

    public Me(Ringable right, AbstractPaper left) {
        this.right = right;
        this.left = left;
    }

    public Ringable getRight() {
        return right;
    }

    public void setRight(Ringable right) {
        this.right = right;
    }

    public AbstractPaper getLeft() {
        return left;
    }

    public void setLeft(AbstractPaper left) {
        this.left = left;
    }
}

interface Ringable{
    void ring();
}

abstract class AbstractPaper{}

class Phone implements Ringable{
    @Override
    public void ring() {
        System.out.println("Zing Zing");
    }
}

class Money extends AbstractPaper{
    @Override
    public String toString() {
        return "Money{}";
    }
}