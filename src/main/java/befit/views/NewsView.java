package befit.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "news", layout = MainLayout.class)
public class NewsView extends VerticalLayout {

    public NewsView() {
        add(new H1("News"));
        // Add content for news
    }
}
