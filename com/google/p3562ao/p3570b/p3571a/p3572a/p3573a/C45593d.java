package com.google.p3562ao.p3570b.p3571a.p3572a.p3573a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ao.b.a.a.a.d */
/* compiled from: PG */
public enum C45593d implements C62957cd {
    VOICE_MATCH_CONSENT_VERSION_UNSPECIFIED(0),
    V1(1),
    V2(2),
    V3(3);
    

    /* renamed from: e */
    public final int f119162e;

    private C45593d(int i) {
        this.f119162e = i;
    }

    /* renamed from: a */
    public static C45593d m81281a(int i) {
        if (i == 0) {
            return VOICE_MATCH_CONSENT_VERSION_UNSPECIFIED;
        }
        if (i == 1) {
            return V1;
        }
        if (i == 2) {
            return V2;
        }
        if (i != 3) {
            return null;
        }
        return V3;
    }

    /* renamed from: b */
    public static C62959cf m81282b() {
        return C45592c.f119156a;
    }

    public final int getNumber() {
        return this.f119162e;
    }

    public final String toString() {
        return Integer.toString(this.f119162e);
    }
}
