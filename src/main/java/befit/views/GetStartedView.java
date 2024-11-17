package befit.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("get-started") // Maps to /get-started
public class GetStartedView extends VerticalLayout {

    public GetStartedView() {
        add(new H1("Get Started with Befit!"));
    }
}
