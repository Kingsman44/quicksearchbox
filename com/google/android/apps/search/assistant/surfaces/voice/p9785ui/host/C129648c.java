package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.c */
/* compiled from: PG */
public enum C129648c implements C62957cd {
    DISMISS_CONFIGURATION_UNDEFINED(0),
    DISMISS_CONFIGURATION_ALWAYS(1),
    DISMISS_CONFIGURATION_LOCKSCREEN(2),
    DISMISS_CONFIGURATION_NEVER(3);
    

    /* renamed from: e */
    public final int f355832e;

    private C129648c(int i) {
        this.f355832e = i;
    }

    /* renamed from: a */
    public static C129648c m211698a(int i) {
        if (i == 0) {
            return DISMISS_CONFIGURATION_UNDEFINED;
        }
        if (i == 1) {
            return DISMISS_CONFIGURATION_ALWAYS;
        }
        if (i == 2) {
            return DISMISS_CONFIGURATION_LOCKSCREEN;
        }
        if (i != 3) {
            return null;
        }
        return DISMISS_CONFIGURATION_NEVER;
    }

    /* renamed from: b */
    public static C62959cf m211699b() {
        return C129568b.f355639a;
    }

    public final int getNumber() {
        return this.f355832e;
    }

    public final String toString() {
        return Integer.toString(this.f355832e);
    }
}
