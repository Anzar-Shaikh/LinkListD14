package com.bl.programmes;

public class LinkLists {
    public ListNode head;

    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
        public static void main(String[] args) {
            LinkLists lists = new LinkLists();

            lists.head = new ListNode(50);
//            lists.head.next = new ListNode(70);
//            lists.head.next.next = new ListNode(30);
            ListNode secondNode = new ListNode(70);
            ListNode thirdNode = new ListNode(30);
            lists.head.next = secondNode;
            secondNode.next = thirdNode;
            System.out.println("before roving first node in data.");
            lists.print();
//            lists.pop(secondNode, lists);
            lists.print();
            search(lists, 30);
        }
        private static void search(LinkLists lists ,int data) {
            ListNode currentNode = lists.head , previousNode = null;
//
//            if (currentNode != null && currentNode.data == data){
//                System.out.println(data);
//            }
            while ( currentNode != null && currentNode.data != data){

                currentNode = currentNode.next;
            }
            System.out.println("node is found with data 30 :: "+currentNode.data);
        }

    }
    private void pop(ListNode node, LinkLists lists) {
        ListNode courser = head;
        System.out.println("after removing head node from link list.");

    }
    private void print() {
        ListNode pointer = head;
        while (pointer != null){
            System.out.print(pointer.data+ "->");
            pointer = pointer.next;

        }
        System.out.println("null");
    }
}