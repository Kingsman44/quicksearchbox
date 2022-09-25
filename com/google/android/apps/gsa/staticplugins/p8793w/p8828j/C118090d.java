package com.google.android.apps.gsa.staticplugins.p8793w.p8828j;

import com.google.android.apps.gsa.binaries.satin.app.aeb;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85597c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.j.d */
/* compiled from: PG */
public final class C118090d extends C86734a implements C85597c {

    /* renamed from: a */
    public final C58833ax f327719a;

    /* renamed from: b */
    public final C22871g f327720b;

    /* renamed from: c */
    public final C86124t f327721c;

    /* renamed from: f */
    private final aeb f327722f;

    /* renamed from: g */
    private final C84466a f327723g;

    public C118090d(aeb aeb, C84466a aVar, C58833ax axVar, C22871g gVar, C86124t tVar) {
        super(C118575h.WORKER_ONDEVICE_ORCHESTRATION, "ondeviceorchestration");
        this.f327723g = aVar;
        this.f327722f = aeb;
        this.f327719a = axVar;
        this.f327720b = gVar;
        this.f327721c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo79085a(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C89356b b = this.f327723g.mo78026b("OndeviceOrchestrationGraph", C118575h.GRAPH_ONDEVICE_ORCHESTRATION, C118575h.WORKER_ONDEVICE_ORCHESTRATION);
        aeb aeb = this.f327722f;
        query.getClass();
        aeb.a = query;
        aeb.b = b;
        return C60846c.m92878g(C60838bs.m92859i(C60922j.m93044g(C60838bs.m92859i(aeb.a().mo103453b()), new C118088b(this, query), C60826bg.f164896a)), Exception.class, C118089c.f327718a, C60826bg.f164896a);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
