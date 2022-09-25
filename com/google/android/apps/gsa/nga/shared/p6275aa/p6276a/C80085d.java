package com.google.android.apps.gsa.nga.shared.p6275aa.p6276a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.a.d */
/* compiled from: PG */
public enum C80085d implements C62957cd {
    TIMING_UNSPECIFIED(0),
    ON_TIME_NO_IMPACT_NO_OTHER_DEVICES(1),
    ON_TIME_NO_IMPACT_DECISION_ALREADY_KNOWN(2),
    ON_TIME_WITH_IMPACT(3),
    LATE_NO_IMPACT_NO_OTHER_DEVICES(4),
    LATE_NO_IMPACT_DECISION_ALREADY_KNOWN(5),
    LATE_NO_IMPACT_ALREADY_CLOUD(6),
    LATE_NO_IMPACT_ON_DEVICE_REQUIRED(7),
    LATE_WITH_IMPACT(8),
    LATE_NO_IMPACT_DEVICE_ID_ALREADY_PROCESSED(9),
    ON_TIME_NO_IMPACT_DEVICE_ID_ALREADY_PROCESSED(10);
    

    /* renamed from: l */
    public final int f219776l;

    private C80085d(int i) {
        this.f219776l = i;
    }

    /* renamed from: a */
    public static C80085d m128081a(int i) {
        switch (i) {
            case 0:
                return TIMING_UNSPECIFIED;
            case 1:
                return ON_TIME_NO_IMPACT_NO_OTHER_DEVICES;
            case 2:
                return ON_TIME_NO_IMPACT_DECISION_ALREADY_KNOWN;
            case 3:
                return ON_TIME_WITH_IMPACT;
            case 4:
                return LATE_NO_IMPACT_NO_OTHER_DEVICES;
            case 5:
                return LATE_NO_IMPACT_DECISION_ALREADY_KNOWN;
            case 6:
                return LATE_NO_IMPACT_ALREADY_CLOUD;
            case 7:
                return LATE_NO_IMPACT_ON_DEVICE_REQUIRED;
            case 8:
                return LATE_WITH_IMPACT;
            case 9:
                return LATE_NO_IMPACT_DEVICE_ID_ALREADY_PROCESSED;
            case 10:
                return ON_TIME_NO_IMPACT_DEVICE_ID_ALREADY_PROCESSED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128082b() {
        return C80084c.f219763a;
    }

    public final int getNumber() {
        return this.f219776l;
    }

    public final String toString() {
        return Integer.toString(this.f219776l);
    }
}
