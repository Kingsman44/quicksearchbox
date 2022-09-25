package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.qk */
/* compiled from: PG */
public enum C88134qk implements C62957cd {
    UNINITIALIZED(0),
    MODE_CHAT(1),
    MODE_ACTION(2);
    

    /* renamed from: d */
    public final int f238251d;

    private C88134qk(int i) {
        this.f238251d = i;
    }

    /* renamed from: a */
    public static C88134qk m142787a(int i) {
        if (i == 0) {
            return UNINITIALIZED;
        }
        if (i == 1) {
            return MODE_CHAT;
        }
        if (i != 2) {
            return null;
        }
        return MODE_ACTION;
    }

    /* renamed from: b */
    public static C62959cf m142788b() {
        return C88133qj.f238246a;
    }

    public final int getNumber() {
        return this.f238251d;
    }

    public final String toString() {
        return Integer.toString(this.f238251d);
    }
}
