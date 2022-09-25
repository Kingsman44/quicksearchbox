package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.at */
/* compiled from: PG */
public enum C124627at implements C62957cd {
    UNKNOWN_OTA_TYPE(0),
    FIRMWARE_OTA_TYPE(1),
    HOTWORD_FULL_OTA_TYPE(2),
    HOTWORD_MODEL_ONLY_OTA_TYPE(3),
    HOTWORD_ACTIVIATE_OTA_TYPE(4);
    

    /* renamed from: f */
    public final int f343811f;

    private C124627at(int i) {
        this.f343811f = i;
    }

    /* renamed from: a */
    public static C124627at m204292a(int i) {
        if (i == 0) {
            return UNKNOWN_OTA_TYPE;
        }
        if (i == 1) {
            return FIRMWARE_OTA_TYPE;
        }
        if (i == 2) {
            return HOTWORD_FULL_OTA_TYPE;
        }
        if (i == 3) {
            return HOTWORD_MODEL_ONLY_OTA_TYPE;
        }
        if (i != 4) {
            return null;
        }
        return HOTWORD_ACTIVIATE_OTA_TYPE;
    }

    /* renamed from: b */
    public static C62959cf m204293b() {
        return C124626as.f343804a;
    }

    public final int getNumber() {
        return this.f343811f;
    }

    public final String toString() {
        return Integer.toString(this.f343811f);
    }
}
