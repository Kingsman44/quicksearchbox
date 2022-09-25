package com.google.android.apps.gsa.nga.engine.gestureclassifier;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.engine.gestureclassifier.j */
/* compiled from: PG */
public enum C76120j implements C62957cd {
    UNKNOWN(0),
    PICKUP(1),
    FLIP_DOWN(2);
    

    /* renamed from: d */
    private final int f211054d;

    private C76120j(int i) {
        this.f211054d = i;
    }

    /* renamed from: a */
    public static C76120j m122699a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PICKUP;
        }
        if (i != 2) {
            return null;
        }
        return FLIP_DOWN;
    }

    /* renamed from: b */
    public static C62959cf m122700b() {
        return C76119i.f211049a;
    }

    public final int getNumber() {
        return this.f211054d;
    }

    public final String toString() {
        return Integer.toString(this.f211054d);
    }
}
