class Tower_of_Hanoi
{
    static void toH(int n, char source, char intermediate, char destination)            // Method for Tower of Hanoi
    {
        if (n == 1)                                                                     // Terminating Condition
        {
            System.out.println("Move 1 disk from "+
                    source+" to "+destination);
            return;
        }
        toH(n - 1, source, destination, intermediate);                              // Recursive Part
        toH(1, source, intermediate, destination);
        toH(n - 1, intermediate, source, destination);
    }

    public static void main(String[] args)                                              // main body
    {
        int n = 3;                                                                      // Number of disks
        toH(n, 'A', 'B', 'C');
    }
}




