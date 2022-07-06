public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

//    QuadraticEquation(double a, double b, double c){
//    }

    void setA(double a){
        this.a = a;
    }
    void setB(double b){
        this.b = b;
    }void setC(double c){
        this.c = c;
    }
    double getDiscriminant(){
        return b * b - 4 * a * c ;
    }

    double getRoot1(){
        return (-b + Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }
    double getRoot2(){
        return (-b - Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }

}
