package notebook.repository;

import notebook.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    List<Note> findAllByOrderByDateAsc();
    List<Note> findAllByOrderByDateDesc();

}
