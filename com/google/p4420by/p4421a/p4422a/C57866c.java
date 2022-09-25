package com.google.p4420by.p4421a.p4422a;

import com.google.protobuf.C62959cf;

/* renamed from: com.google.by.a.a.c */
/* compiled from: PG */
public final class C57866c implements C62959cf {

    /* renamed from: a */
    public static final C62959cf f154586a = new C57866c();

    private C57866c() {
    }

    public final boolean isInRange(int i) {
        if (i == 100) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            default:
                switch (i) {
                    case 200:
                    case 201:
                    case 202:
                    case 203:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
