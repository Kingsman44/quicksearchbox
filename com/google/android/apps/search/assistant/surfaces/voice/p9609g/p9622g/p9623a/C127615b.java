package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.a.b */
/* compiled from: PG */
public enum C127615b implements C62957cd {
    UNKNOWN(0),
    PRIMARY_LOCALE_CHANGE_SETTING(1),
    ASSISTANT_ENABLED_CHANGE_SETTING(2),
    INPUT_MODALITY_CHANGE_SETTING(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f351335f;

    private C127615b(int i) {
        this.f351335f = i;
    }

    /* renamed from: a */
    public static C127615b m208619a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PRIMARY_LOCALE_CHANGE_SETTING;
        }
        if (i == 2) {
            return ASSISTANT_ENABLED_CHANGE_SETTING;
        }
        if (i != 3) {
            return null;
        }
        return INPUT_MODALITY_CHANGE_SETTING;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f351335f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
