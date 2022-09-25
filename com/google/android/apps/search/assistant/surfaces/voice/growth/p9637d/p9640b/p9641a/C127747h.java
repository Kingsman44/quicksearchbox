package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.a.h */
/* compiled from: PG */
public enum C127747h implements C62957cd {
    ANY(0),
    HOME_SCREEN(1),
    IN_APP(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f351654e;

    private C127747h(int i) {
        this.f351654e = i;
    }

    /* renamed from: a */
    public static C127747h m208795a(int i) {
        if (i == 0) {
            return ANY;
        }
        if (i == 1) {
            return HOME_SCREEN;
        }
        if (i != 2) {
            return null;
        }
        return IN_APP;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f351654e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
