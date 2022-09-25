package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gc */
/* compiled from: PG */
public enum C82941gc implements C62957cd {
    UNKNOWN_STATE(0),
    CONNECTED(1),
    STARTED(2),
    DEFAULT_STATE(3);
    

    /* renamed from: e */
    public final int f226297e;

    private C82941gc(int i) {
        this.f226297e = i;
    }

    /* renamed from: a */
    public static C82941gc m132433a(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return CONNECTED;
        }
        if (i == 2) {
            return STARTED;
        }
        if (i != 3) {
            return null;
        }
        return DEFAULT_STATE;
    }

    /* renamed from: b */
    public static C62959cf m132434b() {
        return C82940gb.f226291a;
    }

    public final int getNumber() {
        return this.f226297e;
    }

    public final String toString() {
        return Integer.toString(this.f226297e);
    }
}
