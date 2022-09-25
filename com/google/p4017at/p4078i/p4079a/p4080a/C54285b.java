package com.google.p4017at.p4078i.p4079a.p4080a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.at.i.a.a.b */
/* compiled from: PG */
public enum C54285b implements C62957cd {
    UNKNOWN_PROFILE_STATE(0),
    ADMIN_BLOCKED(1),
    DELETED(2),
    DASHER_ADMIN_DISABLED(4),
    USER_TO_USER_BLOCKED(5),
    CORE_ID(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    public static final C62958ce f142557h = null;

    /* renamed from: i */
    private final int f142559i;

    static {
        f142557h = new C54277a();
    }

    private C54285b(int i) {
        this.f142559i = i;
    }

    /* renamed from: a */
    public static C54285b m87246a(int i) {
        if (i == 0) {
            return UNKNOWN_PROFILE_STATE;
        }
        if (i == 1) {
            return ADMIN_BLOCKED;
        }
        if (i == 2) {
            return DELETED;
        }
        if (i == 3) {
            return CORE_ID;
        }
        if (i == 4) {
            return DASHER_ADMIN_DISABLED;
        }
        if (i != 5) {
            return null;
        }
        return USER_TO_USER_BLOCKED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f142559i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
