package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.bb */
/* compiled from: PG */
public enum C124636bb implements C62957cd {
    UNKNOWN_ENABLED_STATE(0),
    OPA_ENABLED(1),
    OPA_DISABLED(2),
    OPA_DISABLED_BY_USER(3);
    

    /* renamed from: e */
    public final int f343849e;

    private C124636bb(int i) {
        this.f343849e = i;
    }

    /* renamed from: a */
    public static C124636bb m204301a(int i) {
        if (i == 0) {
            return UNKNOWN_ENABLED_STATE;
        }
        if (i == 1) {
            return OPA_ENABLED;
        }
        if (i == 2) {
            return OPA_DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return OPA_DISABLED_BY_USER;
    }

    /* renamed from: b */
    public static C62959cf m204302b() {
        return C124635ba.f343843a;
    }

    public final int getNumber() {
        return this.f343849e;
    }

    public final String toString() {
        return Integer.toString(this.f343849e);
    }
}
