package com.google.android.apps.gsa.nga.shared.p6275aa.p6288j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.j.b */
/* compiled from: PG */
public enum C80471b implements C62957cd {
    SODA(0),
    S3(1),
    ROHAN_SODA(3);
    

    /* renamed from: d */
    public final int f220865d;

    private C80471b(int i) {
        this.f220865d = i;
    }

    /* renamed from: a */
    public static C80471b m128170a(int i) {
        if (i == 0) {
            return SODA;
        }
        if (i == 1) {
            return S3;
        }
        if (i != 3) {
            return null;
        }
        return ROHAN_SODA;
    }

    /* renamed from: b */
    public static C62959cf m128171b() {
        return C80470a.f220860a;
    }

    public final int getNumber() {
        return this.f220865d;
    }

    public final String toString() {
        return Integer.toString(this.f220865d);
    }
}
