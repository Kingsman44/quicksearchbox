package com.google.knowledge.p4671b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.knowledge.b.q */
/* compiled from: PG */
public enum C61824q implements C62957cd {
    OPA_EXPERIENCE_TYPE_UNKNOWN(0),
    OPA_EXPERIENCE_INELIGIBLE(2),
    OPA_EXPERIENCE_NOT_STARTED(3),
    OPA_EXPERIENCE_TRY_BEFORE_YOU_BUY(1),
    OPA_EXPERIENCE_COMPLETED_ONBOARDING(4);
    

    /* renamed from: f */
    public final int f167073f;

    private C61824q(int i) {
        this.f167073f = i;
    }

    /* renamed from: a */
    public static C61824q m94479a(int i) {
        if (i == 0) {
            return OPA_EXPERIENCE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return OPA_EXPERIENCE_TRY_BEFORE_YOU_BUY;
        }
        if (i == 2) {
            return OPA_EXPERIENCE_INELIGIBLE;
        }
        if (i == 3) {
            return OPA_EXPERIENCE_NOT_STARTED;
        }
        if (i != 4) {
            return null;
        }
        return OPA_EXPERIENCE_COMPLETED_ONBOARDING;
    }

    /* renamed from: b */
    public static C62959cf m94480b() {
        return C61823p.f167066a;
    }

    public final int getNumber() {
        return this.f167073f;
    }

    public final String toString() {
        return Integer.toString(this.f167073f);
    }
}
