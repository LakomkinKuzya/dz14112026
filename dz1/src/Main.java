public class mathutils{
    public static void add(int a,int b){
        IO.println(a+b);
    }
}
public class counter{
    static int count;
    public counter(){
        count++;
    }

}
public class constants{
    double pi=3.14159;
}
void main() {
    Scanner scanner=new Scanner(System.in).useLocale(Locale.US);;
    int a=scanner.nextInt();
    int b=scanner.nextInt();
    mathutils.add( a,  b);
    double r= scanner.nextDouble();
    constants p=new constants();
    double o=p.pi;
    double s=2*o*r;
    IO.println(s);
}
