package com.google.android.libraries.assistant.p1363c.p1380c.p1381a;

import com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.C120191ai;
import com.google.speech.micro.C67363a;
import com.google.speech.micro.GoogleEndpointer;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.a.l */
/* compiled from: PG */
final class C17176l {

    /* renamed from: a */
    public static final Duration f49891a = Duration.ofMillis(200);

    /* renamed from: b */
    public Duration f49892b = Duration.ZERO;

    /* renamed from: c */
    public Duration f49893c = f49891a.negated();

    /* renamed from: d */
    public int f49894d = 1;

    /* renamed from: e */
    public final C120191ai f49895e;

    /* renamed from: f */
    private final Duration f49896f;

    /* renamed from: g */
    private final int f49897g;

    public C17176l(C120191ai aiVar, Duration duration, int i) {
        this.f49895e = aiVar;
        this.f49896f = duration;
        this.f49897g = i + i;
    }

    /* renamed from: a */
    public final Duration mo23218a(int i) {
        return Duration.ofMillis((long) ((i * 1000) / this.f49897g));
    }

    /* renamed from: b */
    public final void mo23219b(GoogleEndpointer.GoogleEndpointerResult googleEndpointerResult, Duration duration) {
        int i;
        if (C67363a.SPEECH.equals(googleEndpointerResult.getEvent())) {
            i = 2;
        } else if (duration.minus(this.f49892b).compareTo(this.f49896f) >= 0) {
            this.f49895e.mo104685b(this.f49892b);
            i = 4;
        } else {
            return;
        }
        this.f49894d = i;
    }
}
