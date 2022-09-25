package com.google.protos.youtube.elements;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.protos.youtube.elements.dd */
/* compiled from: PG */
public enum C66190dd implements C62957cd {
    GESTURE_TYPE_UNKNOWN(0),
    GESTURE_TYPE_CLICK(1),
    GESTURE_TYPE_SWIPE(2),
    GESTURE_TYPE_LONG_PRESS(3);
    

    /* renamed from: e */
    public final int f179995e;

    private C66190dd(int i) {
        this.f179995e = i;
    }

    public final int getNumber() {
        return this.f179995e;
    }

    public final String toString() {
        return Integer.toString(this.f179995e);
    }
}
