package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ar */
/* compiled from: PG */
public enum C128069ar implements C62957cd {
    NOT_SET(0),
    MIC(1);
    

    /* renamed from: c */
    public final int f352391c;

    private C128069ar(int i) {
        this.f352391c = i;
    }

    /* renamed from: a */
    public static C128069ar m209203a(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i != 1) {
            return null;
        }
        return MIC;
    }

    /* renamed from: b */
    public static C62959cf m209204b() {
        return C128068aq.f352387a;
    }

    public final int getNumber() {
        return this.f352391c;
    }

    public final String toString() {
        return Integer.toString(this.f352391c);
    }
}
