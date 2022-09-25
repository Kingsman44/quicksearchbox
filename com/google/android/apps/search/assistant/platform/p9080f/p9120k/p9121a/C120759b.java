package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.b */
/* compiled from: PG */
public final class C120759b {

    /* renamed from: a */
    private final C37215b f335867a;

    /* renamed from: b */
    private final AtomicBoolean f335868b = new AtomicBoolean();

    public C120759b(C37215b bVar) {
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f335867a = bVar;
    }

    /* renamed from: a */
    public final void mo104920a(C37254c cVar) {
        this.f335867a.mo19974a(cVar);
    }

    /* renamed from: b */
    public final void mo104921b(Throwable th) {
        C37252a c = C37176a.f96883bA.mo40779c();
        C120760c.m199936a(c, th);
        mo104920a(c);
    }

    /* renamed from: c */
    public final void mo104922c(C62722b bVar) {
        C69664n.m101061g(bVar, "code");
        if (this.f335868b.compareAndSet(false, true)) {
            mo104920a(C37176a.f96852aW.mo40815i(bVar));
        }
    }

    /* renamed from: d */
    public final void mo104923d(Throwable th) {
        if (this.f335868b.compareAndSet(false, true)) {
            C37252a g = C37176a.f96852aW.mo40813g();
            C120760c.m199936a(g, th);
            mo104920a(g);
        }
    }

    /* renamed from: e */
    public final void mo104924e(Throwable th) {
        C37252a c = C37176a.f96847aR.mo40779c();
        C120760c.m199936a(c, th);
        mo104920a(c);
    }
}
