package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.j.b.b.d */
/* compiled from: PG */
public enum C57807d implements C62957cd {
    APP_UNSPECIFIED(0),
    APP_GOOGLE_APP(1),
    APP_DEV_APP(2);
    

    /* renamed from: d */
    public final int f154447d;

    private C57807d(int i) {
        this.f154447d = i;
    }

    /* renamed from: a */
    public static C57807d m88532a(int i) {
        if (i == 0) {
            return APP_UNSPECIFIED;
        }
        if (i == 1) {
            return APP_GOOGLE_APP;
        }
        if (i != 2) {
            return null;
        }
        return APP_DEV_APP;
    }

    /* renamed from: b */
    public static C62959cf m88533b() {
        return C57806c.f154442a;
    }

    public final int getNumber() {
        return this.f154447d;
    }

    public final String toString() {
        return Integer.toString(this.f154447d);
    }
}
