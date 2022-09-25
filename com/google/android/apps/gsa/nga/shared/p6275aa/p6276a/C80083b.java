package com.google.android.apps.gsa.nga.shared.p6275aa.p6276a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.a.b */
/* compiled from: PG */
public enum C80083b implements C62957cd {
    UNKNOWN(0),
    CONVERT_TO_CLOUD(1),
    SKIP_NOT_HOTWORD(2),
    SKIP_ALREADY_CLOUD(3),
    SKIP_ON_DEVICE_REQUIRED(4),
    SKIP_NO_NETWOK(6),
    SKIP_ONLY_WHITELISTED_DEVICES(7),
    SKIP_NO_OTHER_DEVICES_TRIGGERED(8);
    

    /* renamed from: i */
    public final int f219762i;

    private C80083b(int i) {
        this.f219762i = i;
    }

    /* renamed from: a */
    public static C80083b m128079a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONVERT_TO_CLOUD;
            case 2:
                return SKIP_NOT_HOTWORD;
            case 3:
                return SKIP_ALREADY_CLOUD;
            case 4:
                return SKIP_ON_DEVICE_REQUIRED;
            case 6:
                return SKIP_NO_NETWOK;
            case 7:
                return SKIP_ONLY_WHITELISTED_DEVICES;
            case 8:
                return SKIP_NO_OTHER_DEVICES_TRIGGERED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128080b() {
        return C80082a.f219752a;
    }

    public final int getNumber() {
        return this.f219762i;
    }

    public final String toString() {
        return Integer.toString(this.f219762i);
    }
}
