package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.f.c */
/* compiled from: PG */
final class C128034c extends C128046o {

    /* renamed from: c */
    private final C58495hd f352317c;

    public C128034c(C58495hd hdVar) {
        if (hdVar != null) {
            this.f352317c = hdVar;
            return;
        }
        throw new NullPointerException("Null events");
    }

    /* renamed from: a */
    public final C58495hd mo108316a() {
        return this.f352317c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C128046o) {
            return this.f352317c.equals(((C128046o) obj).mo108316a());
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(this.f352317c.entrySet()) ^ 1000003;
    }

    public final String toString() {
        String obj = this.f352317c.toString();
        return "SensorsData{events=" + obj + "}";
    }
}
