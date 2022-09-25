package com.google.android.libraries.assistant.pcp.p1557g;

import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18713e;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.libraries.assistant.pcp.g.f */
/* compiled from: PG */
public final class C18767f extends C18718c {

    /* renamed from: a */
    public final AtomicReference f52881a;

    /* renamed from: b */
    final /* synthetic */ C18768g f52882b;

    /* renamed from: c */
    private final ConcurrentHashMap f52883c = new ConcurrentHashMap();

    public C18767f(C18768g gVar, Collection collection) {
        this.f52882b = gVar;
        this.f52881a = new AtomicReference(C18768g.m36168a(collection));
    }

    /* renamed from: a */
    public final C60870cx mo24114a(C18713e eVar) {
        ConcurrentHashMap concurrentHashMap = this.f52883c;
        C18764e eVar2 = new C18764e(this);
        C60870cx cxVar = (C60870cx) concurrentHashMap.get(eVar);
        if (cxVar != null) {
            return cxVar;
        }
        SettableFuture settableFuture = new SettableFuture();
        C60870cx cxVar2 = (C60870cx) concurrentHashMap.putIfAbsent(eVar, settableFuture);
        if (cxVar2 != null) {
            return cxVar2;
        }
        try {
            C60870cx cxVar3 = (C60870cx) eVar2.apply(eVar);
            if (cxVar3 == settableFuture) {
                settableFuture.mo57357o(new IllegalStateException("Circular dependency detected"));
                return settableFuture;
            }
            settableFuture.mo57358p(cxVar3);
            return settableFuture;
        } catch (Throwable th) {
            settableFuture.mo57357o(th);
            return settableFuture;
        }
    }

    /* renamed from: b */
    public final void mo24115b(C18769h hVar) {
        C18770i iVar = (C18770i) hVar;
        if (((C58495hd) this.f52881a.get()).get(iVar.f52886a) != hVar) {
            if (this.f52883c.containsKey(iVar.f52886a)) {
                ((C59052c) ((C59052c) C18768g.f52884a.mo56226d()).mo56372aa(47338)).mo56389s("Scoped.injectSupplier() is a no-op call for [%s] since it has already been called and memoized in the scoped cache!", iVar.f52886a);
            }
            DesugarAtomicReference.updateAndGet(this.f52881a, new C18753d(hVar));
        }
    }
}
