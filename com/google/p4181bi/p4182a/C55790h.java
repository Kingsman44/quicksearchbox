package com.google.p4181bi.p4182a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bi.a.h */
/* compiled from: PG */
public enum C55790h implements C62957cd {
    INTERNAL_EXTERNAL_STATE_UNSPECIFIED(0),
    INTERNAL(1),
    EXTERNAL(2),
    NOT_APPLICABLE(3);
    

    /* renamed from: e */
    public final int f147217e;

    private C55790h(int i) {
        this.f147217e = i;
    }

    /* renamed from: a */
    public static C55790h m87733a(int i) {
        if (i == 0) {
            return INTERNAL_EXTERNAL_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return INTERNAL;
        }
        if (i == 2) {
            return EXTERNAL;
        }
        if (i != 3) {
            return null;
        }
        return NOT_APPLICABLE;
    }

    /* renamed from: b */
    public static C62959cf m87734b() {
        return C55789g.f147211a;
    }

    public final int getNumber() {
        return this.f147217e;
    }

    public final String toString() {
        return Integer.toString(this.f147217e);
    }
}
