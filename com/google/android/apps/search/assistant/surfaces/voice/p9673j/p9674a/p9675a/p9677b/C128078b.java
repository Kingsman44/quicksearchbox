package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.b */
/* compiled from: PG */
public enum C128078b implements C62957cd {
    CLIENT_UNKNOWN(0),
    CLIENT_TITAN_VIS_VOICE_PLATE(1),
    CLIENT_TITAN_DRL_VOICE_PLATE(2);
    

    /* renamed from: d */
    public final int f352409d;

    private C128078b(int i) {
        this.f352409d = i;
    }

    /* renamed from: a */
    public static C128078b m209211a(int i) {
        if (i == 0) {
            return CLIENT_UNKNOWN;
        }
        if (i == 1) {
            return CLIENT_TITAN_VIS_VOICE_PLATE;
        }
        if (i != 2) {
            return null;
        }
        return CLIENT_TITAN_DRL_VOICE_PLATE;
    }

    /* renamed from: b */
    public static C62959cf m209212b() {
        return C128051a.f352354a;
    }

    public final int getNumber() {
        return this.f352409d;
    }

    public final String toString() {
        return Integer.toString(this.f352409d);
    }
}
