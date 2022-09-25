package com.google.p3723ar.core;

import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.EarthNetworkCallResult */
/* compiled from: PG */
public class EarthNetworkCallResult {
    private final ByteBuffer response;
    private final int responseStatusCode;

    public EarthNetworkCallResult(ByteBuffer byteBuffer, int i) {
        this.response = byteBuffer;
        this.responseStatusCode = i;
    }

    public ByteBuffer getResponse() {
        return this.response;
    }

    public int getResponseStatusCode() {
        return this.responseStatusCode;
    }
}
