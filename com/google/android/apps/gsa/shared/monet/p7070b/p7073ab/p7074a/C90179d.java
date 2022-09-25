package com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.p7074a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.ab.a.d */
/* compiled from: PG */
public enum C90179d implements C62957cd {
    UNKNOWN(0),
    ACTIONS(1),
    MESSAGES(2),
    WEB_VIEW(3),
    IPA(4),
    FULL_ACTIONS(5),
    FULL_MESSAGES(6),
    NATIVE_VIEWS(7);
    

    /* renamed from: i */
    public final int f251947i;

    private C90179d(int i) {
        this.f251947i = i;
    }

    /* renamed from: a */
    public static C90179d m146748a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ACTIONS;
            case 2:
                return MESSAGES;
            case 3:
                return WEB_VIEW;
            case 4:
                return IPA;
            case 5:
                return FULL_ACTIONS;
            case 6:
                return FULL_MESSAGES;
            case 7:
                return NATIVE_VIEWS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m146749b() {
        return C90178c.f251937a;
    }

    public final int getNumber() {
        return this.f251947i;
    }

    public final String toString() {
        return Integer.toString(this.f251947i);
    }
}
