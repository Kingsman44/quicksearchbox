package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9607d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119848cp;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import p3186j$.time.Duration;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.d.e */
/* compiled from: PG */
public final class C127524e {

    /* renamed from: a */
    public final Duration f351159a;

    /* renamed from: b */
    public final int f351160b;

    /* renamed from: c */
    public final C119851cs f351161c;

    /* renamed from: d */
    public final Duration f351162d;

    public C127524e(Duration duration, int i, C119851cs csVar, Duration duration2) {
        C69664n.m101061g(duration, "selfTriggerElapsedRealtime");
        C69664n.m101061g(csVar, "request");
        this.f351159a = duration;
        this.f351160b = i;
        this.f351161c = csVar;
        this.f351162d = duration2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127524e)) {
            return false;
        }
        C127524e eVar = (C127524e) obj;
        return C69664n.m101066l(this.f351159a, eVar.f351159a) && this.f351160b == eVar.f351160b && C69664n.m101066l(this.f351161c, eVar.f351161c) && C69664n.m101066l(this.f351162d, eVar.f351162d);
    }

    public final int hashCode() {
        int hashCode = ((((this.f351159a.hashCode() * 31) + this.f351160b) * 31) + this.f351161c.hashCode()) * 31;
        Duration duration = this.f351162d;
        return hashCode + (duration == null ? 0 : duration.hashCode());
    }

    public final String toString() {
        String[] strArr = new String[4];
        long millis = this.f351159a.toMillis();
        strArr[0] = "selfTriggerElapsedRealtimeMillis:" + millis;
        int i = this.f351160b;
        strArr[1] = "opaTriggerType:" + i;
        int b = C119848cp.m198740b(this.f351161c.f333806b);
        String a = C119848cp.m198739a(b);
        Long l = null;
        if (b != 0) {
            strArr[2] = "type:".concat(a);
            Duration duration = this.f351162d;
            if (duration != null) {
                l = Long.valueOf(duration.toMillis());
            }
            new StringBuilder("invocationElapsedRealtimeMillis:").append(l);
            strArr[3] = "invocationElapsedRealtimeMillis:".concat(String.valueOf(l));
            return C69540x.m100851ag(C69540x.m100947e(strArr), ", ", "{", "}", (C69626l) null, 56);
        }
        throw null;
    }
}
