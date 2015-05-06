package examples;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnot {

	public static void main(String[] args) throws Throwable {
		// Thing t = new Thing();
		// Class c = t.getClass(); // or Thing.class

		Class c = Class.forName("examples.Thing");
		Object t = c.newInstance();

		Field[] fields = c.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("> " + f.getName());
			MyAnnot ma = f.getAnnotation(MyAnnot.class);
			if (ma != null) {
				System.out.println("Annotation found! We have " + ma.value()
						+ " " + ma.fruit());
				f.setAccessible(true);
				f.set(t, "Hello");
			}
		}
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		System.out.println("t.name is " + nameField.get(t));

		Method[] methods = c.getDeclaredMethods();
		for (Method m : methods) {
			InvokeMe im = m.getAnnotation(InvokeMe.class);
			if (im != null) {
				Object rv = m.invoke(t, im.value() + " from invoke");
				System.out.println("Result of invocation is " + rv
						+ " which is a " + rv.getClass().getName());
			}
		}
	}

}
