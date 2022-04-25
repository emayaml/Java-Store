
package AlmacenesExtra;


public class Node {
    
    //ATRIBUTOS
    private Object data;
    private Node link;

    //CONSTRUCTORES INDIVIDUAL Y TOTAL 
    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node link) {
        this.data = data;
        this.link = link;
    }
    
    //METODOS GET Y SET 
    public Object getData() {
        return data;
    }

    public Node getLink() {
        return link;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setLink(Node link) {
        this.link = link;
    }
  
}
