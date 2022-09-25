package com.google.android.libraries.search.assistant.p2786t.p2787a;

import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36407a;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36408b;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36410d;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36427u;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2794d.C36496e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.libraries.search.assistant.t.a.l */
/* compiled from: PG */
public final /* synthetic */ class C36461l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36466q f95195a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f95196b;

    public /* synthetic */ C36461l(C36466q qVar, AtomicReference atomicReference) {
        this.f95195a = qVar;
        this.f95196b = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        C36466q qVar = this.f95195a;
        AtomicReference atomicReference = this.f95196b;
        C36410d dVar = (C36410d) obj;
        if (!dVar.f95094b) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        Optional a = C36496e.m65043a((C70334de) atomicReference.get());
        if (a.isEmpty()) {
            return C60856cj.m92899h(new RuntimeException("No notification found in RPC trailer metadata"));
        }
        if ((dVar.f95093a & 2) == 0) {
            return C60856cj.m92900i(C58485gu.m89846n((C36476g) a.get()));
        }
        C36407a aVar = (C36407a) C36408b.f95087c.createBuilder();
        C36427u uVar = dVar.f95095c;
        if (uVar == null) {
            uVar = C36427u.f95119c;
        }
        aVar.copyOnWrite();
        C36408b bVar = (C36408b) aVar.instance;
        uVar.getClass();
        bVar.f95090b = uVar;
        bVar.f95089a = 2;
        C60870cx e = qVar.mo40173e((C36408b) aVar.build());
        C36465p pVar = new C36465p(a);
        return C60922j.m93044g(e, C47810es.m84963c(pVar), qVar.f95205b);
    }
}
