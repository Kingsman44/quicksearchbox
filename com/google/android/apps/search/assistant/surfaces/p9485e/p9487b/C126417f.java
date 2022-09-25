package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.f */
/* compiled from: PG */
public final class C126417f implements C126414c {

    /* renamed from: a */
    private final C67464l f348172a;

    /* renamed from: b */
    private final Duration f348173b;

    public C126417f(C67464l lVar) {
        C69664n.m101061g(lVar, "event");
        this.f348172a = lVar;
        this.f348173b = Duration.m71141of(lVar.f183360c, ChronoUnit.MICROS);
    }

    /* renamed from: a */
    public final Duration mo107585a() {
        return this.f348173b;
    }

    /* renamed from: b */
    public final int mo107586b() {
        C67463k a = C67463k.m97475a(this.f348172a.f183359b);
        if (a == null) {
            a = C67463k.START_OF_SPEECH;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return 3;
        }
        throw new C69677g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C126417f) && C69664n.m101066l(this.f348172a, ((C126417f) obj).f348172a);
    }

    public final int hashCode() {
        return this.f348172a.hashCode();
    }

    public final String toString() {
        C67464l lVar = this.f348172a;
        return "OnlineEndpointer(event=" + lVar + ")";
    }
}
