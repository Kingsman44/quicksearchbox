package com.google.android.libraries.web.p3420k;

import com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInternal;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.k.n */
/* compiled from: PG */
final class C43868n extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ WebCoordinatorInternal f114316a;

    /* renamed from: b */
    final /* synthetic */ C43870p f114317b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43868n(WebCoordinatorInternal webCoordinatorInternal, C43870p pVar) {
        super(0);
        this.f114316a = webCoordinatorInternal;
        this.f114317b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        WebCoordinatorInternal webCoordinatorInternal = this.f114316a;
        C43863i iVar = this.f114317b.f114327i;
        C69664n.m101061g(iVar, "webFragmentApi");
        if (webCoordinatorInternal.f114099h == null) {
            webCoordinatorInternal.f114099h = iVar;
            while (!webCoordinatorInternal.f114097f.isEmpty()) {
                Object poll = webCoordinatorInternal.f114097f.poll();
                C69664n.m101058d(poll);
                ((Runnable) poll).run();
            }
            while (!webCoordinatorInternal.f114098g.isEmpty()) {
                Object poll2 = webCoordinatorInternal.f114098g.poll();
                C69664n.m101058d(poll2);
                ((Runnable) poll2).run();
            }
            return C69788q.f186170a;
        }
        throw new IllegalStateException("WebController can only manage a single WebFragment.");
    }
}
