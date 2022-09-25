package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.common.p4522b.C58485gu;
import com.google.protos.youtube.elements.C66192df;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.u */
/* compiled from: PG */
public final /* synthetic */ class C40056u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40058w f105240a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f105241b;

    public /* synthetic */ C40056u(C40058w wVar, C58485gu guVar) {
        this.f105240a = wVar;
        this.f105241b = guVar;
    }

    public final void run() {
        C40058w wVar = this.f105240a;
        C58485gu guVar = this.f105241b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C40058w.m69566e((C66192df) guVar.get(i));
        }
        wVar.mo42159g(new C40049n(wVar, guVar));
    }
}
