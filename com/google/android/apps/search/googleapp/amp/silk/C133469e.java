package com.google.android.apps.search.googleapp.amp.silk;

import com.google.android.libraries.silk.p3205a.p3206a.C41709a;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56616h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56618j;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.amp.silk.e */
/* compiled from: PG */
public final class C133469e implements C41709a {

    /* renamed from: a */
    private final C133473i f363686a;

    /* renamed from: b */
    private final AtomicReference f363687b;

    /* renamed from: c */
    private final C41709a f363688c;

    public C133469e(C133473i iVar, AtomicReference atomicReference) {
        C69664n.m101061g(atomicReference, "persistenceId");
        this.f363686a = iVar;
        this.f363687b = atomicReference;
        this.f363688c = iVar.mo111184a(1, atomicReference);
    }

    /* renamed from: a */
    public final C60870cx mo44311a(C56616h hVar) {
        C69664n.m101061g(hVar, "request");
        C60870cx a = this.f363688c.mo44311a(hVar);
        C69664n.m101060f(a, "delegate.open(request)");
        return a;
    }

    /* renamed from: b */
    public final C60870cx mo44312b(C56618j jVar) {
        C69664n.m101061g(jVar, "request");
        C60870cx b = this.f363688c.mo44312b(jVar);
        C69664n.m101060f(b, "delegate.prefetch(request)");
        return b;
    }
}
