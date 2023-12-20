package mmr.epde.StudentHub.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class CalendarEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;
    private LocalDate eventDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @Override
    public String toString() {
        return "CalendarEvent{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", course=" + course +
                '}';
    }
}
