package com.google.android.apps.gsa.staticplugins.messages.monet.p8034a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.a.f */
/* compiled from: PG */
public enum C102725f implements C62957cd {
    UNKNOWN_MODE(0),
    HIDDEN(1),
    SHOWN_ACTIVE(2),
    SHOWN_NONACTIVE(3);
    

    /* renamed from: e */
    public final int f286782e;

    private C102725f(int i) {
        this.f286782e = i;
    }

    /* renamed from: a */
    public static C102725f m170319a(int i) {
        if (i == 0) {
            return UNKNOWN_MODE;
        }
        if (i == 1) {
            return HIDDEN;
        }
        if (i == 2) {
            return SHOWN_ACTIVE;
        }
        if (i != 3) {
            return null;
        }
        return SHOWN_NONACTIVE;
    }

    /* renamed from: b */
    public static C62959cf m170320b() {
        return C102724e.f286776a;
    }

    public final int getNumber() {
        return this.f286782e;
    }

    public final String toString() {
        return Integer.toString(this.f286782e);
    }
}
