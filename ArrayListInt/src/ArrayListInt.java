import java.util.*;
import java.lang.*;

/** My implementation of simple int array list */
public class ArrayListInt{
	private int m_size = 0;
	private int m_index = 0;
	private int[] m_array;
	
	
	public ArrayListInt() {
	}
	
	public ArrayListInt(int size) {
		m_array = new int[size];
		m_size = size;
	}
	
	/** set element value at secific index
	 *  ,first element is at index 0
	 * @param index
	 * @param value
	 */
	public void set(int index,int value) {
		m_array[index] = value;
	}
	
	public int get(int index) {
		return m_array[index];
	}
	
	
	public int size() {
		return m_size - 1;
	}
	
	/** adds new value in the array, if array is too small to hold it
	 * it creates new array that can hold new elemnt in the array
	 * @param value
	 */
	public void add(int value) {
		if(m_index == (m_size - 1)) {
			int[] temp = new int[m_size];
			m_index = 0;
			
			for(int i = 0; i < m_size - 1; i++) {
				temp[i] = m_array[i];
				m_index++;
			}
			
			m_array = temp;
			m_array[m_index] = value;
			m_index++;
			m_size = m_size + 1;
			
		}else {
			m_array[m_index] = value;
			m_index++;
		}
		
	}
	
	/** adds integer in array at index
	 * if index is larger then array size
	 * it returns without doing anything */
	public void addAt(int index, int value) {
		if(index >= m_size) {
			return;
		}else{
			m_array[index - 1] = value;
		} 
	}
	
	/** removes element at specific index */
	public void remove(int index) {
		
		if(index >= m_size) {
			return;
		}
		
		m_index = 0;
		int temp[] = new int[m_size - 1];
		
		for(int i = 0; i < m_size - 1; i++) {
			if(index - 1 <= i) {
				temp[i] = m_array[i + 1];
				m_index++;
			}else {
				temp[i] = m_array[i];
				m_index++;

			}
		}
		
		m_array = temp;
	}
	
	public void sort() {
		//TODO(pedja) sort m_array from lowest to highest value */
	}
	
	public void insert(int index) {
		//TODO(pedja): insert value at specific position so the first element
		// becomes the second
	}
	
	public void addTop(int value) {
		//TODO(pedja): add at the beggining of the array
	}
	
	public String toString() {
		String text = new String();
		
		text = Arrays.toString(m_array);
		
		return text;
	}
	
}

