# SSLLtoBBST
Sorted Singly Linked List to Balanced Binary Search Tree

Java implementation of converting a singly sorted list to blalanced binary search tree. This does not use any other red-black or the AVL tree insert, rather it uses simple recurssion to. Time complexity O(n).

Appraoch:

    Say mid is the mid­dle node in the linked list.
    Recur­sively con­struct left sub­tree from start to mid-1
    Make the mid­dle node as root and assign the left sub­tree to it.
    Recur­sively con­struct right sub­tree from mid+1 to end.
    Assign the right sub­tree to root.
