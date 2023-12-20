package mmr.epde.StudentHub.repository;

import mmr.epde.StudentHub.model.CalendarEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long> {
    List<CalendarEvent> findByEventDate(LocalDate eventDate);
}
