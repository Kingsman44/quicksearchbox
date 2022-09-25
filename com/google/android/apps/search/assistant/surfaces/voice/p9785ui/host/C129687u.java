package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.u */
/* compiled from: PG */
public enum C129687u implements C62957cd {
    TYPE_UNSPECIFIED(0),
    DEFAULT_ACTIVITY(1),
    FULLSCREEN_ACTIVITY(2),
    TRANSIENT_ACTIVITY(3);
    

    /* renamed from: e */
    public final int f355910e;

    private C129687u(int i) {
        this.f355910e = i;
    }

    /* renamed from: a */
    public static C129687u m211745a(int i) {
        if (i == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DEFAULT_ACTIVITY;
        }
        if (i == 2) {
            return FULLSCREEN_ACTIVITY;
        }
        if (i != 3) {
            return null;
        }
        return TRANSIENT_ACTIVITY;
    }

    /* renamed from: b */
    public static C62959cf m211746b() {
        return C129686t.f355904a;
    }

    public final int getNumber() {
        return this.f355910e;
    }

    public final String toString() {
        return Integer.toString(this.f355910e);
    }
}
