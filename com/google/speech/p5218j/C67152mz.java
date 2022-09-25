package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.mz */
/* compiled from: PG */
public enum C67152mz implements C62957cd {
    NO_ERROR(0),
    UNKNOWN_FAILURE(1),
    DOUBLE_INIT(2),
    INVALID_CONFIG(3),
    UNSUPPORTED_LOCALE(4),
    INVALID_LANGUAGE_PACK(5),
    UNDEFINED_BEHAVIOR(6),
    MISSING_HOTWORD(7),
    UNSUPPORTED_LANGUAGE_PACK(8),
    INVALID_LANGUAGE_PACK_FOR_LANGID(9),
    INVALID_LANGUAGE_PACK_FOR_DIARIZATION(10);
    

    /* renamed from: l */
    public final int f182542l;

    private C67152mz(int i) {
        this.f182542l = i;
    }

    /* renamed from: a */
    public static C67152mz m97427a(int i) {
        switch (i) {
            case 0:
                return NO_ERROR;
            case 1:
                return UNKNOWN_FAILURE;
            case 2:
                return DOUBLE_INIT;
            case 3:
                return INVALID_CONFIG;
            case 4:
                return UNSUPPORTED_LOCALE;
            case 5:
                return INVALID_LANGUAGE_PACK;
            case 6:
                return UNDEFINED_BEHAVIOR;
            case 7:
                return MISSING_HOTWORD;
            case 8:
                return UNSUPPORTED_LANGUAGE_PACK;
            case 9:
                return INVALID_LANGUAGE_PACK_FOR_LANGID;
            case 10:
                return INVALID_LANGUAGE_PACK_FOR_DIARIZATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97428b() {
        return C67151my.f182529a;
    }

    public final int getNumber() {
        return this.f182542l;
    }

    public final String toString() {
        return Integer.toString(this.f182542l);
    }
}
