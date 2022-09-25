package com.google.android.libraries.mdi.download.p2243e;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2230c.C28780o;
import com.google.android.libraries.mdi.download.p2230c.C28781p;
import com.google.android.libraries.mdi.download.p2230c.C28782q;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.e.n */
/* compiled from: PG */
public final /* synthetic */ class C29364n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29348ab f79593a;

    /* renamed from: b */
    public final /* synthetic */ C29359i f79594b;

    public /* synthetic */ C29364n(C29348ab abVar, C29359i iVar) {
        this.f79593a = abVar;
        this.f79594b = iVar;
    }

    public final C60870cx apply(Object obj) {
        C29348ab abVar = this.f79593a;
        C29359i iVar = this.f79594b;
        Void voidR = (Void) obj;
        C28780o g = C28781p.m53690g();
        g.mo34393f(iVar.mo34671c());
        g.mo34391d(iVar.mo34672d());
        g.mo34395h(iVar.mo34679i());
        g.mo34392e(iVar.mo34676g());
        g.mo34394g(iVar.mo34670b());
        try {
            return ((C28782q) abVar.f79557e.mo6453a()).mo34371b(g.mo34409i());
        } catch (RuntimeException e) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.UNKNOWN_ERROR;
            bnVar.f78064c = e;
            return C60856cj.m92899h(bnVar.mo34334a());
        }
    }
}
