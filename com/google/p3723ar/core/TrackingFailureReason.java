package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.TrackingFailureReason */
/* compiled from: PG */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);
    
    final int nativeCode;

    private TrackingFailureReason(int i) {
        this.nativeCode = i;
    }

    static TrackingFailureReason forNumber(int i) {
        for (TrackingFailureReason trackingFailureReason : values()) {
            if (trackingFailureReason.nativeCode == i) {
                return trackingFailureReason;
            }
        }
        throw new FatalException("Unexpected value for native TrackingFailureReason, value=" + i);
    }
}
