package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.u */
/* compiled from: PG */
public enum C128189u implements C62957cd {
    NONE(0),
    SCHEDULED(1),
    SUGGESTIONS_MIXER_PCP_V1(2),
    SUGGESTIONS_MIXER(3),
    PRELOADED(4);
    

    /* renamed from: f */
    public final int f352647f;

    private C128189u(int i) {
        this.f352647f = i;
    }

    /* renamed from: a */
    public static C128189u m209275a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return SCHEDULED;
        }
        if (i == 2) {
            return SUGGESTIONS_MIXER_PCP_V1;
        }
        if (i == 3) {
            return SUGGESTIONS_MIXER;
        }
        if (i != 4) {
            return null;
        }
        return PRELOADED;
    }

    /* renamed from: b */
    public static C62959cf m209276b() {
        return C128188t.f352640a;
    }

    public final int getNumber() {
        return this.f352647f;
    }

    public final String toString() {
        return Integer.toString(this.f352647f);
    }
}
