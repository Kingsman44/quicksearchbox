package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.bw */
/* compiled from: PG */
public enum C124657bw implements C62957cd {
    UNKNOWN_USER_OTA_STATE(0),
    OTA_UP_TO_DATE(1),
    PREPARING_OTA(4),
    WAITING_TO_APPLY_OTA(2),
    APPLYING_OTA(3);
    

    /* renamed from: f */
    private final int f343916f;

    private C124657bw(int i) {
        this.f343916f = i;
    }

    public final int getNumber() {
        return this.f343916f;
    }

    public final String toString() {
        return Integer.toString(this.f343916f);
    }
}
