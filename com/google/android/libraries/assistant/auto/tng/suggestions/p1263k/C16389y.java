package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.y */
/* compiled from: PG */
public enum C16389y implements C62957cd {
    DRIVE_STATUS_UNKNOWN(0),
    VEHICLE_INIT(1),
    PRE_DRIVE(2),
    DURING_DRIVE(3),
    POST_DRIVE(4);
    

    /* renamed from: f */
    public final int f48241f;

    private C16389y(int i) {
        this.f48241f = i;
    }

    /* renamed from: a */
    public static C16389y m33345a(int i) {
        if (i == 0) {
            return DRIVE_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return VEHICLE_INIT;
        }
        if (i == 2) {
            return PRE_DRIVE;
        }
        if (i == 3) {
            return DURING_DRIVE;
        }
        if (i != 4) {
            return null;
        }
        return POST_DRIVE;
    }

    /* renamed from: b */
    public static C62959cf m33346b() {
        return C16388x.f48234a;
    }

    public final int getNumber() {
        return this.f48241f;
    }

    public final String toString() {
        return Integer.toString(this.f48241f);
    }
}
