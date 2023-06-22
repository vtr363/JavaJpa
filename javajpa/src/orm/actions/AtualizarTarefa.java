package orm.actions;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Tarefa;

public class AtualizarTarefa {
    
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.setId(1L);
        tarefa.setDescricao("Estudar Muito Python");
        tarefa.setDataFinalizacao(Calendar.getInstance());
        tarefa.setFinalizado(false);
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();

        
        tarefa = manager.find(Tarefa.class, tarefa.getId());

        manager.getTransaction().begin();
        manager.merge(tarefa);
        manager.getTransaction().commit();

        System.out.println("Tarefa Atualizada : ");
    }
}
