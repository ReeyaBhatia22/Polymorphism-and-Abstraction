// abstraction
abstract class Objects
{
    abstract void ShowShape(); 
    public void shape() { 
        System.out.println("I'm from abstract class");
    }
}
class Sphere extends Objects {
           void ShowShape(){
            System.out.println("Im from Sphere");
           }
}
class Cuboid extends Objects {
    void ShowShape(){
     System.out.println("Im from Cuboid");
    }
}
class Prism extends Objects {
    void ShowShape(){
     System.out.println("I am from prism");
    }
}
public class Main
{
   public static void main(String[] args) {
    
    Objects obj= new Sphere();
    obj.ShowShape();
    obj= new Cuboid();
    obj.ShowShape();
    obj= new Prism();
    obj.ShowShape();
   }
}


