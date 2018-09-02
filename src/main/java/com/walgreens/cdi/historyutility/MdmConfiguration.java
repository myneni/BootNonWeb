package com.walgreens.cdi.historyutility;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Validated
@Component
@ConfigurationProperties(prefix = "mdm")
@Data
public class MdmConfiguration {

    @NotNull
    private String host;
    @NotNull
    private String user;
    @NotNull
    private String password;
    @PositiveOrZero
    private int timeout;
    @Positive
    private int maxCtx;
    private boolean useSsl;


}
