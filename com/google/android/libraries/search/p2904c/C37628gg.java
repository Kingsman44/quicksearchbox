package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.gg */
/* compiled from: PG */
public enum C37628gg implements C62957cd {
    EVENT_UNDEFINED(0),
    EVENT_FAILURE(1),
    EVENT_LISTENING(2),
    EVENT_NO_INPUT(3),
    EVENT_OPEN(4),
    EVENT_SUCCESS(5);
    

    /* renamed from: g */
    public final int f99986g;

    private C37628gg(int i) {
        this.f99986g = i;
    }

    /* renamed from: a */
    public static C37628gg m66600a(int i) {
        if (i == 0) {
            return EVENT_UNDEFINED;
        }
        if (i == 1) {
            return EVENT_FAILURE;
        }
        if (i == 2) {
            return EVENT_LISTENING;
        }
        if (i == 3) {
            return EVENT_NO_INPUT;
        }
        if (i == 4) {
            return EVENT_OPEN;
        }
        if (i != 5) {
            return null;
        }
        return EVENT_SUCCESS;
    }

    /* renamed from: b */
    public static C62959cf m66601b() {
        return C37627gf.f99978a;
    }

    public final int getNumber() {
        return this.f99986g;
    }

    public final String toString() {
        return Integer.toString(this.f99986g);
    }
}
