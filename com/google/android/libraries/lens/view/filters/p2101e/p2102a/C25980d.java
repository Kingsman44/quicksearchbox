package com.google.android.libraries.lens.view.filters.p2101e.p2102a;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.filters.e.a.d */
/* compiled from: PG */
public enum C25980d {
    AUTO_FILTER,
    DINING,
    SHOPPING,
    TRANSLATE,
    TEXT,
    OUTDOOR,
    EDUCATION;

    /* renamed from: a */
    public static C25980d m47949a(C56306df dfVar) {
        C56306df dfVar2 = C56306df.UNKNOWN_FILTER_TYPE;
        int ordinal = dfVar.ordinal();
        if (ordinal == 3) {
            return TRANSLATE;
        }
        if (ordinal == 4) {
            return SHOPPING;
        }
        if (ordinal == 5) {
            return DINING;
        }
        if (ordinal == 6) {
            return TEXT;
        }
        if (ordinal != 7) {
            return ordinal != 10 ? AUTO_FILTER : EDUCATION;
        }
        return OUTDOOR;
    }

    /* renamed from: b */
    public final C56306df mo31199b() {
        C56306df dfVar = C56306df.UNKNOWN_FILTER_TYPE;
        switch (ordinal()) {
            case 0:
                return C56306df.AUTO_FILTER;
            case 1:
                return C56306df.DINING;
            case 2:
                return C56306df.SHOPPING;
            case 3:
                return C56306df.TRANSLATE;
            case 4:
                return C56306df.TEXT;
            case 5:
                return C56306df.OUTDOOR;
            case 6:
                return C56306df.EDUCATION;
            default:
                return C56306df.UNKNOWN_FILTER_TYPE;
        }
    }
}
