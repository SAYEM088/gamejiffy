package befit.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.*;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends VerticalLayout implements RouterLayout {

    public MainLayout() {
        // Set layout styles
        setWidthFull();
        setHeightFull();
        getStyle().set("background-color", "#d6e0f5");
        getStyle().set("padding", "0");
        getStyle().set("margin", "0");

        // Header Section
        HorizontalLayout header = createHeader();
        add(header);

        // Sub-navigation bar
        HorizontalLayout subNavBar = createSubNavigation();
        add(subNavBar);

        // Content Section
        HorizontalLayout mainContent = createMainContent();
        add(mainContent);
    }

    private HorizontalLayout createHeader() {
        // Logo
        Span logo = new Span("GameJiffy");
        logo.getStyle().set("font-size", "24px");
        logo.getStyle().set("font-weight", "bold");
        logo.getStyle().set("color", "#004080");

        // Navigation links
        RouterLink liveScoreLink = new RouterLink("Live Score", LiveScoresView.class);
        liveScoreLink.getStyle().set("margin-right", "20px");

        // Search box
        Input searchBox = new Input();
        searchBox.setPlaceholder("search");
        searchBox.getStyle().set("width", "200px");
        searchBox.getStyle().set("padding", "5px");

        // Host Your Game Button
        Button hostButton = new Button("Host your Game");
        hostButton.getStyle().set("background-color", "#ff0000");
        hostButton.getStyle().set("color", "white");
        hostButton.getStyle().set("border", "none");
        hostButton.getStyle().set("padding", "10px 20px");

        // Header layout
        HorizontalLayout header = new HorizontalLayout(logo, liveScoreLink, searchBox, hostButton);
        header.setWidthFull();
        header.setAlignItems(Alignment.CENTER);
        header.setPadding(true);
        header.getStyle().set("background-color", "#6a93cb");

        return header;
    }

    private HorizontalLayout createSubNavigation() {
        // Sub-navigation items
        Button iplButton = createTabButton("IPL");
        Button bplButton = createTabButton("BPL");
        Button cplButton = createTabButton("CPL");
        Button laLigaButton = createTabButton("LA-LIGA");
        Button arabLeagueButton = createTabButton("ARAB LEAGUE");

        HorizontalLayout subNavBar = new HorizontalLayout(iplButton, bplButton, cplButton, laLigaButton, arabLeagueButton);
        subNavBar.setWidthFull();
        subNavBar.getStyle().set("background-color", "#b8c6e3");
        subNavBar.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);

        return subNavBar;
    }

    private HorizontalLayout createMainContent() {
        // Left Section (Latest News)
        Div latestNews = new Div();
        latestNews.setText("Latest News");
        latestNews.getStyle().set("background-color", "#d4e4f7");
        latestNews.getStyle().set("padding", "10px");
        latestNews.getStyle().set("width", "20%");
        latestNews.getStyle().set("height", "600px");

        // Center Section (Live Matches)
        VerticalLayout liveMatches = new VerticalLayout();
        liveMatches.add(createLiveCard("IND VS BAN", "BAN 150-5 (48.2)"));
        liveMatches.add(createLiveCard("AUS VS NZ", "NZ 15-2 (8.2)"));
        liveMatches.add(createLiveCard("RANG VS RAJ", "RANG 100-5 (28.2)"));
        liveMatches.add(createLiveCard("WEST VS AF", "WEST 220-4 (38.2)"));
        liveMatches.setWidth("60%");
        liveMatches.getStyle().set("background-color", "#e9f0fa");

        // Right Section (Games and AI Images)
        VerticalLayout rightSection = new VerticalLayout();
        rightSection.add(createGamesSection(), createAIImageSection());
        rightSection.setWidth("20%");
        rightSection.getStyle().set("background-color", "#d4e4f7");

        // Main Content Layout
        HorizontalLayout mainContent = new HorizontalLayout(latestNews, liveMatches, rightSection);
        mainContent.setWidthFull();
        mainContent.setHeight("100%");
        return mainContent;
    }

    private Button createTabButton(String name) {
        Button button = new Button(name);
        button.getStyle().set("background-color", "#4a76a8");
        button.getStyle().set("color", "white");
        button.getStyle().set("border", "none");
        button.getStyle().set("margin", "5px");
        button.getStyle().set("padding", "5px 10px");
        return button;
    }

    private Div createLiveCard(String match, String score) {
        Div card = new Div();
        card.add(new H4(match), new Paragraph(score));
        card.getStyle().set("background-color", "#4a76a8");
        card.getStyle().set("color", "white");
        card.getStyle().set("margin", "5px");
        card.getStyle().set("padding", "10px");
        card.getStyle().set("border-radius", "5px");
        return card;
    }

    private VerticalLayout createGamesSection() {
        VerticalLayout gamesSection = new VerticalLayout();
        gamesSection.add(new H4("Games"));
        gamesSection.add(createTabButton("Football"), createTabButton("Cricket"), createTabButton("Tennis"), createTabButton("ValleyBall"));
        return gamesSection;
    }

    private Div createAIImageSection() {
        Div aiImages = new Div();
        aiImages.setText("AI Images");
        aiImages.getStyle().set("background-color", "#4a76a8");
        aiImages.getStyle().set("color", "white");
        aiImages.getStyle().set("margin", "5px");
        aiImages.getStyle().set("padding", "10px");
        return aiImages;
    }
}
