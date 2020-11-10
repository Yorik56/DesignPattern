package fr.mds.tp1;

import java.util.ArrayList;
import java.util.List;

import fr.mds.tp1.entities.Entity1;
import fr.mds.tp1.entities.NewSingleton;

/**
 *
 * @author tactfactory
 *
 *         - Modifier le programme pour : - 1 : permettre d'accéder n'importe
 *         où dans le projet à la liste d'Entity1 - 2 : faire en sorte que les
 *         ajouts, suppresions sur la liste d'Entity1 soient préservés durant
 *         l'exécution du programme - 3 : que les id des éléments dans la
 *         liste ne soient plus saisissables par le développeur et qu'ils
 *         deviennent auto-incrémentés
 */
public class SingletonTp1 {
	public static void main(String[] args) {

		System.out.println(String.format("Nombre d'Entity1 %d", NewSingleton.getInstance().getSingletonList().stream().count()));

		Entity1 e11 = new Entity1();
		NewSingleton.getInstance().autoIncrementId(e11);
		e11.setData("data e1 15");
		
		NewSingleton.getInstance().addEntityList(e11);


		Entity1 e12 = new Entity1();
		NewSingleton.getInstance().autoIncrementId(e12);
		e12.setData("data e1 16");


		NewSingleton.getInstance().addEntityList(e12);

		for (Entity1 item :NewSingleton.getInstance().getSingletonList()) {
			System.out.println(item);
		}
	}


}
