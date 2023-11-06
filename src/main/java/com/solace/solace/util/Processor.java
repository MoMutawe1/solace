package com.solace.solace.util;

import com.solace.solace.model.Event;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.function.Function;

/* A processor application which leverages java util function,
** by receiving/sending same session event. */
@Component
public class Processor {

    @Bean
    public Function<Event, Event> uppercase(){
        return e -> {
            System.out.println("Upper Casing Session: " + e);
            Event event = new Event();
            event.setRegion(e.getRegion().toUpperCase());
            event.setTitle(e.getTitle().toUpperCase());
            event.setCtsStartTime(e.getCtsStartTime());
            event.setCtsEndTime(e.getCtsEndTime());
            return event;
        };
    }
}
