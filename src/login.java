import java.util.Scanner;

public class login {

    public String Code[] = {"S161201","121609","081601"};
    public String captcha;
    public int hitung =-1;
    public login (){
        String username;
        String password;
        System.out.println("SELAMAT DATANG DI SUPERMARKET BB");
        System.out.println("====================================");
        System.out.println("Log in  ");
            do{
                Scanner cin = new Scanner(System.in);
                System.out.print("Username     : ");
                 username = cin.next();
                System.out.print("Password     : ");
                password = cin.next();
                if(username.equalsIgnoreCase("najwaazka") && password.equals("azkthlt")){
                    int cap = 0;
                    String f;
                    do{
                        if(cap>0){
                            System.out.println("kode yang anda masukkan salah.");
                        }
                        cap++;
                        hitung ++;
                        hitung %=3;
                        System.out.println("Kode Captcha  : " + Code[hitung]);
                        System.out.print("Entry Captcha : ");
                        Scanner kode = new Scanner(System.in);
                     captcha = kode.next();

                    }while( captcha.equals(Code[hitung]));


                    System.out.println("selamat anda berhasil login!");
                    break;
                }else{
                    System.out.println("maaf username atau password anda salah, silahkan coba lagi.");
                }
            }while(!username.equals("najwaazka") || !password.equals("azkthlt"));

        
    }
}