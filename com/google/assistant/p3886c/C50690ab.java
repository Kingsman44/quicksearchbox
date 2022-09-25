package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.ab */
/* compiled from: PG */
public enum C50690ab implements C62957cd {
    UNSPECIFIED(0),
    MBS(1),
    POTTER(2),
    MEDIA_SESSION(3);
    

    /* renamed from: e */
    public final int f131877e;

    private C50690ab(int i) {
        this.f131877e = i;
    }

    /* renamed from: a */
    public static C50690ab m85884a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return MBS;
        }
        if (i == 2) {
            return POTTER;
        }
        if (i != 3) {
            return null;
        }
        return MEDIA_SESSION;
    }

    /* renamed from: b */
    public static C62959cf m85885b() {
        return C50689aa.f131871a;
    }

    public final int getNumber() {
        return this.f131877e;
    }

    public final String toString() {
        return Integer.toString(this.f131877e);
    }
}
