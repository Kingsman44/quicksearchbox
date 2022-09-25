package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.f.b.a.df */
/* compiled from: PG */
public enum C56306df implements C62957cd {
    UNKNOWN_FILTER_TYPE(0),
    AUTO_FILTER(7),
    DEPRECATED_DOCUMENT_SCANNER(1),
    TRANSLATE(2),
    SHOPPING(3),
    DINING(4),
    TEXT(5),
    OUTDOOR(6),
    LANGUAGE_LEARNING(8),
    LOOKOUT(9),
    EDUCATION(10),
    BOOKS(11);
    

    /* renamed from: m */
    public final int f150068m;

    private C56306df(int i) {
        this.f150068m = i;
    }

    /* renamed from: a */
    public static C56306df m87964a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FILTER_TYPE;
            case 1:
                return DEPRECATED_DOCUMENT_SCANNER;
            case 2:
                return TRANSLATE;
            case 3:
                return SHOPPING;
            case 4:
                return DINING;
            case 5:
                return TEXT;
            case 6:
                return OUTDOOR;
            case 7:
                return AUTO_FILTER;
            case 8:
                return LANGUAGE_LEARNING;
            case 9:
                return LOOKOUT;
            case 10:
                return EDUCATION;
            case 11:
                return BOOKS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87965b() {
        return C56305de.f150054a;
    }

    public final int getNumber() {
        return this.f150068m;
    }

    public final String toString() {
        return Integer.toString(this.f150068m);
    }
}
