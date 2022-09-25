package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.f */
/* compiled from: PG */
public enum C129459f implements C62957cd {
    TRY_SAYING(2),
    GREETING(1),
    DEFAULT_NOT_VISIBLE(0);
    

    /* renamed from: d */
    public final int f355451d;

    private C129459f(int i) {
        this.f355451d = i;
    }

    /* renamed from: a */
    public static C129459f m211358a(int i) {
        if (i == 0) {
            return DEFAULT_NOT_VISIBLE;
        }
        if (i == 1) {
            return GREETING;
        }
        if (i != 2) {
            return null;
        }
        return TRY_SAYING;
    }

    /* renamed from: b */
    public static C62959cf m211359b() {
        return C129458e.f355446a;
    }

    public final int getNumber() {
        return this.f355451d;
    }

    public final String toString() {
        return Integer.toString(this.f355451d);
    }
}
