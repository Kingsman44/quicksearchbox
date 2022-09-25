package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.a.a */
/* compiled from: PG */
public enum C127614a implements C62957cd {
    UNDEFINED(0),
    UPDATE_HANDLED(1),
    UPDATE_IGNORED_CLIENT_DISCONNECTED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f351328e;

    private C127614a(int i) {
        this.f351328e = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f351328e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
