package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.i */
/* compiled from: PG */
public final class C80575i {
    /* renamed from: a */
    public static int m128207a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m128208b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 3 ? 0 : 5;
        }
        return 3;
    }
}
