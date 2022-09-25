package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.c.a.e */
/* compiled from: PG */
public enum C57456e implements C62957cd {
    ACCESSIBILITY_ROLE_UNSPECIFIED(0),
    LIST(1),
    HEADER(2);
    

    /* renamed from: d */
    private final int f153481d;

    private C57456e(int i) {
        this.f153481d = i;
    }

    /* renamed from: a */
    public static C57456e m88356a(int i) {
        if (i == 0) {
            return ACCESSIBILITY_ROLE_UNSPECIFIED;
        }
        if (i == 1) {
            return LIST;
        }
        if (i != 2) {
            return null;
        }
        return HEADER;
    }

    /* renamed from: b */
    public static C62959cf m88357b() {
        return C57429d.f153405a;
    }

    public final int getNumber() {
        return this.f153481d;
    }

    public final String toString() {
        return Integer.toString(this.f153481d);
    }
}
