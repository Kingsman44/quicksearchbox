package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.adh */
/* compiled from: PG */
public enum adh implements C62957cd {
    NONE(0),
    TRANSLATE(1),
    DINING(2),
    TEXT(3),
    SHOPPING(4),
    OUTDOOR(5),
    EDUCATION(6);
    

    /* renamed from: h */
    public final int f158369h;

    private adh(int i) {
        this.f158369h = i;
    }

    /* renamed from: a */
    public static adh m92371a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return TRANSLATE;
            case 2:
                return DINING;
            case 3:
                return TEXT;
            case 4:
                return SHOPPING;
            case 5:
                return OUTDOOR;
            case 6:
                return EDUCATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92372b() {
        return adg.f158360a;
    }

    public final int getNumber() {
        return this.f158369h;
    }

    public final String toString() {
        return Integer.toString(this.f158369h);
    }
}
