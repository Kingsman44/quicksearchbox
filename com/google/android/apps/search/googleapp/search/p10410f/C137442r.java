package com.google.android.apps.search.googleapp.search.p10410f;

import com.google.common.p4522b.C58425eo;
import com.google.common.p4580v.C60950i;
import java.util.Iterator;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.android.apps.search.googleapp.search.f.r */
/* compiled from: PG */
public final class C137442r implements Iterable, C69640a {

    /* renamed from: a */
    private final C60950i f373828a;

    /* renamed from: b */
    private final C58425eo f373829b;

    public C137442r(C60950i iVar, int i) {
        this.f373828a = iVar;
        this.f373829b = new C58425eo(i);
    }

    /* renamed from: a */
    public final void mo113734a(Object obj) {
        C58425eo eoVar = this.f373829b;
        Instant a = this.f373828a.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        eoVar.add(new C137448x(a, obj));
    }

    public final Iterator iterator() {
        Iterator it = this.f373829b.iterator();
        C69664n.m101060f(it, "items.iterator()");
        return it;
    }
}
