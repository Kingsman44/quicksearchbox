package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.opa.f.a.k */
/* compiled from: PG */
public enum C83659k implements C62957cd {
    UNKNOWN(0),
    EXPLICIT(1),
    OPA_CONVERSATION_CANCEL(2);
    

    /* renamed from: d */
    public final int f228043d;

    private C83659k(int i) {
        this.f228043d = i;
    }

    /* renamed from: a */
    public static C83659k m133199a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return EXPLICIT;
        }
        if (i != 2) {
            return null;
        }
        return OPA_CONVERSATION_CANCEL;
    }

    /* renamed from: b */
    public static C62959cf m133200b() {
        return C83658j.f228038a;
    }

    public final int getNumber() {
        return this.f228043d;
    }

    public final String toString() {
        return Integer.toString(this.f228043d);
    }
}
