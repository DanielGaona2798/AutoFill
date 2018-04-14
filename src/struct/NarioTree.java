package struct;
public class NarioTree<T> {

	private Node<T> root;

	public NarioTree(){
		this.root = null;
	}

	public boolean isEmpty(){
		return (root == null);
	}
	public boolean add(T info){
		if(root == null){
			this.root = new Node<>(info);
			return true;
		}else{
			if(root.getListNodes().getHead() != null){
				Node<T> aux = root.getListNodes().getHead().getInformation();
				while(aux != null){
					if(aux.equals(info) == false ){
						root.getListNodes().add(new Node<T>(info));
						return true;
					}
				}
			}else{
				root.getListNodes().add(new Node<T>(info));
			}
			return false;
		}
	}

	public boolean addSon(T info, T parent){
		Node<T> nodeParent = search(parent);
		if(nodeParent != null){
			nodeParent.getListNodes().add(new Node<T>(info));
			return true;
		}else{
			System.out.println("I can´t prro :'v");
			return false;
		}
	}

	public void helperPrintNTree(Node<T> auxRoot, int level){
		Node<T> nodeAux = auxRoot;
		Node<Node<T>> node = nodeAux.getListNodes().getHead();
		if(node != null){
			while(node.getNext() != null){
				int i = 0;
				System.out.println("Level "+String.valueOf(level)+" ----> " + node.getInformation().getInformation());
				i++;
				helperPrintNTree(node.getInformation(), i);
				node = node.getNext();
			}
			level++;
			helperPrintNTree(node.getInformation(),level);
		}else{
		}
	}

	public void printNTree(){
		helperPrintNTree(this.root, 0);
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
