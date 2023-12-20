package mmr.epde.StudentHub.controller;

import lombok.RequiredArgsConstructor;
import mmr.epde.StudentHub.model.CalendarEvent;
import mmr.epde.StudentHub.model.Course;
import mmr.epde.StudentHub.repository.CalendarEventRepository;
import mmr.epde.StudentHub.repository.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentHubController {

    private final CourseRepository courseRepository;
    private final CalendarEventRepository calendarEventRepository;

    @GetMapping("/calendar")
    public String viewCalendar(Model model) {
        List<CalendarEvent> events = calendarEventRepository.findAll();
        model.addAttribute("events", events);
        return "calendar";
    }

    @GetMapping("/courses")
    public String listCourses(Model model) {
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "course";
    }
}
