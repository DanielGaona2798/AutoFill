package struct;
public class NarioTree<T> {

	private Node<T> root;

	public NarioTree(){
		this.root = null;
	}

	public boolean isEmpty(){
		return (root == null);
	}
	public void add(T info){
		if(root == null){
			root = new Node<>(info);
		}else{
			if(root.getListNodes().getHead() != null){
				Node<T> aux = root.getListNodes().getHead().getInformation();
				while(aux != null){
					if(aux.equals(info) == false){
						root.getListNodes().add(new Node<T>(info));
					}
				}
			}else{
				root.getListNodes().add(new Node<T>(info));
			}
		}
	}

	public void addSon(T info, T parent){
		if (parent == root.getInformation()) {
			root.getListNodes().add(new Node<T>(info));
		}else {
			Node<T> nodeParent = search2(parent);
			if(nodeParent != null){
				nodeParent.getListNodes().add(new Node<T>(info));
			}
		}
	}

	public Node<T> search(T info){
		return helperSearchParent(info, this.root);
	}

	public Node<T> helperSearchParent(T info, Node<T> auxRoot){
		Node<Node<T>> nodeAux = root.getListNodes().getHead();
		while(nodeAux.getNext() != null){
			if(nodeAux.getInformation().getInformation().equals(info)){
				return nodeAux.getInformation();
			}
			nodeAux = nodeAux.getNext();
		}
		return nodeAux.getInformation();
	}

	public int getLength(T info){
		int i =0;
		Node<T> aux = search2(info);
		Node<Node<T>> auxListhead = aux.getListNodes().getHead();
		while(auxListhead != null){
			i++;
			auxListhead = auxListhead.getNext();
		}
		return i;

	}

	public Node<T> search2(T info){
		return helperSearchParent2(info, this.root);
	}

	private Node<T> helperSearchParent2(T info, Node<T> root2) {
		Node<Node<T>> nodeAux = root.getListNodes().getHead();
		while(nodeAux.getNext() != null){
			if(nodeAux.getInformation().getInformation().equals(info)){
				return nodeAux.getInformation();
			}
			nodeAux = nodeAux.getNext();
		}
		return nodeAux.getInformation();
	}

}
