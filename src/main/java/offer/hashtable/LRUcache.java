package offer.hashtable;

import java.util.HashMap;

//手写lru
public class LRUcache<K,V> {
    HashMap<K,Node<K,V>> map;
    int capacity;
    Node<K,V> head=null;
    Node<K,V> tail=null;

    public LRUcache(int capacity) {
        this.capacity = capacity;

        map=new HashMap<K,Node<K,V>>(capacity);

    }


    static class Node<K,V>{
        Node<K,V> pre;
        Node<K,V> next;
        K key;
        V vlue;

        public Node(K key, V vlue) {
            this.key = key;
            this.vlue = vlue;
        }
    }
    void put(K key,V value){
        if (map.containsKey(key)) {
            Node<K,V> node=deleteNode(map.get(key));
            addtoTail(node);

        }
        else {
            if (map.size()==capacity*0.7) {
               Node<K,V> old=head;
                deleteHead(head);
                map.remove(old.key);

            }
            Node<K,V> node1= new Node<>(key, value);
            map.put(key,node1);
            if (tail==null) {

                tail=head=node1;return;
            }
            addtoTail(node1);
        }

    }
    V get(K key){
        if (!map.containsKey(key)){
            return null;
        }
        Node<K,V> node=map.get(key);

        if (node == head) {
            addtoTail(deleteHead(node));

        } else {
            addtoTail(deleteNode(node));
        }
        return node.vlue;
    }

    private Node<K,V> deleteHead(Node<K,V> head1) {
        Node<K,V> node2=head1;
        head=node2.next;
        head.pre=null;
        node2.next=null;
        node2.pre=null;
       return head1;
    }

    private void addtoTail(Node<K,V> node) {
        Node<K,V> old=tail;
        tail=node;
        node.pre=old;
        old.next=node;
        node.next=null;
    }

    private Node<K,V> deleteNode(Node<K,V> node) {
        node.pre.next=node.next;
                node.next.pre=node.pre;
                return node;
    }

    public static void main(String[] args) {
        LRUcache<Integer, Integer> LRUcache = new LRUcache<>(10);
        LRUcache.put(1,2);
        LRUcache.put(2,3);
        LRUcache.put(3,3);
        LRUcache.put(4,3);
        LRUcache.put(5,3);
        LRUcache.put(6,3);
        LRUcache.put(7,3);
        LRUcache.put(11,3);
        LRUcache.put(22,3);
        LRUcache.put(33,3);
        LRUcache.get(4);
        LRUcache.get(5);
        LRUcache.get(6);
        System.out.println(LRUcache.head.key);

    }

}
