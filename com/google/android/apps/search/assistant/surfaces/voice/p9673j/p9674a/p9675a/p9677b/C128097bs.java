package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bs */
/* compiled from: PG */
public enum C128097bs implements C62957cd {
    RESPONSE_PLATE_STATE_UNKNOWN(0),
    RESPONSE_PLATE_STATE_WAITING(1),
    RESPONSE_PLATE_STATE_RECEIVED(2),
    RESPONSE_PLATE_STATE_UI_UPDATED(3),
    RESPONSE_PLATE_STATE_COMPLETED(4);
    

    /* renamed from: f */
    public final int f352456f;

    private C128097bs(int i) {
        this.f352456f = i;
    }

    /* renamed from: a */
    public static C128097bs m209214a(int i) {
        if (i == 0) {
            return RESPONSE_PLATE_STATE_UNKNOWN;
        }
        if (i == 1) {
            return RESPONSE_PLATE_STATE_WAITING;
        }
        if (i == 2) {
            return RESPONSE_PLATE_STATE_RECEIVED;
        }
        if (i == 3) {
            return RESPONSE_PLATE_STATE_UI_UPDATED;
        }
        if (i != 4) {
            return null;
        }
        return RESPONSE_PLATE_STATE_COMPLETED;
    }

    /* renamed from: b */
    public static C62959cf m209215b() {
        return C128096br.f352449a;
    }

    public final int getNumber() {
        return this.f352456f;
    }

    public final String toString() {
        return Integer.toString(this.f352456f);
    }
}
