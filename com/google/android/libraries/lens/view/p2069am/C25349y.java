package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.lens.view.am.y */
/* compiled from: PG */
public enum C25349y implements C62957cd {
    UNKNOWN(0),
    NONE(13),
    THINKING_GLEAM(1),
    PRE_GLEAM(2),
    GLEAM(3),
    TEXT_GLEAM(4),
    DOCUMENT_GLEAM(5),
    BARCODE_GLEAM(6),
    PLANAR_GLEAM(7),
    OUTDOOR_GLEAM(9),
    OBJECT_REGION_GLEAM(11),
    MATH_GLEAM(12),
    UNRECOGNIZED(-1);
    

    /* renamed from: n */
    private final int f69022n;

    private C25349y(int i) {
        this.f69022n = i;
    }

    /* renamed from: a */
    public static C25349y m46667a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return THINKING_GLEAM;
            case 2:
                return PRE_GLEAM;
            case 3:
                return GLEAM;
            case 4:
                return TEXT_GLEAM;
            case 5:
                return DOCUMENT_GLEAM;
            case 6:
                return BARCODE_GLEAM;
            case 7:
                return PLANAR_GLEAM;
            case 9:
                return OUTDOOR_GLEAM;
            case 11:
                return OBJECT_REGION_GLEAM;
            case 12:
                return MATH_GLEAM;
            case 13:
                return NONE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f69022n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
