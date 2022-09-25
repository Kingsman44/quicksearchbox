package com.google.android.libraries.search.assistant.p2700k;

import com.google.android.libraries.search.assistant.p2700k.p2702b.C34763b;
import com.google.android.libraries.search.assistant.p2700k.p2702b.C34764c;
import com.google.common.p4522b.C58759qy;
import java.util.Set;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.k.x */
/* compiled from: PG */
public final class C34786x {

    /* renamed from: a */
    public final Set f92312a;

    /* renamed from: b */
    public final Duration f92313b;

    /* renamed from: c */
    public final C34764c f92314c;

    /* renamed from: d */
    private final boolean f92315d;

    public C34786x() {
        this((Set) null, (C34764c) null);
    }

    public /* synthetic */ C34786x(Set set, C34764c cVar) {
        Duration ofSeconds = Duration.ofSeconds(6);
        C69664n.m101060f(ofSeconds, "ofSeconds(6)");
        C69664n.m101061g(ofSeconds, "fetchTimeout");
        this.f92312a = set;
        this.f92313b = ofSeconds;
        this.f92315d = false;
        this.f92314c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34786x)) {
            return false;
        }
        C34786x xVar = (C34786x) obj;
        if (!C69664n.m101066l(this.f92312a, xVar.f92312a) || !C69664n.m101066l(this.f92313b, xVar.f92313b)) {
            return false;
        }
        boolean z = xVar.f92315d;
        return C69664n.m101066l(this.f92314c, xVar.f92314c);
    }

    public final int hashCode() {
        return (((((C58759qy) this.f92312a).f156534a.hashCode() * 31) + this.f92313b.hashCode()) * 961) + ((C34763b) this.f92314c).f92247a.hashCode();
    }

    public final String toString() {
        Set set = this.f92312a;
        Duration duration = this.f92313b;
        C34764c cVar = this.f92314c;
        return "RpcAuthOptions(oAuthScopes=" + set + ", fetchTimeout=" + duration + ", forceRefresh=false, accountPolicy=" + cVar + ")";
    }
}
