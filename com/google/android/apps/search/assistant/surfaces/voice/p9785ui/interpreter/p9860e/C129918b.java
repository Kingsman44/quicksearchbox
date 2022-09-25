package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b */
/* compiled from: PG */
public enum C129918b implements C62957cd {
    MODE_NOT_SELECTED(0),
    MODE_AUTO(1),
    MODE_MANUAL(2),
    MODE_KEYBOARD(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    public static final C62958ce f356370f = null;

    /* renamed from: g */
    private final int f356372g;

    static {
        f356370f = new C129890a();
    }

    private C129918b(int i) {
        this.f356372g = i;
    }

    /* renamed from: a */
    public static C129918b m212112a(int i) {
        if (i == 0) {
            return MODE_NOT_SELECTED;
        }
        if (i == 1) {
            return MODE_AUTO;
        }
        if (i == 2) {
            return MODE_MANUAL;
        }
        if (i != 3) {
            return null;
        }
        return MODE_KEYBOARD;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f356372g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
