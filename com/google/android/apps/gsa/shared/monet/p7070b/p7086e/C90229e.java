package com.google.android.apps.gsa.shared.monet.p7070b.p7086e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.e.e */
/* compiled from: PG */
public enum C90229e implements C62957cd {
    UNKNOWN(0),
    SEARCH_NOW(1),
    SECOND_SCREEN(2),
    MINUS_ONE(3),
    SEARCH_NOW_FEED(4),
    SRP(5),
    DRAWER(6);
    

    /* renamed from: h */
    public final int f252076h;

    private C90229e(int i) {
        this.f252076h = i;
    }

    /* renamed from: a */
    public static C90229e m146771a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SEARCH_NOW;
            case 2:
                return SECOND_SCREEN;
            case 3:
                return MINUS_ONE;
            case 4:
                return SEARCH_NOW_FEED;
            case 5:
                return SRP;
            case 6:
                return DRAWER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m146772b() {
        return C90228d.f252067a;
    }

    public final int getNumber() {
        return this.f252076h;
    }

    public final String toString() {
        return Integer.toString(this.f252076h);
    }
}
