class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
      boolean present = false;
      while(head!=null){
          if(head.val == target)
              present = true;
          head = head.next;
      }
      return present;
    }

    public static <T> T getNodeValue(Node<T> head, int index) {
      // todo - note the return type, but don't overthink it
      int count = 0;
      while (head!=null) {
        if(count == index)
          return head.val;
        count++;
      }
      return head.val;
    }
    
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d

        System.out.println(Source.linkedListFind(a, "c"));






        Node<String> node1 = new Node<>("banana");
        Node<String> node2 = new Node<>("mango");
        Node<String> node3 = new Node<>("kiwi");
    
        node1.next = node2;
        node2.next = node3;
    
        // banana -> mango -> kiwi
    
        System.out.println(Source.getNodeValue(node1, 1));
        
    }

  }