package com.google.android.libraries.accountlinking.activity;

import com.google.android.libraries.accountlinking.p10979b.C147412p;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.p3562ao.p3563a.p3568d.C45579q;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;

/* renamed from: com.google.android.libraries.accountlinking.activity.m */
/* compiled from: PG */
final class C147385m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f397844a;

    /* renamed from: b */
    final /* synthetic */ C147388p f397845b;

    public C147385m(C147388p pVar, String str) {
        this.f397845b = pVar;
        this.f397844a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C147388p pVar = this.f397845b;
        C147412p pVar2 = pVar.f397859h;
        C147395w wVar = pVar.f397854c;
        C60856cj.m92911t(pVar2.mo124155a(wVar.f397895d, wVar.f397893b, wVar.f397899h, wVar.f397904m), new C147386n(pVar, th), C60826bg.f164896a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C45579q qVar = (C45579q) obj;
        this.f397845b.f397858g.mo5706i(false);
        this.f397845b.mo124148f(C65881e.STATE_COMPLETE);
        this.f397845b.mo124150h(C147381i.m240295b(this.f397844a));
    }
}
