package com.google.android.libraries.web.p3353c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.c.s */
/* compiled from: PG */
public enum C43374s implements C62957cd {
    RENDER_UNSUPPORTED(0),
    RENDER_ALIVE(1),
    RENDER_DEAD_IN_BACKGROUND(2),
    RENDER_DEAD_IN_FOREGROUND(3);
    

    /* renamed from: e */
    public final int f113325e;

    private C43374s(int i) {
        this.f113325e = i;
    }

    /* renamed from: a */
    public static C43374s m76523a(int i) {
        if (i == 0) {
            return RENDER_UNSUPPORTED;
        }
        if (i == 1) {
            return RENDER_ALIVE;
        }
        if (i == 2) {
            return RENDER_DEAD_IN_BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return RENDER_DEAD_IN_FOREGROUND;
    }

    /* renamed from: b */
    public static C62959cf m76524b() {
        return C43373r.f113319a;
    }

    public final int getNumber() {
        return this.f113325e;
    }

    public final String toString() {
        return Integer.toString(this.f113325e);
    }
}
