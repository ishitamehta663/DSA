import math
import os
import random
import re
import sys

def rotateLeft(d, arr):
    

    n = len(arr)

    d = d % n # Handle cases where d > n

    rotated_array = arr[d:] + arr[:d]

    return rotated_array



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    d = int(first_multiple_input[1])
    

    arr = list(map(int, input().rstrip().split()))

    result = rotateLeft(d, arr)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()