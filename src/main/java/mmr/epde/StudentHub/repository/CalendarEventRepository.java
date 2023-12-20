package mmr.epde.StudentHub.repository;

import mmr.epde.StudentHub.model.CalendarEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long> {
}
