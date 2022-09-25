package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.b.b.aw */
/* compiled from: PG */
public enum C57139aw implements C62957cd {
    UNSPECIFIED(0),
    ON_SCROLL_END(1),
    ON_FEED_OPEN_OR_SCROLL_END(2);
    

    /* renamed from: d */
    private final int f152519d;

    private C57139aw(int i) {
        this.f152519d = i;
    }

    /* renamed from: a */
    public static C57139aw m88264a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return ON_SCROLL_END;
        }
        if (i != 2) {
            return null;
        }
        return ON_FEED_OPEN_OR_SCROLL_END;
    }

    /* renamed from: b */
    public static C62959cf m88265b() {
        return C57138av.f152514a;
    }

    public final int getNumber() {
        return this.f152519d;
    }

    public final String toString() {
        return Integer.toString(this.f152519d);
    }
}
