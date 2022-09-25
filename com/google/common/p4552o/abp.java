package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.abp */
/* compiled from: PG */
public enum abp implements C62957cd {
    UNKNOWN_QUERY_SOURCE(0),
    TEXT_INPUT(1),
    SPEECH_TRANSCRIPTION(2);
    

    /* renamed from: d */
    public final int f158221d;

    private abp(int i) {
        this.f158221d = i;
    }

    /* renamed from: a */
    public static abp m92369a(int i) {
        if (i == 0) {
            return UNKNOWN_QUERY_SOURCE;
        }
        if (i == 1) {
            return TEXT_INPUT;
        }
        if (i != 2) {
            return null;
        }
        return SPEECH_TRANSCRIPTION;
    }

    /* renamed from: b */
    public static C62959cf m92370b() {
        return abo.f158216a;
    }

    public final int getNumber() {
        return this.f158221d;
    }

    public final String toString() {
        return Integer.toString(this.f158221d);
    }
}
