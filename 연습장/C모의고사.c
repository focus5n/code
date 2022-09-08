#include <stdio.h>

main()
{
    int k = 2;
    int j;

    while (1)
    {
        j = 2;
        while (k % j != 0)
        {
            j++;
        }
        if (k == j)
        {
            printf("%d ", k);
        }
        if (k < 7)
        {
            k++;
        }
        else
        {
            break;
        }
    }
}