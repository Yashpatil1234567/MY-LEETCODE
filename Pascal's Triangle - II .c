#include <stdlib.h>  // For malloc and free

int* getRow(int rowIndex, int* returnSize) {
   int* row = (int*)malloc((rowIndex + 1) * sizeof(int));
  
    *returnSize = rowIndex + 1;
    
    row[0] = 1;
    
    for (int k = 1; k <= rowIndex; k++) {
        row[k] = (long long)row[k - 1] * (rowIndex - (k - 1)) / k;
    }
    
    return row;
}
