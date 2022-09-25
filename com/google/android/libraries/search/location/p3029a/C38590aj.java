package com.google.android.libraries.search.location.p3029a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.location.a.aj */
/* compiled from: PG */
public enum C38590aj implements C62957cd {
    CONSENT_REASON_UNKNOWN(0),
    CONSENT_REASON_ACCEPTED(1),
    CONSENT_REASON_DECLINED(2),
    CONSENT_REASON_DISMISSED(3),
    CONSENT_REASON_TEMPORARILY_ALLOWED(4),
    CONSENT_REASON_ASK_NEXT_TIME(5);
    

    /* renamed from: g */
    public final int f102015g;

    private C38590aj(int i) {
        this.f102015g = i;
    }

    /* renamed from: a */
    public static C38590aj m67896a(int i) {
        if (i == 0) {
            return CONSENT_REASON_UNKNOWN;
        }
        if (i == 1) {
            return CONSENT_REASON_ACCEPTED;
        }
        if (i == 2) {
            return CONSENT_REASON_DECLINED;
        }
        if (i == 3) {
            return CONSENT_REASON_DISMISSED;
        }
        if (i == 4) {
            return CONSENT_REASON_TEMPORARILY_ALLOWED;
        }
        if (i != 5) {
            return null;
        }
        return CONSENT_REASON_ASK_NEXT_TIME;
    }

    /* renamed from: b */
    public static C62959cf m67897b() {
        return C38589ai.f102007a;
    }

    public final int getNumber() {
        return this.f102015g;
    }

    public final String toString() {
        return Integer.toString(this.f102015g);
    }
}
