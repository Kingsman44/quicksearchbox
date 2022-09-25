package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.su */
/* compiled from: PG */
public enum C60516su implements C62957cd {
    UNKNOWN_MODIFIER(0),
    ONBOARDING(1),
    WITH_DATA_SAVER(2),
    ALWAYS_RUN_DSP(3),
    ALWAYS_RUN_SOFTWARE(4);
    

    /* renamed from: f */
    public final int f163823f;

    private C60516su(int i) {
        this.f163823f = i;
    }

    /* renamed from: a */
    public static C60516su m92601a(int i) {
        if (i == 0) {
            return UNKNOWN_MODIFIER;
        }
        if (i == 1) {
            return ONBOARDING;
        }
        if (i == 2) {
            return WITH_DATA_SAVER;
        }
        if (i == 3) {
            return ALWAYS_RUN_DSP;
        }
        if (i != 4) {
            return null;
        }
        return ALWAYS_RUN_SOFTWARE;
    }

    /* renamed from: b */
    public static C62959cf m92602b() {
        return C60515st.f163816a;
    }

    public final int getNumber() {
        return this.f163823f;
    }

    public final String toString() {
        return Integer.toString(this.f163823f);
    }
}
