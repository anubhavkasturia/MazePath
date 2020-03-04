public class mazepathcount{
    public static void main(String[] args) {
        int cans=mazePathCount(0, 0, 2, 2);
        System.out.println(cans);
    }

    public static int mazePathCount(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            return 1;
        }
        if(sc>dc || sr>dr){
            return 0;
        }
        
        int count=0;
        int hcount=mazePathCount(sr+1, sc, dr, dc);
        int vcount=mazePathCount(sr, sc+1, dr, dc);
        count=hcount+vcount;
        return count;
    }
}