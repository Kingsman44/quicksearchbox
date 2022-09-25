package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.pw */
/* compiled from: PG */
public enum C55370pw implements C62957cd {
    UNKNOWN_SELECTION_TYPE(0),
    USER_SELECTED(1),
    AUTOMATIC(2),
    SUGGESTED(3),
    NOT_SELECTED(4);
    

    /* renamed from: f */
    public final int f145906f;

    private C55370pw(int i) {
        this.f145906f = i;
    }

    /* renamed from: a */
    public static C55370pw m87678a(int i) {
        if (i == 0) {
            return UNKNOWN_SELECTION_TYPE;
        }
        if (i == 1) {
            return USER_SELECTED;
        }
        if (i == 2) {
            return AUTOMATIC;
        }
        if (i == 3) {
            return SUGGESTED;
        }
        if (i != 4) {
            return null;
        }
        return NOT_SELECTED;
    }

    /* renamed from: b */
    public static C62959cf m87679b() {
        return C55369pv.f145899a;
    }

    public final int getNumber() {
        return this.f145906f;
    }

    public final String toString() {
        return Integer.toString(this.f145906f);
    }
}
