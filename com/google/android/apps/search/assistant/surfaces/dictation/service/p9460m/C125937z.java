package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import com.google.android.apps.gsa.binaries.satin.app.aoj;
import com.google.android.apps.gsa.nga.api.a.af;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.z */
/* compiled from: PG */
public final class C125937z {

    /* renamed from: a */
    public final AtomicReference f347151a = new AtomicReference(C125934w.f347146a);

    /* renamed from: b */
    private final aoj f347152b;

    public C125937z(aoj aoj) {
        C69664n.m101061g(aoj, "capabilitiesHelperFactory");
        this.f347152b = aoj;
    }

    /* renamed from: a */
    public final C125931t mo107202a() {
        aoj aoj = this.f347152b;
        Object obj = this.f347151a.get();
        C69664n.m101060f(obj, "keyboardSate.get()");
        return aoj.mo66633a((C125934w) obj);
    }

    /* renamed from: b */
    public final C125934w mo107203b() {
        Object obj = this.f347151a.get();
        C69664n.m101060f(obj, "keyboardSate.get()");
        return (C125934w) obj;
    }

    /* renamed from: c */
    public final void mo107204c() {
        DesugarAtomicReference.updateAndGet(this.f347151a, C125935x.f347149a);
    }

    /* renamed from: d */
    public final void mo107205d(af afVar) {
        C69664n.m101061g(afVar, "configurationData");
        AtomicReference atomicReference = this.f347151a;
        C125934w wVar = C125934w.f347146a;
        atomicReference.set(C125933v.m205976b(afVar));
    }
}
