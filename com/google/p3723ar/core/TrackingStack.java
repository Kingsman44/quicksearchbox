package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.TrackingStack */
/* compiled from: PG */
public enum TrackingStack {
    NO_TRACKING(0),
    MOTION_TRACKING_3DOF(1),
    MOTION_TRACKING_6DOF(2);
    
    final int nativeCode;

    private TrackingStack(int i) {
        this.nativeCode = i;
    }

    static TrackingStack forNumber(int i) {
        for (TrackingStack trackingStack : values()) {
            if (trackingStack.nativeCode == i) {
                return trackingStack;
            }
        }
        throw new FatalException("Unexpected value for native TrackingStack, value=" + i);
    }
}
