public class Nineteen {
    protected double height, width, depth;

    Nineteen() 
	{
        // sop(""); // Can't use 'sop' as a method, maybe you meant System.out.println();
    }

    double volume() {
        return height * width * depth;
    }
}

class Cubewight extends Nineteen {
    double weight;

    Cubewight(double h, double w, double d, double m) {
        super(); // call the constructor of the parent class
        System.out.println("");
        height = h;
        width = w;
        depth = d;
        weight = m;
    }
}