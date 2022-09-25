package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.sidekick.main.p7214j.p7215a.C91445b;
import com.google.android.apps.search.googleapp.discover.p10249z.C135314au;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.p4580v.C60950i;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.bk */
/* compiled from: PG */
public final class C135250bk {

    /* renamed from: a */
    public final C135314au f368447a;

    /* renamed from: b */
    public final C135242bc f368448b;

    /* renamed from: c */
    public final C46778cv f368449c;

    /* renamed from: d */
    public final C60950i f368450d;

    /* renamed from: e */
    public final C69585o f368451e;

    public C135250bk(C135314au auVar, C135242bc bcVar, C46778cv cvVar, C60950i iVar, C69585o oVar, C91445b bVar) {
        C69664n.m101061g(auVar, "provider");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(bVar, "discoverEnabledReader");
        this.f368447a = auVar;
        this.f368448b = bcVar;
        this.f368449c = cvVar;
        this.f368450d = iVar;
        this.f368451e = oVar;
        C135247bh bhVar = new C135247bh(cvVar, bVar);
        synchronized (bVar) {
            if (bVar.f255072b.isEmpty()) {
                ((C85651bb) bVar.f255071a.mo27525b()).f231499j.add(bVar);
            }
            bVar.f255072b.add(bhVar);
        }
    }
}
