package com.google.android.libraries.p590as.p591a;

import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.libraries.as.a.d */
/* compiled from: PG */
public enum C10770d {
    AMR("audio/AMR", "amr", 1, C67451at.AMR),
    AMRWB("audio/amr-wb", "amr", 2, C67451at.AMR_WB),
    PCM("audio/wav", "pcm", 3, C67451at.LINEAR16),
    OGGOPUS("audio/ogg", "opus", 4, C67451at.OGG_OPUS);
    

    /* renamed from: e */
    public final String f35759e;

    /* renamed from: f */
    public final String f35760f;

    /* renamed from: g */
    public final int f35761g;

    /* renamed from: h */
    public final C67451at f35762h;

    private C10770d(String str, String str2, int i, C67451at atVar) {
        this.f35759e = str;
        this.f35760f = str2;
        this.f35761g = i;
        this.f35762h = atVar;
    }

    /* renamed from: a */
    public static C10770d m25763a(C67451at atVar) {
        for (C10770d dVar : values()) {
            if (dVar.f35762h == atVar) {
                return dVar;
            }
        }
        throw new IllegalArgumentException("invalid recognizer encoding: ".concat(String.valueOf(atVar.name())));
    }
}
