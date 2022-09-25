package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.g */
/* compiled from: PG */
public enum C66964g implements C62957cd {
    UNKNOWN(0),
    DEFAULT_ONESHOT(1),
    DEFAULT_CONTINUOUS(2),
    AMBIENT_ONESHOT(3),
    AMBIENT_CONTINUOUS(4),
    AMBIENT_TELEPHONY(7),
    FARFIELD_ONESHOT(5),
    FARFIELD_CONTINUOUS(6),
    NATCON_ONESHOT(9);
    

    /* renamed from: j */
    public static final C62958ce f182024j = null;

    /* renamed from: k */
    public final int f182026k;

    static {
        f182024j = new C66910e();
    }

    private C66964g(int i) {
        this.f182026k = i;
    }

    /* renamed from: a */
    public static C66964g m97396a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DEFAULT_ONESHOT;
            case 2:
                return DEFAULT_CONTINUOUS;
            case 3:
                return AMBIENT_ONESHOT;
            case 4:
                return AMBIENT_CONTINUOUS;
            case 5:
                return FARFIELD_ONESHOT;
            case 6:
                return FARFIELD_CONTINUOUS;
            case 7:
                return AMBIENT_TELEPHONY;
            case 9:
                return NATCON_ONESHOT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97397b() {
        return C66937f.f181942a;
    }

    public final int getNumber() {
        return this.f182026k;
    }

    public final String toString() {
        return Integer.toString(this.f182026k);
    }
}
