package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.cg */
/* compiled from: PG */
public enum C98413cg implements C62957cd {
    REQUEST_TYPE_INVALID(0),
    REQUEST_TYPE_FULL(1),
    REQUEST_TYPE_ENTRY_TYPE_RESTRICT(2),
    REQUEST_TYPE_CARD_SELECTOR(3);
    

    /* renamed from: e */
    public final int f274731e;

    private C98413cg(int i) {
        this.f274731e = i;
    }

    /* renamed from: a */
    public static C98413cg m162977a(int i) {
        if (i == 0) {
            return REQUEST_TYPE_INVALID;
        }
        if (i == 1) {
            return REQUEST_TYPE_FULL;
        }
        if (i == 2) {
            return REQUEST_TYPE_ENTRY_TYPE_RESTRICT;
        }
        if (i != 3) {
            return null;
        }
        return REQUEST_TYPE_CARD_SELECTOR;
    }

    /* renamed from: b */
    public static C62959cf m162978b() {
        return C98412cf.f274725a;
    }

    public final int getNumber() {
        return this.f274731e;
    }

    public final String toString() {
        return Integer.toString(this.f274731e);
    }
}
