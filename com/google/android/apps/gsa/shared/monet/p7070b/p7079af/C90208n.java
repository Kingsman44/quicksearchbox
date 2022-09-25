package com.google.android.apps.gsa.shared.monet.p7070b.p7079af;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.af.n */
/* compiled from: PG */
public enum C90208n implements C62957cd {
    UNKNOWN_TAB(0),
    INTERESTS_TAB(1),
    UPDATES_TAB(2),
    RECENTS_TAB(3),
    SEARCH_TAB(4),
    ASSISTANT_TAB(5),
    DRAWER_TAB(6),
    COLLECTIONS_TAB(7),
    NO_TAB(8),
    TOP_APPS_TAB(9),
    TABS_TAB(10);
    

    /* renamed from: l */
    public final int f251999l;

    private C90208n(int i) {
        this.f251999l = i;
    }

    /* renamed from: a */
    public static C90208n m146767a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TAB;
            case 1:
                return INTERESTS_TAB;
            case 2:
                return UPDATES_TAB;
            case 3:
                return RECENTS_TAB;
            case 4:
                return SEARCH_TAB;
            case 5:
                return ASSISTANT_TAB;
            case 6:
                return DRAWER_TAB;
            case 7:
                return COLLECTIONS_TAB;
            case 8:
                return NO_TAB;
            case 9:
                return TOP_APPS_TAB;
            case 10:
                return TABS_TAB;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m146768b() {
        return C90207m.f251986a;
    }

    public final int getNumber() {
        return this.f251999l;
    }

    public final String toString() {
        return Integer.toString(this.f251999l);
    }
}
