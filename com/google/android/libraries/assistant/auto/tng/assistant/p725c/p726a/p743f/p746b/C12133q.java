package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import com.google.speech.recognizer.p5233a.C67451at;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.q */
/* compiled from: PG */
public enum C12133q {
    AMR_MONO(C67451at.AMR, "audio/3gpp", 8000, 1, 12200, Duration.ofMillis(20)),
    AMR_WB_MONO(C67451at.AMR_WB, "audio/amr-wb", 16000, 1, 23850, Duration.ofMillis(20)),
    AMR_WB_STEREO(C67451at.AMR_WB, "audio/amr-wb", 16000, 2, 47700, Duration.ofMillis(20)),
    OGG_OPUS_WB_MONO(C67451at.OGG_OPUS, "audio/opus", 16000, 1, 24000, Duration.ofMillis(30)),
    OGG_OPUS_WB_STEREO(C67451at.OGG_OPUS, "audio/opus", 16000, 2, 48000, Duration.ofMillis(30));
    

    /* renamed from: f */
    public final int f38790f;

    /* renamed from: g */
    public final int f38791g;

    /* renamed from: h */
    public final int f38792h;

    /* renamed from: i */
    public final int f38793i;

    /* renamed from: j */
    public final String f38794j;

    /* renamed from: k */
    public final C67451at f38795k;

    private C12133q(C67451at atVar, String str, int i, int i2, int i3, Duration duration) {
        this.f38795k = atVar;
        this.f38790f = i;
        this.f38791g = i2;
        this.f38794j = str;
        this.f38793i = i3;
        this.f38792h = (i * ((int) duration.toMillis())) / 1000;
    }
}
