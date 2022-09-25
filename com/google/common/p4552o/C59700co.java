package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.co */
/* compiled from: PG */
public enum C59700co implements C62957cd {
    UNKNOWN(0),
    SEARCH(1),
    INTERACTOR(2);
    

    /* renamed from: d */
    public final int f160179d;

    private C59700co(int i) {
        this.f160179d = i;
    }

    /* renamed from: a */
    public static C59700co m92487a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SEARCH;
        }
        if (i != 2) {
            return null;
        }
        return INTERACTOR;
    }

    /* renamed from: b */
    public static C62959cf m92488b() {
        return C59699cn.f160174a;
    }

    public final int getNumber() {
        return this.f160179d;
    }

    public final String toString() {
        return Integer.toString(this.f160179d);
    }
}
