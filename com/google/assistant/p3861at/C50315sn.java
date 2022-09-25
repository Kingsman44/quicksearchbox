package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.sn */
/* compiled from: PG */
public enum C50315sn implements C62957cd {
    UNKNOWN_CONTENT_FORMAT(0),
    AUDIO(1),
    VIDEO(2);
    

    /* renamed from: d */
    private final int f130950d;

    private C50315sn(int i) {
        this.f130950d = i;
    }

    /* renamed from: a */
    public static C50315sn m85806a(int i) {
        if (i == 0) {
            return UNKNOWN_CONTENT_FORMAT;
        }
        if (i == 1) {
            return AUDIO;
        }
        if (i != 2) {
            return null;
        }
        return VIDEO;
    }

    /* renamed from: b */
    public static C62959cf m85807b() {
        return C50314sm.f130945a;
    }

    public final int getNumber() {
        return this.f130950d;
    }

    public final String toString() {
        return Integer.toString(this.f130950d);
    }
}
