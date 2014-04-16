
/**
 * Calculates length of 3d vector.
 * 
 * @Sean Roper
 * @15 Apr 2014
 */
public class VectorNorm
{
    public static void main(String [] args){
        System.out.print("\f");
        System.out.println(norm(2, 3, 4));
    }

    public static double norm(int x, int y, int z){
        return Math.sqrt(x*x+y*y+z*z);        
    }
}
