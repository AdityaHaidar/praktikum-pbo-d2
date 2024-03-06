// File        : ExceptionOnarray.java          06/03/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Membuat class ExceptonOnArray
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arryIntegers = new Integer[4];
        try{
            arryIntegers[2] = 11;
            arryIntegers[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
