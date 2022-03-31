package components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.By;

@AllArgsConstructor
@Getter
public enum CareersButtons {

    SEARCH_OUR_JOB_OPENINGS(By.linkText("Search our job openings")),
    OPEN_JOB_POSITIONS(By.linkText("Open job positions"));

    private final By button;
}
