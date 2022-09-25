package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.s */
/* compiled from: PG */
public enum C126998s implements C62957cd {
    TIMEOUT_UNKNOWN_REASON(0),
    TIMEOUT_FULL_LISTENING(1),
    TIMEOUT_DURING_SPEECH(2),
    TIMEOUT_FINAL_PROCESSING(3),
    TIMEOUT_MIC_NOT_OPENED(4);
    

    /* renamed from: f */
    public final int f349716f;

    private C126998s(int i) {
        this.f349716f = i;
    }

    /* renamed from: a */
    public static C126998s m207732a(int i) {
        if (i == 0) {
            return TIMEOUT_UNKNOWN_REASON;
        }
        if (i == 1) {
            return TIMEOUT_FULL_LISTENING;
        }
        if (i == 2) {
            return TIMEOUT_DURING_SPEECH;
        }
        if (i == 3) {
            return TIMEOUT_FINAL_PROCESSING;
        }
        if (i != 4) {
            return null;
        }
        return TIMEOUT_MIC_NOT_OPENED;
    }

    /* renamed from: b */
    public static C62959cf m207733b() {
        return C126997r.f349709a;
    }

    public final int getNumber() {
        return this.f349716f;
    }

    public final String toString() {
        return Integer.toString(this.f349716f);
    }
}
