
//Generic Class
public interface IDatabase<T> {
	boolean save(T item);
	T readFirstRecord();
}
