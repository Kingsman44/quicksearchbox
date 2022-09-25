package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9607d;

import p3186j$.time.Duration;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.d.a */
/* compiled from: PG */
public final class C127520a {

    /* renamed from: a */
    public final Duration f351151a;

    /* renamed from: b */
    public final int f351152b;

    /* renamed from: c */
    public final Duration f351153c;

    public C127520a(Duration duration, int i, Duration duration2) {
        C69664n.m101061g(duration, "deeplinkElapsedRealtime");
        this.f351151a = duration;
        this.f351152b = i;
        this.f351153c = duration2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127520a)) {
            return false;
        }
        C127520a aVar = (C127520a) obj;
        return C69664n.m101066l(this.f351151a, aVar.f351151a) && this.f351152b == aVar.f351152b && C69664n.m101066l(this.f351153c, aVar.f351153c);
    }

    public final int hashCode() {
        int hashCode = ((this.f351151a.hashCode() * 31) + this.f351152b) * 31;
        Duration duration = this.f351153c;
        return hashCode + (duration == null ? 0 : duration.hashCode());
    }

    public final String toString() {
        String[] strArr = new String[3];
        long millis = this.f351151a.toMillis();
        strArr[0] = "deeplinkElapsedRealtimeMillis:" + millis;
        int i = this.f351152b;
        strArr[1] = "opaTriggerType:" + i;
        Duration duration = this.f351153c;
        Long valueOf = duration != null ? Long.valueOf(duration.toMillis()) : null;
        new StringBuilder("invocationElapsedRealtimeMillis:").append(valueOf);
        strArr[2] = "invocationElapsedRealtimeMillis:".concat(String.valueOf(valueOf));
        return C69540x.m100851ag(C69540x.m100947e(strArr), ", ", "{", "}", (C69626l) null, 56);
    }
}
