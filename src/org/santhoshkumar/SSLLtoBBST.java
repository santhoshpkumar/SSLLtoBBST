package org.santhoshkumar;

import java.util.List;

public class SSLLtoBBST {

    static ListNode head;

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next = new ListNode(7);

        int count = 7;

        displayList(listNode);
        System.out.println();

        head = listNode;
        TreeNode treeNode = createTree(0,count-1);

        displayTree(treeNode);
        System.out.println();
    }

    public static void displayList(ListNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        displayList(node.next);
    }

    public static void displayTree(TreeNode node){
        if(node == null){
            return;
        }
        displayTree(node.left);
        System.out.print(node.data + " ");
        displayTree(node.right);
    }

    public static TreeNode createTree(int start, int end){
        if (start > end){
            return null;
        }
        int mid = (end+start)/2;
        TreeNode left = createTree(start,mid-1);
        TreeNode root = new TreeNode(head.data);
        head = head.next;
        TreeNode right = createTree(mid+1, end);
        root.left = left;
        root.right = right;
        return root;
    }
}

class ListNode {
    ListNode next;
    int data;
    ListNode(int key){
        data = key;
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int data;
    TreeNode(int key){
        data = key;
    }
}