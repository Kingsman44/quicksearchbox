package com.google.android.libraries.gsa.conversation.p1837a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.gsa.conversation.a.j */
/* compiled from: PG */
public final class C22329j {

    /* renamed from: a */
    public static final C59071e f61652a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.a.j");

    /* renamed from: b */
    public final ExecutorService f61653b;

    /* renamed from: c */
    private C58833ax f61654c;

    /* renamed from: d */
    private C58833ax f61655d;

    public C22329j(ExecutorService executorService) {
        this.f61653b = executorService;
        C58836b bVar = C58836b.f156633a;
        this.f61654c = bVar;
        this.f61655d = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo27559a(C58833ax axVar) {
        if (!axVar.mo56113h() || ((C22328i) axVar.mo56107c()).mo27558b().isDone()) {
            return C118826c.f331423b;
        }
        C22328i iVar = (C22328i) axVar.mo56107c();
        iVar.mo27558b().cancel(true);
        return C60856cj.m92905n(C47810es.m84965e(new C22322c(iVar)), this.f61653b);
    }

    /* renamed from: b */
    public final synchronized void mo27560b(C22334o oVar, C22327h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        oVar.mo27546a();
        C22326g gVar = new C22326g(oVar, hVar);
        C22335p pVar = new C22335p(C60856cj.m92905n(C47810es.m84965e(new C22323d(this, this.f61654c, this.f61655d, gVar)), this.f61653b), gVar);
        if (oVar.mo27546a() == C22333n.OUTPUT) {
            this.f61655d = C58833ax.m90834k(pVar);
        } else {
            this.f61654c = C58833ax.m90834k(pVar);
        }
    }

    /* renamed from: c */
    public final void mo27561c(C22333n nVar) {
        C58833ax axVar;
        synchronized (this) {
            if (nVar == C22333n.INPUT) {
                axVar = this.f61654c;
            } else {
                axVar = this.f61655d;
            }
        }
        mo27559a(axVar);
    }
}
