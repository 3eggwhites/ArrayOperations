# ArrayOperations
This repository contains different coding exercises related Array DS
Problem one: Array Rotataion
Solved it using Juggling Algorithm.
Algorithm description:
Take the length of the array and how many rotations needs to be done. Find out their GCF. Use that GCF vslue to swap the elements of the array.
lets say array length is len, rotations to be done is r, so d = gcf(len,r);
we have to move a[l+d] to a[l], where l is a variable which denotes the index of the element to be swapped.
