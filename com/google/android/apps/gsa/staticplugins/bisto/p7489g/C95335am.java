package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.am */
/* compiled from: PG */
public final /* synthetic */ class C95335am implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95345aw f266725a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f266726b;

    /* renamed from: c */
    public final /* synthetic */ C95353bd f266727c;

    /* renamed from: d */
    public final /* synthetic */ C95352bc f266728d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f266729e;

    public /* synthetic */ C95335am(C95345aw awVar, C60870cx cxVar, C95353bd bdVar, C95352bc bcVar, C60870cx cxVar2) {
        this.f266725a = awVar;
        this.f266726b = cxVar;
        this.f266727c = bdVar;
        this.f266728d = bcVar;
        this.f266729e = cxVar2;
    }

    public final void run() {
        C95345aw awVar = this.f266725a;
        C60870cx cxVar = this.f266726b;
        C95353bd bdVar = this.f266727c;
        C95352bc bcVar = this.f266728d;
        C60870cx cxVar2 = this.f266729e;
        if (!cxVar.isDone()) {
            cxVar.cancel(false);
        }
        awVar.mo89276q(bdVar);
        awVar.mo89275p(bcVar);
        awVar.f266758l.remove(cxVar2);
    }
}
