public static double[] sol(double a, double b, double c ){
    double d=b*b-4*a*c;
    double d1=Math.pow(d,0.5);
    double x1=-1*b+d1;
    double x2=-1*b-d1;
    return new double[]{x1, x2};
}
void main() {
    Scanner scanner = new Scanner(System.in);
    double a=scanner.nextInt();
    double b=scanner.nextInt();
    double c=scanner.nextInt();
    IO.println(Arrays.toString(sol(a, b, c)));
}