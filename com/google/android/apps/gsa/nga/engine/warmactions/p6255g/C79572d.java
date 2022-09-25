package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.d */
/* compiled from: PG */
public enum C79572d implements C62957cd {
    FLAG_VALUE_UNSPECIFIED(0),
    AEC(6);
    

    /* renamed from: c */
    public final int f218344c;

    private C79572d(int i) {
        this.f218344c = i;
    }

    /* renamed from: a */
    public static C79572d m127650a(int i) {
        if (i == 0) {
            return FLAG_VALUE_UNSPECIFIED;
        }
        if (i != 6) {
            return null;
        }
        return AEC;
    }

    /* renamed from: b */
    public static C62959cf m127651b() {
        return C79571c.f218340a;
    }

    public final int getNumber() {
        return this.f218344c;
    }

    public final String toString() {
        return Integer.toString(this.f218344c);
    }
}
