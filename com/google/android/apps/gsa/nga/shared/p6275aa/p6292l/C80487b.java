package com.google.android.apps.gsa.nga.shared.p6275aa.p6292l;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.l.b */
/* compiled from: PG */
public enum C80487b implements C62957cd {
    SOURCE_UNKNOWN(0),
    MDD_LIB(1),
    SYSTEM_IMAGE(2),
    LOCAL(3),
    RETAIL_MODE(4),
    APA_DATA_DOWNLOAD(5);
    

    /* renamed from: g */
    public final int f220955g;

    private C80487b(int i) {
        this.f220955g = i;
    }

    /* renamed from: a */
    public static C80487b m128180a(int i) {
        if (i == 0) {
            return SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return MDD_LIB;
        }
        if (i == 2) {
            return SYSTEM_IMAGE;
        }
        if (i == 3) {
            return LOCAL;
        }
        if (i == 4) {
            return RETAIL_MODE;
        }
        if (i != 5) {
            return null;
        }
        return APA_DATA_DOWNLOAD;
    }

    /* renamed from: b */
    public static C62959cf m128181b() {
        return C80486a.f220947a;
    }

    public final int getNumber() {
        return this.f220955g;
    }

    public final String toString() {
        return Integer.toString(this.f220955g);
    }
}
