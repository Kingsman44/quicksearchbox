package com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6290a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.k.a.b */
/* compiled from: PG */
public enum C80474b implements C62957cd {
    UNKNOWN(0),
    LINEAR_ACCELERATION(1),
    ROTATION_VECTOR(2),
    GYROSCOPE(3),
    PROXIMITY(4),
    SIGNIFICANT_MOTION(5),
    MAGNETIC_FIELD(6),
    PRESSURE(7),
    PICK_UP(8),
    GAME_ROTATION_VECTOR(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private final int f220878l;

    private C80474b(int i) {
        this.f220878l = i;
    }

    /* renamed from: a */
    public static C80474b m128172a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return LINEAR_ACCELERATION;
            case 2:
                return ROTATION_VECTOR;
            case 3:
                return GYROSCOPE;
            case 4:
                return PROXIMITY;
            case 5:
                return SIGNIFICANT_MOTION;
            case 6:
                return MAGNETIC_FIELD;
            case 7:
                return PRESSURE;
            case 8:
                return PICK_UP;
            case 9:
                return GAME_ROTATION_VECTOR;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220878l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
