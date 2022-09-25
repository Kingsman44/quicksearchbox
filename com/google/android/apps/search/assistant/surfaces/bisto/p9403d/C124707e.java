package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.e */
/* compiled from: PG */
public enum C124707e implements C62957cd {
    UNKNOWN_MODE(0),
    INPUT_OUTPUT_MODE(1),
    INPUT_ONLY_MODE(2);
    

    /* renamed from: d */
    public final int f344048d;

    private C124707e(int i) {
        this.f344048d = i;
    }

    /* renamed from: a */
    public static C124707e m204372a(int i) {
        if (i == 0) {
            return UNKNOWN_MODE;
        }
        if (i == 1) {
            return INPUT_OUTPUT_MODE;
        }
        if (i != 2) {
            return null;
        }
        return INPUT_ONLY_MODE;
    }

    /* renamed from: b */
    public static C62959cf m204373b() {
        return C124688d.f343991a;
    }

    public final int getNumber() {
        return this.f344048d;
    }

    public final String toString() {
        return Integer.toString(this.f344048d);
    }
}
