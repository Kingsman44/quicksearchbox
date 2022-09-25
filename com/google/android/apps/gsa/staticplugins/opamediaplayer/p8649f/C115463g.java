package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.g */
/* compiled from: PG */
public enum C115463g implements C62957cd {
    UNKNOWN_ERROR(0),
    NETWORK_ERROR(1),
    END_OF_QUEUE_ERROR(2);
    

    /* renamed from: d */
    public final int f320299d;

    private C115463g(int i) {
        this.f320299d = i;
    }

    /* renamed from: a */
    public static C115463g m191514a(int i) {
        if (i == 0) {
            return UNKNOWN_ERROR;
        }
        if (i == 1) {
            return NETWORK_ERROR;
        }
        if (i != 2) {
            return null;
        }
        return END_OF_QUEUE_ERROR;
    }

    /* renamed from: b */
    public static C62959cf m191515b() {
        return C115462f.f320294a;
    }

    public final int getNumber() {
        return this.f320299d;
    }

    public final String toString() {
        return Integer.toString(this.f320299d);
    }
}
