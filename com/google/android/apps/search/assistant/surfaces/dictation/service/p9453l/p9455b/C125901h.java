package com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b;

import com.google.common.p4580v.C60950i;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Instant;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.h */
/* compiled from: PG */
public final class C125901h {

    /* renamed from: a */
    public final C60950i f346978a;

    /* renamed from: b */
    public final AtomicReference f346979b = new AtomicReference(new C125892a((byte[]) null));

    public C125901h(C60950i iVar) {
        C69664n.m101061g(iVar, "timeSource");
        this.f346978a = iVar;
    }

    /* renamed from: a */
    public final Instant mo107156a() {
        return ((C125892a) this.f346979b.get()).f346962c;
    }

    /* renamed from: b */
    public final void mo107157b(C69626l lVar) {
        DesugarAtomicReference.updateAndGet(this.f346979b, new C125899f(lVar));
    }

    /* renamed from: c */
    public final boolean mo107158c() {
        return ((C125892a) this.f346979b.get()).f346961b;
    }
}
