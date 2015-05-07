package iterator;

public class CrudeList<E> {
	@SuppressWarnings("unchecked")
	private E[] data = (E[]) new Object[10];
	private int count = 0;
	
	public void add(E e) {
		data[count++] = e;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("CrudeList [ ");
		for (int i = 0; i < count; i++) {
			sb.append(data[i].toString()).append(", ");
		}
		sb.setLength(sb.length() - 2);
		sb.append(" ]");
		return sb.toString();
	}
	
}
