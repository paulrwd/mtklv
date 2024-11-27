package ru.mitkalev.mtklv.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@Data
public class SecondService {
    @Value("${app.value}")
    private String val;
    @Scheduled(fixedDelayString = "${app.scheduled.delay.milliseconds}")
    public void process() {
        log.info(val);
    }
}
