package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Encoder {

    private IEncoder iEncoder; // 의존대상 A

    // DI를 주입받음
    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder; // 의존대상 A
    }

    public void setiEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message)
    {
        return iEncoder.encode(message);
    }
}
