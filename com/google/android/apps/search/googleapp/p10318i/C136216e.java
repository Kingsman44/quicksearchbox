package com.google.android.apps.search.googleapp.p10318i;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.i.e */
/* compiled from: PG */
public enum C136216e implements C62957cd {
    GRANT_MIC_PERMISSION(8),
    UNKNOWN(0),
    RETRY(1),
    SELECT_WIFI_NETWORK(5),
    TURN_ON_MOBILE_DATA(2),
    TURN_OFF_AIRPLANE_MODE(3),
    TURN_ON_DATA_ROAMING(4),
    TURN_ON_WIFI(6),
    REFRESH(7),
    RETRY_VOICE_SEARCH(9);
    

    /* renamed from: k */
    public final int f370969k;

    private C136216e(int i) {
        this.f370969k = i;
    }

    /* renamed from: a */
    public static C136216e m221349a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return RETRY;
            case 2:
                return TURN_ON_MOBILE_DATA;
            case 3:
                return TURN_OFF_AIRPLANE_MODE;
            case 4:
                return TURN_ON_DATA_ROAMING;
            case 5:
                return SELECT_WIFI_NETWORK;
            case 6:
                return TURN_ON_WIFI;
            case 7:
                return REFRESH;
            case 8:
                return GRANT_MIC_PERMISSION;
            case 9:
                return RETRY_VOICE_SEARCH;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m221350b() {
        return C136215d.f370957a;
    }

    public final int getNumber() {
        return this.f370969k;
    }

    public final String toString() {
        return Integer.toString(this.f370969k);
    }
}
