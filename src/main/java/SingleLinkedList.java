/**
 * @author Ljh
 */
public class SingleLinkedList {
    public Node head = null;
    public Node last = null;

    /**构造函数存储头节点**/
    public SingleLinkedList(Node head){
        this.head = head;
    }

    /**查找链表尾节点**/
    public Node findlastnode(){
        Node temp = this.head;
        if(temp.next == null){
            System.out.println("此链表为空链表！");
            return head;
        }else{
            while(temp.next!=null){
                temp = temp.next;
            }
            return temp;
            }
    }

    /**在链表结尾增加节点**/
    public void addTail(Node node){
        Node temp = findlastnode();
        temp.next = node;
    }
    /**在指定位置增加节点**/
    public void addNode(Node node,int place){

    }

}
