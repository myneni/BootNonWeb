package com.walgreens.cdi.historyutility.service;

import com.walgreens.cdi.historyutility.MdmConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HistoryService {

    MdmConfiguration config;

    public String getHistory() {
        return "Hello ";
    }
}
