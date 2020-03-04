public class mazepath{
    public static void main(String[] args) {
           mazepathans(0,0,2,2," ");
            
        }
    public static void mazepathans(int sr, int sc, int dr, int dc, String path){
        if(sr==dr && sc==dc){
            System.out.println(path);
            return;

        }
        if(sr>dr || sc>dc){
            return;
        }
        
        mazepathans(sr+1, sc, dr, dc, path+"H"); //Horizontal Call
        mazepathans(sr, sc+1, dr, dc, path+"V");// Vertical Call
        mazepathans(sr+1, sc+1, dr, dc, path+"D");//Diagonal Call
        
        
      
     }
}

