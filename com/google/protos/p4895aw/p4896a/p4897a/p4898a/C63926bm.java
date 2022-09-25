package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.a.a.a.bm */
/* compiled from: PG */
public enum C63926bm implements C62957cd {
    UNSPECIFIED(0),
    HOME(1),
    SEARCH(2),
    COLLECTIONS(3),
    TABS(4),
    MINUS_ONE(5),
    GOOGLE_APP_BROWSER(6);
    

    /* renamed from: h */
    public final int f172871h;

    private C63926bm(int i) {
        this.f172871h = i;
    }

    /* renamed from: a */
    public static C63926bm m96318a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return HOME;
            case 2:
                return SEARCH;
            case 3:
                return COLLECTIONS;
            case 4:
                return TABS;
            case 5:
                return MINUS_ONE;
            case 6:
                return GOOGLE_APP_BROWSER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96319b() {
        return C63925bl.f172862a;
    }

    public final int getNumber() {
        return this.f172871h;
    }

    public final String toString() {
        return Integer.toString(this.f172871h);
    }
}
