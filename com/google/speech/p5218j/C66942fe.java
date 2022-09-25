package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.fe */
/* compiled from: PG */
public enum C66942fe implements C62957cd {
    CONFIG_ERROR_UNKNOWN(0),
    CONFIG_ERROR_LOW_POWER_MODEL_DOES_NOT_EXIST(1),
    CONFIG_ERROR_NO_SUPPORTED_ASR_MODEL_FOR_LOCALE(2),
    CONFIG_ERROR_ASR_MODEL_MISSING(3),
    CONFIG_ERROR_QUICK_PHRASE_STRING_NOT_SUPPORTED_BY_ASR_MODEL(4),
    CONFIG_ERROR_QUICK_PHRASES_DISABLED_BY_CONFIG(5);
    

    /* renamed from: g */
    public final int f181962g;

    private C66942fe(int i) {
        this.f181962g = i;
    }

    /* renamed from: a */
    public static C66942fe m97387a(int i) {
        if (i == 0) {
            return CONFIG_ERROR_UNKNOWN;
        }
        if (i == 1) {
            return CONFIG_ERROR_LOW_POWER_MODEL_DOES_NOT_EXIST;
        }
        if (i == 2) {
            return CONFIG_ERROR_NO_SUPPORTED_ASR_MODEL_FOR_LOCALE;
        }
        if (i == 3) {
            return CONFIG_ERROR_ASR_MODEL_MISSING;
        }
        if (i == 4) {
            return CONFIG_ERROR_QUICK_PHRASE_STRING_NOT_SUPPORTED_BY_ASR_MODEL;
        }
        if (i != 5) {
            return null;
        }
        return CONFIG_ERROR_QUICK_PHRASES_DISABLED_BY_CONFIG;
    }

    /* renamed from: b */
    public static C62959cf m97388b() {
        return C66941fd.f181954a;
    }

    public final int getNumber() {
        return this.f181962g;
    }

    public final String toString() {
        return Integer.toString(this.f181962g);
    }
}
