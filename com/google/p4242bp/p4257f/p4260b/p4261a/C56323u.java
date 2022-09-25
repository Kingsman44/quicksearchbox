package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.f.b.a.u */
/* compiled from: PG */
public enum C56323u implements C62957cd {
    DEFAULT(0),
    GLEAM(1),
    NONE(2),
    TEXT_GLEAM(3),
    DOCUMENT_GLEAM(4),
    PLANAR_GLEAM(5),
    BARCODE_GLEAM(6),
    OUTDOOR_GLEAM(8),
    REGION_GLEAM(10),
    MATH_GLEAM(11),
    BOOK_GLEAM(12);
    

    /* renamed from: l */
    public final int f150121l;

    private C56323u(int i) {
        this.f150121l = i;
    }

    /* renamed from: a */
    public static C56323u m87968a(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return GLEAM;
            case 2:
                return NONE;
            case 3:
                return TEXT_GLEAM;
            case 4:
                return DOCUMENT_GLEAM;
            case 5:
                return PLANAR_GLEAM;
            case 6:
                return BARCODE_GLEAM;
            case 8:
                return OUTDOOR_GLEAM;
            case 10:
                return REGION_GLEAM;
            case 11:
                return MATH_GLEAM;
            case 12:
                return BOOK_GLEAM;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87969b() {
        return C56322t.f150108a;
    }

    public final int getNumber() {
        return this.f150121l;
    }

    public final String toString() {
        return Integer.toString(this.f150121l);
    }
}
