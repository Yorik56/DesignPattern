package fr.mds.tp1.entities;

import java.util.ArrayList;
import java.util.List;

import com.sun.tools.doclint.Entity;

public class NewSingleton {
	private NewSingleton() {

		for (int i = 0; i < 20; i++) {
			Entity1 e1 = new Entity1();
			this.autoIncrementId(e1);
			e1.setData("data " + i);
			result.add(e1);
		}

	}
	
	public void autoIncrementId(Entity1 el) {
		long idmax;
//		int idmax = this.getSingletonList().stream().filter(x->x.getId() == this.getSingletonList().stream().max().map(x->x.getId());
		if(this.getSingletonList().size() > 0) {
			idmax = this.getSingletonList().stream().max((o1,o2) -> o1.getId() > o2.getId() ? 1 : -1).get().getId();
		}
		else {
			idmax = 0;
		}
		el.setId(idmax + 1);
	}

	private static NewSingleton INSTANCE = null;
	private List<Entity1> result = new ArrayList<Entity1>();

	public List<Entity1> getSingletonList() {
		return this.result;
	}

	public void addEntityList(Entity1 e) {
		this.getSingletonList().add(e);
	}

	public static synchronized NewSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new NewSingleton();
		}
		return INSTANCE;
	}
}
