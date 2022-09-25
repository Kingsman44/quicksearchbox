package com.google.android.libraries.web.profile.p3431a.p3432a.p3433a;

import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.a.a.a.c */
/* compiled from: PG */
public final class C43981c {

    /* renamed from: a */
    public final C71571du f114492a;

    /* renamed from: b */
    private final C71548cy f114493b;

    /* renamed from: c */
    private final C71548cy f114494c;

    /* renamed from: d */
    private final C71571du f114495d;

    /* renamed from: com.google.android.libraries.web.profile.a.a.a.c$a */
    /* compiled from: PG */
    public interface C43982a {
        /* renamed from: gt */
        C43981c mo46981gt();
    }

    public C43981c(C43979a aVar) {
        C69664n.m101061g(aVar, "webAccountStateRegistries");
        aVar.f114487a.add(this);
        C71548cy b = C71574dx.m104480b(C43980b.UNKNOWN);
        this.f114493b = b;
        C71548cy b2 = C71574dx.m104480b(C43983d.UNKNOWN);
        this.f114494c = b2;
        this.f114495d = b;
        this.f114492a = b2;
    }

    /* renamed from: a */
    public final C43980b mo46978a() {
        return (C43980b) this.f114495d.mo62784e();
    }

    /* renamed from: b */
    public final void mo46979b(C43980b bVar) {
        C69664n.m101061g(bVar, "value");
        this.f114493b.mo62807f(bVar);
    }

    /* renamed from: c */
    public final void mo46980c(C43983d dVar) {
        C69664n.m101061g(dVar, "value");
        if (this.f114492a.mo62784e() != C43983d.SIGNED_IN || (dVar != C43983d.FETCHING && dVar != C43983d.FETCH_FAILED)) {
            this.f114494c.mo62807f(dVar);
        }
    }
}
