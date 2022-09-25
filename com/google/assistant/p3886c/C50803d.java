package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.d */
/* compiled from: PG */
public enum C50803d implements C62957cd {
    UNDEFINED_CATEGORY(0),
    MUSIC(1),
    VIDEO(2),
    AUDIOBOOKS(3),
    PODCASTS(4);
    

    /* renamed from: f */
    public final int f132250f;

    private C50803d(int i) {
        this.f132250f = i;
    }

    /* renamed from: a */
    public static C50803d m85941a(int i) {
        if (i == 0) {
            return UNDEFINED_CATEGORY;
        }
        if (i == 1) {
            return MUSIC;
        }
        if (i == 2) {
            return VIDEO;
        }
        if (i == 3) {
            return AUDIOBOOKS;
        }
        if (i != 4) {
            return null;
        }
        return PODCASTS;
    }

    /* renamed from: b */
    public static C62959cf m85942b() {
        return C50762c.f132100a;
    }

    public final int getNumber() {
        return this.f132250f;
    }

    public final String toString() {
        return Integer.toString(this.f132250f);
    }
}
