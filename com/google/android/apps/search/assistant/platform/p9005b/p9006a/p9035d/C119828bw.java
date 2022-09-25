package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bw */
/* compiled from: PG */
public enum C119828bw implements C62957cd {
    UNKNOWN_ENGINE(0),
    DEFAULT_ENGINE(1),
    FAKE(2),
    ONLINE(3),
    ON_DEVICE(4),
    HYBRID_FLUID_ACTIONS_AND_ONLINE(5),
    HYBRID_FLUID_ACTIONS_ON_DEVICE_AND_ONLINE(8),
    HYBRID(6),
    HYBRID_DIRECT_EXECUTION_AND_ONLINE(7),
    HYBRID_DIRECT_EXECUTION_AND_FLUID_ACTIONS(9);
    

    /* renamed from: k */
    public final int f333755k;

    private C119828bw(int i) {
        this.f333755k = i;
    }

    /* renamed from: a */
    public static C119828bw m198729a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENGINE;
            case 1:
                return DEFAULT_ENGINE;
            case 2:
                return FAKE;
            case 3:
                return ONLINE;
            case 4:
                return ON_DEVICE;
            case 5:
                return HYBRID_FLUID_ACTIONS_AND_ONLINE;
            case 6:
                return HYBRID;
            case 7:
                return HYBRID_DIRECT_EXECUTION_AND_ONLINE;
            case 8:
                return HYBRID_FLUID_ACTIONS_ON_DEVICE_AND_ONLINE;
            case 9:
                return HYBRID_DIRECT_EXECUTION_AND_FLUID_ACTIONS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m198730b() {
        return C119827bv.f333743a;
    }

    public final int getNumber() {
        return this.f333755k;
    }

    public final String toString() {
        return Integer.toString(this.f333755k);
    }
}
