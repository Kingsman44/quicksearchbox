package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.gi */
/* compiled from: PG */
public enum C142465gi implements C62957cd {
    DEVICE_TYPE_UNKNOWN(0),
    DEVICE_TYPE_MAIN_FIRMWARE(3),
    DEVICE_TYPE_HOTWORD_MODEL(4);
    

    /* renamed from: d */
    private final int f386606d;

    private C142465gi(int i) {
        this.f386606d = i;
    }

    /* renamed from: a */
    public static C142465gi m231087a(int i) {
        if (i == 0) {
            return DEVICE_TYPE_UNKNOWN;
        }
        if (i == 3) {
            return DEVICE_TYPE_MAIN_FIRMWARE;
        }
        if (i != 4) {
            return null;
        }
        return DEVICE_TYPE_HOTWORD_MODEL;
    }

    /* renamed from: b */
    public static C62959cf m231088b() {
        return C142464gh.f386601a;
    }

    public final int getNumber() {
        return this.f386606d;
    }

    public final String toString() {
        return Integer.toString(this.f386606d);
    }
}
