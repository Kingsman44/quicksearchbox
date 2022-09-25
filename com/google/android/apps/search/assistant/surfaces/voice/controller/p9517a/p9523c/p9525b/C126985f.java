package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.f */
/* compiled from: PG */
public enum C126985f implements C62957cd {
    ERROR_UNKNOWN(0),
    ERROR_NETWORK(1),
    ERROR_RECOGNITION(2),
    ERROR_MIC(3),
    ERROR_TIMEOUT(4),
    ERROR_GENERIC(5),
    ERROR_ARBITRATION_LOST(6),
    ERROR_AUDIO_PERMISSION_DENIED(7),
    ERROR_AUDIO_FOCUS_LOST(8),
    ERROR_AUTH_RECOVERABLE(9),
    ERROR_JIT_CONSENT_DECLINED(10);
    

    /* renamed from: l */
    public final int f349668l;

    private C126985f(int i) {
        this.f349668l = i;
    }

    /* renamed from: a */
    public static C126985f m207727a(int i) {
        switch (i) {
            case 0:
                return ERROR_UNKNOWN;
            case 1:
                return ERROR_NETWORK;
            case 2:
                return ERROR_RECOGNITION;
            case 3:
                return ERROR_MIC;
            case 4:
                return ERROR_TIMEOUT;
            case 5:
                return ERROR_GENERIC;
            case 6:
                return ERROR_ARBITRATION_LOST;
            case 7:
                return ERROR_AUDIO_PERMISSION_DENIED;
            case 8:
                return ERROR_AUDIO_FOCUS_LOST;
            case 9:
                return ERROR_AUTH_RECOVERABLE;
            case 10:
                return ERROR_JIT_CONSENT_DECLINED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m207728b() {
        return C126984e.f349655a;
    }

    public final int getNumber() {
        return this.f349668l;
    }

    public final String toString() {
        return Integer.toString(this.f349668l);
    }
}
