import java.io.File;

public class Remove_new {
    public  void removeFile(){
        File file = new File("usersData.txt");
        if (file.exists()){
            if (file.delete()){
                System.out.print("your account remove !!!");
            }
        }else{
            System.out.print("\n ERROR !! \n try again !!\n");
        }
    }
}
