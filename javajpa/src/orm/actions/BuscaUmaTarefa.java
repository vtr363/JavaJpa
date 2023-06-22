package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Tarefa;

public class BuscaUmaTarefa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();
    
        Tarefa t = manager.find(Tarefa.class, 2);
        System.out.println(t.getDescricao());

        manager.close();

    
    }
}
