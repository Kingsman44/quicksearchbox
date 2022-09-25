package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.pt */
/* compiled from: PG */
public enum C60425pt implements C62957cd {
    BOTTOM_SHEET_UNDEFINED(0),
    BOTTOM_SHEET_PEEK(1),
    BOTTOM_SHEET_PEEK_AUTO(2),
    BOTTOM_SHEET_PEEK_DISMISSED(3),
    BOTTOM_SHEET_PEEK_OPEN(4),
    BOTTOM_SHEET_MANUAL_OPEN(5);
    

    /* renamed from: g */
    public final int f163529g;

    private C60425pt(int i) {
        this.f163529g = i;
    }

    /* renamed from: a */
    public static C60425pt m92580a(int i) {
        if (i == 0) {
            return BOTTOM_SHEET_UNDEFINED;
        }
        if (i == 1) {
            return BOTTOM_SHEET_PEEK;
        }
        if (i == 2) {
            return BOTTOM_SHEET_PEEK_AUTO;
        }
        if (i == 3) {
            return BOTTOM_SHEET_PEEK_DISMISSED;
        }
        if (i == 4) {
            return BOTTOM_SHEET_PEEK_OPEN;
        }
        if (i != 5) {
            return null;
        }
        return BOTTOM_SHEET_MANUAL_OPEN;
    }

    /* renamed from: b */
    public static C62959cf m92581b() {
        return C60424ps.f163521a;
    }

    public final int getNumber() {
        return this.f163529g;
    }

    public final String toString() {
        return Integer.toString(this.f163529g);
    }
}
