class Transpose
{
    public static void main(String[] args) throws Exception {
        int A[][]={{2,4,3},{2,4,6},{3,5,6}};
        int At[][]=new int[3][3];
        int i,j;
        System.out.println("Given Matrix is : ");
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of MAtrix : ");
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[i].length;j++)
            {
                At[i][j]=A[j][i];
                System.out.print(At[i][j] + " ");
            }
            System.out.println();
        }
    }
}