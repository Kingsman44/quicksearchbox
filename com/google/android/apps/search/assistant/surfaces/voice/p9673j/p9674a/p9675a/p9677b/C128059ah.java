package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ah */
/* compiled from: PG */
public enum C128059ah implements C62957cd {
    NOT_SET(0),
    ESCAPE_HATCH(1);
    

    /* renamed from: c */
    public final int f352369c;

    private C128059ah(int i) {
        this.f352369c = i;
    }

    /* renamed from: a */
    public static C128059ah m209200a(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i != 1) {
            return null;
        }
        return ESCAPE_HATCH;
    }

    /* renamed from: b */
    public static C62959cf m209201b() {
        return C128058ag.f352365a;
    }

    public final int getNumber() {
        return this.f352369c;
    }

    public final String toString() {
        return Integer.toString(this.f352369c);
    }
}
