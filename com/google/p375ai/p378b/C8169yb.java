package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.yb */
/* compiled from: PG */
public enum C8169yb implements C62957cd {
    DRIVE(0),
    TRANSIT(1),
    WALKING(2),
    BIKING(3);
    

    /* renamed from: e */
    public final int f28708e;

    private C8169yb(int i) {
        this.f28708e = i;
    }

    /* renamed from: a */
    public static C8169yb m22959a(int i) {
        if (i == 0) {
            return DRIVE;
        }
        if (i == 1) {
            return TRANSIT;
        }
        if (i == 2) {
            return WALKING;
        }
        if (i != 3) {
            return null;
        }
        return BIKING;
    }

    /* renamed from: b */
    public static C62959cf m22960b() {
        return C8168ya.f28702a;
    }

    public final int getNumber() {
        return this.f28708e;
    }

    public final String toString() {
        return Integer.toString(this.f28708e);
    }
}
