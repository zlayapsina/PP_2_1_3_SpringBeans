package app.model;

import org.springframework.stereotype.Component;

@Component("timer")
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
