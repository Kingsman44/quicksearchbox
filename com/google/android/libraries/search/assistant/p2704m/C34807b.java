package com.google.android.libraries.search.assistant.p2704m;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.assistant.m.b */
/* compiled from: PG */
public enum C34807b implements C62957cd {
    NOT_ELIGIBLE(0),
    ELIGIBLE_PREBUILT(1),
    ELIGIBLE_FOR_UPGRADE(2),
    ELIGIBLE_UPGRADING(3),
    ELIGIBLE_UPGRADED(4),
    ELIGIBLE_UPGRADED_BYPASS(5);
    

    /* renamed from: g */
    public final int f92345g;

    private C34807b(int i) {
        this.f92345g = i;
    }

    /* renamed from: a */
    public static C34807b m63566a(int i) {
        if (i == 0) {
            return NOT_ELIGIBLE;
        }
        if (i == 1) {
            return ELIGIBLE_PREBUILT;
        }
        if (i == 2) {
            return ELIGIBLE_FOR_UPGRADE;
        }
        if (i == 3) {
            return ELIGIBLE_UPGRADING;
        }
        if (i == 4) {
            return ELIGIBLE_UPGRADED;
        }
        if (i != 5) {
            return null;
        }
        return ELIGIBLE_UPGRADED_BYPASS;
    }

    /* renamed from: b */
    public static C62959cf m63567b() {
        return C34806a.f92337a;
    }

    public final int getNumber() {
        return this.f92345g;
    }

    public final String toString() {
        return Integer.toString(this.f92345g);
    }
}
