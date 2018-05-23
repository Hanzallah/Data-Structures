package trees;

import java.util.*;

public class SimpleTree<T> {
	private T data;
	private List<SimpleTree<T>> children;
	private SimpleTree<T> parent;
	
	public SimpleTree(T data) {
		this.data = data;
		children = new ArrayList<>();
		parent = null;
	}
	
	public void addChild(SimpleTree<T> child) {
		child.setParent(this);
		children.add(child);
	}
	
	public void addChildren(List<SimpleTree<T>> children) {
        for(SimpleTree<T> t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }
	
	public void addChild(T data) {
		SimpleTree<T> child = new SimpleTree<>(data);
		child.setParent(this);
		children.add(child);
	}
	
	public List<SimpleTree<T>> getChildren() {
       return children;
    }
	
	public T getData() {
	     return data;
	 }

	public void setData(T data) {
		this.data = data;
	}
	
	private void setParent(SimpleTree<T> parent) {
		this.parent = parent;
	}

	public SimpleTree<T> getParent() {
		return parent;
	}
}
