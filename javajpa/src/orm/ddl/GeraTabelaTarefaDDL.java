package orm.ddl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelaTarefaDDL {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		factory.close();
	}
}
