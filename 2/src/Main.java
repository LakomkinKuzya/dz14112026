public static int pal(int a){
    int o=0;
    String s=Integer.toString(a);
    int k=s.length();
    int h=a;
    for (int i=0; i<k;i++){
        int y=h%10;
        o+=y;
        h/=10;
    }
    int t=0;
    for (int i=0;i<k/2;i++){
        if (s.charAt(i)!=s.charAt(k-1-i)) {
            t+=1;
            break;
        }

    }
    if (t==0 && o>10){
        return 1;
    }
    else{
        return 0;
    }
}
void main() {
    Scanner scanner = new Scanner(System.in);
    int a= scanner.nextInt();
    IO.println(pal(a));
}
