package org.example;

public class LinkedList {

    private Node head;  //голова

    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    private static class Node {
        public Object data; //данные
        public Node next; //ссылка на следующий узел

        public Node(Object data) {
            this.data = data;
        }
    }

    public void addInBeginning(Object data) {
        if (data != null) {
            Node newNode = new Node(data);
            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
        }
    }

    public Object extValueFromTheBeginningWithoutDeleting() {  //извлечение значения из начала списка без его удаления из списка;
        return head.data;
    }

    public Object extValueFromTheBeginningWithDeleting() {  //извлечение значения из начала списка с удалением его из списка;
        Object x = head.data;
        remove(head.data);
        return x;
    }

    public Object extValueFromTheEndWithoutDeleting() {  //извлечение значения из конца списка без удаления из списка;
        Node currentNode = head;
        if (head == null)
            return null;
        else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
    }

    public Object extValueFromTheEndWithDeleting() { //извлечение значения из конца списка с удалением;
        Node currentNode = head;
        if (head == null)
            return null;
        else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            Object k = currentNode.data;
            remove(currentNode.data);
            return k;
        }
    }

    public void addInEnd(Object data) {
        if (data != null) {
            Node newNode = new Node(data);
            Node currentNode = head;              //текущий узел

            if (head == null) {                   //если голова отсутствует
                head = newNode;
            } else {
                while (currentNode.next != null) {     //перемещение по списку
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;  //добравшись до последнего элемента, в качестве следующего установил newNode
            }
        }
    }

    public boolean searchValue(Object data) {   //определение, содержит ли список заданное значение, или нет;
        if (data != null) {
            Node currentNode = head;
            while (currentNode != null) {
                if (data.equals(currentNode.data)) {
                    return true;
                } else if (currentNode.next != null) {
                    currentNode = currentNode.next;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void remove(Object data) {//удаление заданного значения из списка;
        if (head == null || data == null) return;
        Node currentNode = head;
        Node previousNode = null;
        if (searchValue(data)) {
            while (currentNode != null) {
                if (currentNode.data.equals(data)) {
                    if (currentNode == head) {
                        head = currentNode.next;
                    } else {
                        previousNode.next = currentNode.next;
                    }
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    public boolean empty() {   //определение, является ли список пустым, или нет;
        return head == null;
    }

    public void printAll() {                         //печать всех значений списка;
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}