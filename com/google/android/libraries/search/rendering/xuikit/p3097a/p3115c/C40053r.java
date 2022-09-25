package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.protos.youtube.elements.C66192df;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.r */
/* compiled from: PG */
public final /* synthetic */ class C40053r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40058w f105231a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f105232b;

    /* renamed from: c */
    public final /* synthetic */ int f105233c;

    public /* synthetic */ C40053r(C40058w wVar, int i, C58485gu guVar) {
        this.f105231a = wVar;
        this.f105233c = i;
        this.f105232b = guVar;
    }

    public final void run() {
        C40058w wVar = this.f105231a;
        int i = this.f105233c;
        C58485gu guVar = this.f105232b;
        if (i == 2) {
            int i2 = ((C58724pq) guVar).f156474d;
            for (int i3 = 0; i3 < i2; i3++) {
                C40058w.m69566e((C66192df) guVar.get(i3));
            }
            wVar.mo42159g(new C40050o(wVar, guVar));
        }
    }
}
