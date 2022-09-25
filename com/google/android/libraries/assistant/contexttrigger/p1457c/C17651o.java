package com.google.android.libraries.assistant.contexttrigger.p1457c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.o */
/* compiled from: PG */
public enum C17651o implements C62957cd {
    UNKNOWN(0),
    HEADPHONE(1);
    

    /* renamed from: c */
    public final int f50777c;

    private C17651o(int i) {
        this.f50777c = i;
    }

    /* renamed from: a */
    public static C17651o m34942a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return HEADPHONE;
    }

    /* renamed from: b */
    public static C62959cf m34943b() {
        return C17650n.f50773a;
    }

    public final int getNumber() {
        return this.f50777c;
    }

    public final String toString() {
        return Integer.toString(this.f50777c);
    }
}
