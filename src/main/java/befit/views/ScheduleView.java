package befit.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "schedule", layout = MainLayout.class)
public class ScheduleView extends VerticalLayout {

    public ScheduleView() {
        add(new H1("Schedule"));
        // Add content for schedule
    }
}
