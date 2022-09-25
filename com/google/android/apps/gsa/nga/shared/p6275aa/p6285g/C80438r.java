package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.r */
/* compiled from: PG */
public enum C80438r implements C62957cd {
    UNKNOWN_MODE(0),
    NGA_REWRITE(1),
    NGA_PRESIGNALS(2),
    MARBLE_CLOUD_CLASSIFIER(3),
    IRIS_CAMERA_CLASSIFIER(4);
    

    /* renamed from: f */
    public final int f220782f;

    private C80438r(int i) {
        this.f220782f = i;
    }

    /* renamed from: a */
    public static C80438r m128161a(int i) {
        if (i == 0) {
            return UNKNOWN_MODE;
        }
        if (i == 1) {
            return NGA_REWRITE;
        }
        if (i == 2) {
            return NGA_PRESIGNALS;
        }
        if (i == 3) {
            return MARBLE_CLOUD_CLASSIFIER;
        }
        if (i != 4) {
            return null;
        }
        return IRIS_CAMERA_CLASSIFIER;
    }

    /* renamed from: b */
    public static C62959cf m128162b() {
        return C80437q.f220775a;
    }

    public final int getNumber() {
        return this.f220782f;
    }

    public final String toString() {
        return Integer.toString(this.f220782f);
    }
}
