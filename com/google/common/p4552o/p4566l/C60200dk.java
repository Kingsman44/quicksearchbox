package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.l.dk */
/* compiled from: PG */
public enum C60200dk implements C62957cd {
    UNASSIGNED_DIRECTIONAL_MOVEMENT_ID(0),
    LEFT(1),
    RIGHT(2),
    UP(3),
    DOWN(4);
    

    /* renamed from: f */
    public final int f162873f;

    private C60200dk(int i) {
        this.f162873f = i;
    }

    /* renamed from: a */
    public static C60200dk m92542a(int i) {
        if (i == 0) {
            return UNASSIGNED_DIRECTIONAL_MOVEMENT_ID;
        }
        if (i == 1) {
            return LEFT;
        }
        if (i == 2) {
            return RIGHT;
        }
        if (i == 3) {
            return UP;
        }
        if (i != 4) {
            return null;
        }
        return DOWN;
    }

    /* renamed from: b */
    public static C62959cf m92543b() {
        return C60199dj.f162866a;
    }

    public final int getNumber() {
        return this.f162873f;
    }

    public final String toString() {
        return Integer.toString(this.f162873f);
    }
}
