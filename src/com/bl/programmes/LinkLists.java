package com.bl.programmes;

public class LinkLists {
    public ListNode head;

    public static class ListNode<K>{
        public K data;
        public ListNode next;

        public ListNode(K data) {
            this.data = data;
            this.next = null;
        }
        public static void main(String[] args) {
            LinkLists lists = new LinkLists();

            lists.head = new ListNode(50);
            ListNode secondNode = new ListNode(70);
            ListNode thirdNode = new ListNode(30);
            lists.head.next = secondNode;
            secondNode.next = thirdNode;
            System.out.println("before roving first node in data.");
            lists.print();
            lists.pop(secondNode, lists);
            lists.print();

        }
    }

    private void pop(ListNode node, LinkLists lists) {
        System.out.println("after removing head node from link list.");
        lists.head = node;
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