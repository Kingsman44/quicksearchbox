package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.k */
/* compiled from: PG */
public enum C124713k implements C62957cd {
    CHARGER_UNKNOWN(0),
    CHARGER_TRICKLE_CHARGE(1),
    CHARGER_FAST_CHARGE(2),
    CHARGER_DISABLED_ERROR(3),
    CHARGER_STANDBY(4),
    CHARGER_NO_POWER(5);
    

    /* renamed from: g */
    public final int f344071g;

    private C124713k(int i) {
        this.f344071g = i;
    }

    /* renamed from: a */
    public static C124713k m204376a(int i) {
        if (i == 0) {
            return CHARGER_UNKNOWN;
        }
        if (i == 1) {
            return CHARGER_TRICKLE_CHARGE;
        }
        if (i == 2) {
            return CHARGER_FAST_CHARGE;
        }
        if (i == 3) {
            return CHARGER_DISABLED_ERROR;
        }
        if (i == 4) {
            return CHARGER_STANDBY;
        }
        if (i != 5) {
            return null;
        }
        return CHARGER_NO_POWER;
    }

    /* renamed from: b */
    public static C62959cf m204377b() {
        return C124712j.f344063a;
    }

    public final int getNumber() {
        return this.f344071g;
    }

    public final String toString() {
        return Integer.toString(this.f344071g);
    }
}
