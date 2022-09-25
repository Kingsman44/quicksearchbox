package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.bz */
/* compiled from: PG */
public enum C69431bz implements C62957cd {
    UNKNOWN_TAB(0),
    INTERESTS_TAB(1),
    UPDATES_TAB(2),
    RECENTS_TAB(3),
    SEARCH_TAB(4),
    DRAWER_TAB(5),
    COLLECTIONS_TAB(6),
    MULTIPLE_TABS(7),
    NO_TAB(8);
    

    /* renamed from: j */
    public final int f185791j;

    private C69431bz(int i) {
        this.f185791j = i;
    }

    /* renamed from: a */
    public static C69431bz m100756a(int i) {
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
                return DRAWER_TAB;
            case 6:
                return COLLECTIONS_TAB;
            case 7:
                return MULTIPLE_TABS;
            case 8:
                return NO_TAB;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m100757b() {
        return C69430by.f185780a;
    }

    public final int getNumber() {
        return this.f185791j;
    }

    public final String toString() {
        return Integer.toString(this.f185791j);
    }
}
