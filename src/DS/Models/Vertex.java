package DS.Models;

import java.util.ArrayList;
import java.util.List;

public class Vertex{
    public List<Vertex> neighbours;
    public int data;
    public Vertex(int data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }
}
