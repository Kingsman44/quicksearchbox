package com.google.p4283bv.p4354e.p4367c.p4368a;

/* renamed from: com.google.bv.e.c.a.at */
/* compiled from: PG */
public final class C57368at {
    /* renamed from: a */
    public static /* synthetic */ String m88332a(int i) {
        switch (i) {
            case 1:
                return "IMAGE_ELEMENT";
            case 2:
                return "TEXT_ELEMENT";
            case 3:
                return "GRID_ROW";
            case 4:
                return "ELEMENT_LIST";
            case 5:
                return "ELEMENT_STACK";
            case 6:
                return "CUSTOM_ELEMENT";
            case 7:
                return "MODULE_ELEMENT";
            case 8:
                return "ELEMENTS_NOT_SET";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m88333b(int i) {
        if (i == 0) {
            return 8;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 6) {
            return 4;
        }
        if (i != 21) {
            return i != 24 ? 0 : 5;
        }
        return 7;
    }
}
