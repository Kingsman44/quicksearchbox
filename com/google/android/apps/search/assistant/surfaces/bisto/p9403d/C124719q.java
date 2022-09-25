package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.q */
/* compiled from: PG */
public enum C124719q implements C62957cd {
    UNKNOWN_DEVICE_CATEGORY(0),
    HEADPHONES(1),
    CAR_ACCESSORY(2),
    GACS_DEVICE(3);
    

    /* renamed from: e */
    public final int f344102e;

    private C124719q(int i) {
        this.f344102e = i;
    }

    /* renamed from: a */
    public static C124719q m204380a(int i) {
        if (i == 0) {
            return UNKNOWN_DEVICE_CATEGORY;
        }
        if (i == 1) {
            return HEADPHONES;
        }
        if (i == 2) {
            return CAR_ACCESSORY;
        }
        if (i != 3) {
            return null;
        }
        return GACS_DEVICE;
    }

    /* renamed from: b */
    public static C62959cf m204381b() {
        return C124718p.f344096a;
    }

    public final int getNumber() {
        return this.f344102e;
    }

    public final String toString() {
        return Integer.toString(this.f344102e);
    }
}
