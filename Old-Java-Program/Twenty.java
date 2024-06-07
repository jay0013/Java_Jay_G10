class Shape {
    void draw() {
        System.out.println("Draw Shape");
    }
}

class Circle extends Shape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw(); // child class meth()
        Square sq = new Square();
        sq.draw(); // child class meth()
        Shape sh = new Shape();
        sh.draw(); // parent class meth()
    }

    @Override
    void draw() {
        System.out.println("Draw Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Draw Square");
    }
}

