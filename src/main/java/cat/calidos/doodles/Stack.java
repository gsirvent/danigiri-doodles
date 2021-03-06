package cat.calidos.doodles;


public class Stack<T> {

protected LinkedList<T> elements;

public Stack() {
	elements = null;
}

public Stack(T d) {
	elements = null;
	push(d);
}

public boolean isEmpty() {
	return elements==null;
}

public int height() {
	if (isEmpty()) {
		return 0;
	}
	return elements.length();
}

public void push(T d) {
	LinkedList<T> newTop = new LinkedList<T>(d);
	newTop.next = elements;
	elements = newTop;
}

public T pop() {
	if (isEmpty()) {
		throw new IndexOutOfBoundsException("Can’t pop empty stack");
	}
	T top = elements.data;
	elements = elements.next;
	return top;
}

public T peek() {
	if (isEmpty()) {
		throw new IndexOutOfBoundsException("Can’t peek empty stack");
	}
	return elements.data;
	
}

}