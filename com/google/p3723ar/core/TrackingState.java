package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.TrackingState */
/* compiled from: PG */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);
    
    final int nativeCode;

    private TrackingState(int i) {
        this.nativeCode = i;
    }

    static TrackingState forNumber(int i) {
        for (TrackingState trackingState : values()) {
            if (trackingState.nativeCode == i) {
                return trackingState;
            }
        }
        throw new FatalException("Unexpected value for native TrackingState, value=" + i);
    }
}
