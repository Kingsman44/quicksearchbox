package com.google.p3723ar.core;

import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.EarthNetworkClientInterface */
/* compiled from: PG */
public interface EarthNetworkClientInterface {

    /* renamed from: com.google.ar.core.EarthNetworkClientInterface$ServiceMethod */
    /* compiled from: PG */
    public enum ServiceMethod {
        LOCALIZE(0),
        FACADES(1),
        BLUESKY(2),
        WARMUP(3),
        TERRAIN_POINT(4),
        TERRAIN_CELL(5),
        VPS_AVAILABILITY(6);
        
        final int nativeCode;

        private ServiceMethod(int i) {
            this.nativeCode = i;
        }
    }

    void post(ServiceMethod serviceMethod, ByteBuffer byteBuffer, EarthNetworkCallbackInterface earthNetworkCallbackInterface);
}
