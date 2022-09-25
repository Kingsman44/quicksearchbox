package com.google.apps.tiktok.dataservice.local;

import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.apps.tiktok.dataservice.local.ah */
/* compiled from: PG */
public final /* synthetic */ class C46833ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46838am f122251a;

    public /* synthetic */ C46833ah(C46838am amVar) {
        this.f122251a = amVar;
    }

    public final void run() {
        C46838am amVar = this.f122251a;
        C19559g.m37304c();
        boolean z = true;
        if (amVar.f122263g != 1) {
            z = false;
        }
        C58838bb.m90884s(z, "Duplicate or leaked callback task.");
        C58480gp e = C58485gu.m89837e();
        amVar.f122263g = 2;
        C0978h hVar = new C0978h((C0979i) amVar.f122261e);
        while (hVar.hasNext()) {
            C46841ap apVar = (C46841ap) hVar.next();
            C19559g.m37304c();
            C58838bb.m90866a(apVar.f122265a, "LocalSubscriptionStateReference used after free.");
            C58838bb.m90884s(apVar.f122265a.mo50846c().mo56113h(), "Isolation failure in updateToPublish(). The state to publish has gone missing. Please report this error as a P1 bug at go/tiktok-bug.");
            C46839an anVar = apVar.f122265a;
            apVar.f122265a = anVar.mo50848e((C46844as) anVar.mo50846c().mo56107c());
            e.mo55395g(new C46825a((C46852f) amVar.f122257a.mo55367b().get(apVar), (C46844as) apVar.f122265a.mo50847d().mo56107c()));
        }
        amVar.f122261e.clear();
        C58485gu f = e.mo55394f();
        int i = ((C58724pq) f).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C46837al alVar = (C46837al) f.get(i2);
            try {
                C46838am.m83441b(alVar.mo50830a(), alVar.mo50831b());
            } catch (Throwable th) {
                amVar.f122258b.execute(C47810es.m84977q(new C46829ad(th)));
            }
        }
    }
}
