package fr.mds.tp1.entities;

import java.util.ArrayList;
import java.util.List;

import com.sun.tools.doclint.Entity;

public class NewSingleton {
	private NewSingleton() {

		for (int i = 0; i < 20; i++) {
			Entity1 e1 = new Entity1();
			e1.setId(i % 15);
			e1.setData("data " + i);
			result.add(e1);
		}

	}

	private static NewSingleton INSTANCE = null;
	private List<Entity1> result = new ArrayList<Entity1>();

	public List<Entity1> getSingletonList() {
		return this.result;
	}

	public static synchronized NewSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new NewSingleton();
		}
		return INSTANCE;
	}
}
