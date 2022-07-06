public class Rectangle {
    double width, height;

    public Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return this.height * this.width;
    }

    double getPerimeter(){
        return (this.height + this.width) * 2;
    }

    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

//    public void display(double newWight, double newHeight){
//        getArea();
//        getPerimeter();
//    }



}
