package com.lucasangelo.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasangelo.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    //  ACHA O ID DO USUARIO (TEM QUE COLOCAR A CLASSE E DEPOIS UM UNDERLINE EM QUAL COLUNA QUER PEGAR)
    List<Task> findByUser_Id(Long id);

    
    //  @Query(value = "SELECT t FROM Task t WHERE t.user.id = :")
    //  List<Task> findByUserId(@Param("id") Long id);

    

}