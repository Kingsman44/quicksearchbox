package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.ae */
/* compiled from: PG */
public final class C126377ae {

    /* renamed from: a */
    public final Duration f348084a;

    /* renamed from: b */
    private final int f348085b = 16000;

    /* renamed from: c */
    private final int f348086c = 1;

    public C126377ae(Duration duration) {
        C69664n.m101061g(duration, "statsUpdateDuration");
        this.f348084a = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C126377ae)) {
            return false;
        }
        C126377ae aeVar = (C126377ae) obj;
        int i = aeVar.f348085b;
        int i2 = aeVar.f348086c;
        return C69664n.m101066l(this.f348084a, aeVar.f348084a);
    }

    public final int hashCode() {
        return this.f348084a.hashCode() + 15376031;
    }

    public final String toString() {
        Duration duration = this.f348084a;
        return "AudioInputConfig(sampleRate=16000, channelCount=1, statsUpdateDuration=" + duration + ")";
    }
}
