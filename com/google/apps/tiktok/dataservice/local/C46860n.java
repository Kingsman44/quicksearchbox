package com.google.apps.tiktok.dataservice.local;

import androidx.lifecycle.C2383n;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.dataservice.local.n */
/* compiled from: PG */
final class C46860n extends C46854h {

    /* renamed from: a */
    final /* synthetic */ C46852f f122288a;

    /* renamed from: b */
    final /* synthetic */ LocalSubscriptionMixinImpl f122289b;

    public C46860n(LocalSubscriptionMixinImpl localSubscriptionMixinImpl, C46852f fVar) {
        this.f122289b = localSubscriptionMixinImpl;
        this.f122288a = fVar;
    }

    /* renamed from: a */
    public final void mo50866a(C46851e eVar) {
        C19559g.m37304c();
        LocalSubscriptionMixinImpl localSubscriptionMixinImpl = this.f122289b;
        if (localSubscriptionMixinImpl.f122222b == null) {
            throw new C46863q();
        } else if (localSubscriptionMixinImpl.f122221a.mo5789a().equals(C2383n.STARTED) || this.f122289b.f122221a.mo5789a().equals(C2383n.RESUMED)) {
            C46838am amVar = this.f122289b.f122222b;
            C46852f fVar = this.f122288a;
            C19559g.m37304c();
            C46841ap apVar = (C46841ap) amVar.f122257a.get(fVar);
            C58838bb.m90884s(apVar != null, "This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
            C19559g.m37304c();
            C58838bb.m90866a(apVar.f122265a, "LocalSubscriptionStateReference used after free.");
            C46839an anVar = apVar.f122265a;
            apVar.f122265a = new C46848b(C58833ax.m90834k(eVar), anVar.mo50844a(), anVar.mo50846c(), anVar.mo50847d());
            C19559g.m37304c();
            amVar.f122259c.execute(C47810es.m84977q(new C46835aj(amVar, apVar)));
        } else {
            throw new C46862p();
        }
    }
}
