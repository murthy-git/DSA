package DS.Models;

import java.util.ArrayList;
import java.util.List;

public class NaryNode {
    public int data;
    public List<NaryNode> children;

    public NaryNode(int data){
        this.data = data;
        this.children = null;
    }
}
