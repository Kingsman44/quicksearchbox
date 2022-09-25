package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.l.a.aw */
/* compiled from: PG */
public enum C52690aw implements C62957cd {
    UNKNOWN_ENABLE_STATUS(0),
    DEFAULT(1),
    ENABLED(2),
    OPTED_OUT(3),
    OPTED_OUT_FROM_PREVIEW(4),
    DISMISSED_OPT_OUT_DIALOG(5);
    

    /* renamed from: g */
    public final int f138318g;

    private C52690aw(int i) {
        this.f138318g = i;
    }

    /* renamed from: a */
    public static C52690aw m86687a(int i) {
        if (i == 0) {
            return UNKNOWN_ENABLE_STATUS;
        }
        if (i == 1) {
            return DEFAULT;
        }
        if (i == 2) {
            return ENABLED;
        }
        if (i == 3) {
            return OPTED_OUT;
        }
        if (i == 4) {
            return OPTED_OUT_FROM_PREVIEW;
        }
        if (i != 5) {
            return null;
        }
        return DISMISSED_OPT_OUT_DIALOG;
    }

    /* renamed from: b */
    public static C62959cf m86688b() {
        return C52689av.f138310a;
    }

    public final int getNumber() {
        return this.f138318g;
    }

    public final String toString() {
        return Integer.toString(this.f138318g);
    }
}
