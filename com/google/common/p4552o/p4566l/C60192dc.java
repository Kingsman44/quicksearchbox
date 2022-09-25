package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.l.dc */
/* compiled from: PG */
public enum C60192dc implements C62957cd {
    SYNC_TRIGGER_UNKNOWN(0),
    SYNC_TRIGGER_MANUAL(1),
    SYNC_TRIGGER_TIMER(2),
    SYNC_TRIGGER_SUBSCRIPTION(3),
    SYNC_TRIGGER_PUSH_NOTIFICATION(4),
    SYNC_TRIGGER_READ(5),
    SYNC_TRIGGER_WRITE(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f162842i;

    private C60192dc(int i) {
        this.f162842i = i;
    }

    /* renamed from: a */
    public static C60192dc m92537a(int i) {
        switch (i) {
            case 0:
                return SYNC_TRIGGER_UNKNOWN;
            case 1:
                return SYNC_TRIGGER_MANUAL;
            case 2:
                return SYNC_TRIGGER_TIMER;
            case 3:
                return SYNC_TRIGGER_SUBSCRIPTION;
            case 4:
                return SYNC_TRIGGER_PUSH_NOTIFICATION;
            case 5:
                return SYNC_TRIGGER_READ;
            case 6:
                return SYNC_TRIGGER_WRITE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92538b() {
        return C60191db.f162832a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f162842i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
