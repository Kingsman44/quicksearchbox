package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.lens.view.am.w */
/* compiled from: PG */
public enum C25347w implements C62957cd {
    PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_UNSPECIFIED(0),
    PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V4_LEGACY(5),
    PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V6(6),
    PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V9(9),
    PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V11(11),
    PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V12(12),
    PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_MULTISCRIPT_V1(4),
    PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_MULTISCRIPT_V2(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f69007j;

    private C25347w(int i) {
        this.f69007j = i;
    }

    /* renamed from: a */
    public static C25347w m46666a(int i) {
        if (i == 0) {
            return PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_UNSPECIFIED;
        }
        if (i == 9) {
            return PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V9;
        }
        if (i == 4) {
            return PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_MULTISCRIPT_V1;
        }
        if (i == 5) {
            return PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V4_LEGACY;
        }
        if (i == 6) {
            return PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V6;
        }
        if (i == 7) {
            return PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_MULTISCRIPT_V2;
        }
        if (i == 11) {
            return PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V11;
        }
        if (i != 12) {
            return null;
        }
        return PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V12;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f69007j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
