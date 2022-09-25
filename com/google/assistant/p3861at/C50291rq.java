package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.rq */
/* compiled from: PG */
public enum C50291rq implements C62957cd {
    UNKNOWN(0),
    AUDIO_OUTPUT_DEVICE(1),
    VIDEO_OUTPUT_DEVICE(2);
    

    /* renamed from: d */
    private final int f130874d;

    private C50291rq(int i) {
        this.f130874d = i;
    }

    /* renamed from: a */
    public static C50291rq m85802a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AUDIO_OUTPUT_DEVICE;
        }
        if (i != 2) {
            return null;
        }
        return VIDEO_OUTPUT_DEVICE;
    }

    /* renamed from: b */
    public static C62959cf m85803b() {
        return C50290rp.f130869a;
    }

    public final int getNumber() {
        return this.f130874d;
    }

    public final String toString() {
        return Integer.toString(this.f130874d);
    }
}
