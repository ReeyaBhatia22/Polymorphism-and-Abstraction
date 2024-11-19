class Hillstations
{
    void Location() {
        System.out.println("Location is:");
}
void famousfor() {
    System.out.println("Famous for:");
}
}
class Manali extends Hillstations
{
    void Location() {
        System.out.println("Manali is in Himachal Pradesh");
}
void famousfor() {
    System.out.println("It is famous for Hadimba temple and adventure sports");
}
}
class Mussoorie extends Hillstations
{
    void Location() {
        System.out.println("Mussoorie is in Uttarakhand");
}
void famousfor() {
    System.out.println("It is famous for education institutions");
}
}
class Gulmarg extends Hillstations
{
    void Location() {
        System.out.println("Gulmarg is in Jammu and Kashmir");
}
void famousfor() {
    System.out.println("It is famous for skiing");
}
}
class Main 
{
    public static void main(String[]args)
    {
        Hillstations a= new Hillstations();
        Hillstations M= new Manali();
        Hillstations Mu = new Mussoorie();
        Hillstations g= new Gulmarg();

        a.Location();
        a.famousfor();
        
        M.Location();
        M.famousfor();

        Mu.Location();
        Mu.famousfor();

        g.Location();
        g.famousfor();

     }
}