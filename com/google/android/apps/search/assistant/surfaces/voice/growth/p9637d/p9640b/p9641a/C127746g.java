package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.a.g */
/* compiled from: PG */
public enum C127746g implements C62957cd {
    MODE_UNSPECIFIED(0),
    MODE_NEW_USER_INPUT_PLATE(1),
    MODE_ACTIVATED_USER_INPUT_PLATE(2),
    MODE_OVERAPP_USER_INPUT_PLATE(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f351648f;

    private C127746g(int i) {
        this.f351648f = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f351648f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
