package com.google.lens.p4709l.p4710a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.lens.l.a.b */
/* compiled from: PG */
public enum C62614b implements C62957cd {
    LOTS_FEATURE_UNDEFINED(0),
    LOTS_FEATURE_HYBRID_TRANSLATE(1),
    LOTS_FEATURE_OFFLINE_TRANSLATE(2),
    LOTS_FEATURE_TEXT(3),
    LOTS_FEATURE_HYBRID_GANSLATE(4);
    

    /* renamed from: f */
    public final int f169058f;

    private C62614b(int i) {
        this.f169058f = i;
    }

    /* renamed from: a */
    public static C62614b m94806a(int i) {
        if (i == 0) {
            return LOTS_FEATURE_UNDEFINED;
        }
        if (i == 1) {
            return LOTS_FEATURE_HYBRID_TRANSLATE;
        }
        if (i == 2) {
            return LOTS_FEATURE_OFFLINE_TRANSLATE;
        }
        if (i == 3) {
            return LOTS_FEATURE_TEXT;
        }
        if (i != 4) {
            return null;
        }
        return LOTS_FEATURE_HYBRID_GANSLATE;
    }

    /* renamed from: b */
    public static C62959cf m94807b() {
        return C62613a.f169051a;
    }

    public final int getNumber() {
        return this.f169058f;
    }

    public final String toString() {
        return Integer.toString(this.f169058f);
    }
}
