package com.google.android.libraries.assistant.p1535p.p1536a.p1538b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.p.a.b.i */
/* compiled from: PG */
public enum C18521i implements C62957cd {
    WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED(0),
    ENABLE(1),
    DISABLE(2),
    HIGHLIGHT(3);
    

    /* renamed from: e */
    public final int f52491e;

    private C18521i(int i) {
        this.f52491e = i;
    }

    /* renamed from: a */
    public static C18521i m35984a(int i) {
        if (i == 0) {
            return WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return ENABLE;
        }
        if (i == 2) {
            return DISABLE;
        }
        if (i != 3) {
            return null;
        }
        return HIGHLIGHT;
    }

    /* renamed from: b */
    public static C62959cf m35985b() {
        return C18520h.f52485a;
    }

    public final int getNumber() {
        return this.f52491e;
    }

    public final String toString() {
        return Integer.toString(this.f52491e);
    }
}
