package com.google.android.libraries.assistant.contexttrigger.p1461e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.e.c */
/* compiled from: PG */
public enum C17689c implements C62957cd {
    UNSPECIFIED(0),
    CONNECTED(1),
    DISCONNECTED(2);
    

    /* renamed from: d */
    public final int f50850d;

    private C17689c(int i) {
        this.f50850d = i;
    }

    /* renamed from: a */
    public static C17689c m34968a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTED;
        }
        if (i != 2) {
            return null;
        }
        return DISCONNECTED;
    }

    /* renamed from: b */
    public static C62959cf m34969b() {
        return C17688b.f50845a;
    }

    public final int getNumber() {
        return this.f50850d;
    }

    public final String toString() {
        return Integer.toString(this.f50850d);
    }
}
