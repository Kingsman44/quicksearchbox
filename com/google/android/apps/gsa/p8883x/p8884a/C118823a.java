package com.google.android.apps.gsa.p8883x.p8884a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.x.a.a */
/* compiled from: PG */
public enum C118823a implements C62957cd {
    UNKNOWN_EVENT(0),
    REQUEST_FINISHED(1),
    REQUEST_STARTED(2),
    RESPONSE_STARTED(3),
    STATUS_FALL_BACK_TO_OFFLINE(4),
    STRATEGY_DECISION_OFFLINE_ONLY(5),
    STRATEGY_DECISION_ONLINE_FALLBACK_TO_OFFLINE(6),
    SEARCH_FETCH_COMPLETE(7);
    

    /* renamed from: i */
    private final int f331414i;

    private C118823a(int i) {
        this.f331414i = i;
    }

    /* renamed from: a */
    public static C118823a m197209a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT;
            case 1:
                return REQUEST_FINISHED;
            case 2:
                return REQUEST_STARTED;
            case 3:
                return RESPONSE_STARTED;
            case 4:
                return STATUS_FALL_BACK_TO_OFFLINE;
            case 5:
                return STRATEGY_DECISION_OFFLINE_ONLY;
            case 6:
                return STRATEGY_DECISION_ONLINE_FALLBACK_TO_OFFLINE;
            case 7:
                return SEARCH_FETCH_COMPLETE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f331414i;
    }

    public final String toString() {
        return Integer.toString(this.f331414i);
    }
}
