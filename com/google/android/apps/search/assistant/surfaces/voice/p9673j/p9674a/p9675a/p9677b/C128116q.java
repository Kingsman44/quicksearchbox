package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.q */
/* compiled from: PG */
public enum C128116q implements C62957cd {
    ONBOARDING_TYPE_UNKNOWN(0),
    ONBOARDING_TYPE_OOBE(1);
    

    /* renamed from: c */
    public final int f352498c;

    private C128116q(int i) {
        this.f352498c = i;
    }

    /* renamed from: a */
    public static C128116q m209218a(int i) {
        if (i == 0) {
            return ONBOARDING_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return ONBOARDING_TYPE_OOBE;
    }

    /* renamed from: b */
    public static C62959cf m209219b() {
        return C128115p.f352494a;
    }

    public final int getNumber() {
        return this.f352498c;
    }

    public final String toString() {
        return Integer.toString(this.f352498c);
    }
}
