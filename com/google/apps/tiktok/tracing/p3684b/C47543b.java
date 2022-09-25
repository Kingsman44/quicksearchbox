package com.google.apps.tiktok.tracing.p3684b;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.apps.tiktok.tracing.b.b */
/* compiled from: PG */
public final /* synthetic */ class C47543b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C47547f f123389a;

    public /* synthetic */ C47543b(C47547f fVar) {
        this.f123389a = fVar;
    }

    public final Object apply(Object obj) {
        C47547f fVar = this.f123389a;
        C58833ax axVar = (C58833ax) obj;
        if (fVar.f123396b.equals(C71207aq.f190077a)) {
            return (C71207aq) axVar.mo56109e(C71207aq.f190077a);
        }
        if (!axVar.mo56113h()) {
            return fVar.f123396b;
        }
        C71206ap apVar = (C71206ap) ((C71207aq) axVar.mo56107c()).toBuilder();
        apVar.mergeFrom(fVar.f123396b);
        return (C71207aq) apVar.build();
    }
}
