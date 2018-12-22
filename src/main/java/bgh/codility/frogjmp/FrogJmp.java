package bgh.codility.frogjmp;

public class FrogJmp {
    public int findFrogJmps(int a, int b, int jmp) {

        if ( (b-a)%jmp == 0 )
            return (b-a)/jmp;
        else
            return (b-a)/jmp+1;
    }
}
