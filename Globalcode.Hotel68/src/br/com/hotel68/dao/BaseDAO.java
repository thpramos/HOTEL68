package br.com.hotel68.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.hotel68.model.Room;
import br.com.hotel68.model.RoomType;

public class BaseDAO {

	public static void testDatabase() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hotel68Database");
		EntityManager em = emf.createEntityManager();

		Room room = em.find(Room.class, 1);
		if (room != null) {
			System.out.printf("Room %d, type %s%n", room.getId(), room.getType());
		} else {
			System.out.println("Room not found, creating an example...");
			room = new Room(1, "Quarto1", RoomType.MASTER);
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(room);
			tx.commit();
		}

		em.close();
		emf.close();
	}

}
