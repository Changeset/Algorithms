package Chapter1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PhoneNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String phoneEL="0[0-9]{3}-[0-9]{7}";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input the first Tel");
        String phone1=null;
        String phone2=null;

        try{
            phone1:
            while((phone1=br.readLine())!=null){
                if(phone1.matches(phoneEL)){
                    System.out.println("Please input the second Tel");

                    phone2:
                    while((phone2=br.readLine())!=null){
                        if(phone2.matches(phoneEL)){
                            System.out.println("Thank you for your Tel");
                            break phone2;
                        }else{
                            System.out.println("Please input the second Tel correctly");
                            continue phone2;
                        }
                    }

                    break phone1;

                }else{
                    System.out.println("Please input the first Tel correctly");
                    continue phone1;
                }

            }
        }catch(Exception e){

        }

    }

}