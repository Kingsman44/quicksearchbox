package com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import java.util.Map;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.b.a.d */
/* compiled from: PG */
public final class C32259d implements Comparable {

    /* renamed from: a */
    public final C32858d f86491a;

    /* renamed from: b */
    public final C32849cq f86492b;

    /* renamed from: c */
    public final Integer f86493c;

    /* renamed from: d */
    public final Duration f86494d;

    /* renamed from: e */
    public final Duration f86495e;

    /* renamed from: f */
    public final Map f86496f;

    /* renamed from: g */
    public final Map f86497g;

    public C32259d(C32858d dVar, C32849cq cqVar, Integer num, Duration duration, Duration duration2, Map map, Map map2) {
        C69664n.m101061g(dVar, "accessSessionToken");
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(duration, "creationTime");
        this.f86491a = dVar;
        this.f86492b = cqVar;
        this.f86493c = num;
        this.f86494d = duration;
        this.f86495e = duration2;
        this.f86496f = map;
        this.f86497g = map2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C32259d dVar = (C32259d) obj;
        C69664n.m101061g(dVar, "other");
        Duration duration = this.f86495e;
        if (duration != null) {
            Duration duration2 = dVar.f86495e;
            if (duration2 == null) {
                return -1;
            }
            return duration.compareTo(duration2);
        } else if (dVar.f86495e != null) {
            return 1;
        } else {
            return this.f86494d.compareTo(dVar.f86494d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32259d)) {
            return false;
        }
        C32259d dVar = (C32259d) obj;
        return C69664n.m101066l(this.f86491a, dVar.f86491a) && C69664n.m101066l(this.f86492b, dVar.f86492b) && C69664n.m101066l(this.f86493c, dVar.f86493c) && C69664n.m101066l(this.f86494d, dVar.f86494d) && C69664n.m101066l(this.f86495e, dVar.f86495e) && C69664n.m101066l(this.f86496f, dVar.f86496f) && C69664n.m101066l(this.f86497g, dVar.f86497g);
    }

    public final int hashCode() {
        int hashCode = ((((((this.f86491a.hashCode() * 31) + this.f86492b.hashCode()) * 31) + this.f86493c.hashCode()) * 31) + this.f86494d.hashCode()) * 31;
        Duration duration = this.f86495e;
        return ((((hashCode + (duration == null ? 0 : duration.hashCode())) * 31) + this.f86496f.hashCode()) * 31) + this.f86497g.hashCode();
    }

    public final String toString() {
        C32858d dVar = this.f86491a;
        C32849cq cqVar = this.f86492b;
        Integer num = this.f86493c;
        Duration duration = this.f86494d;
        Duration duration2 = this.f86495e;
        Map map = this.f86496f;
        Map map2 = this.f86497g;
        return "SbcpDebugState(accessSessionToken=" + dVar + ", sessionToken=" + cqVar + ", requestId=" + num + ", creationTime=" + duration + ", closingTime=" + duration2 + ", fetchedContexts=" + map + ", invalidatedContexts=" + map2 + ")";
    }
}
