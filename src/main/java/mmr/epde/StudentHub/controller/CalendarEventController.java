package mmr.epde.StudentHub.controller;

import lombok.RequiredArgsConstructor;
import mmr.epde.StudentHub.model.CalendarEvent;
import mmr.epde.StudentHub.model.Course;
import mmr.epde.StudentHub.repository.CalendarEventRepository;
import mmr.epde.StudentHub.repository.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/calendar")
@RequiredArgsConstructor
public class CalendarEventController {

    private final CalendarEventRepository calendarEventRepository;

    @GetMapping
    public String viewCalendar(Model model) {
        List<CalendarEvent> events = calendarEventRepository.findAll();
        model.addAttribute("events", events);
        return "calendar/view";
    }
}

