package befit.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "live-scores", layout = MainLayout.class)
public class LiveScoresView extends VerticalLayout {

    public LiveScoresView() {
        add(new H1("Live Scores"));
        // Add content for live scores
    }
}
