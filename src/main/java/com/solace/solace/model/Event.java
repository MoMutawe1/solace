package com.solace.solace.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Event {
    private String title;
    private String region;
    private String ctsStartTime;
    private String ctsEndTime;
}
