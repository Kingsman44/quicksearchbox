package com.google.android.libraries.lens.ondevice;

import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24269a;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2031h.C24519o;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.lens.p4701g.C62331d;

/* renamed from: com.google.android.libraries.lens.ondevice.k */
/* compiled from: PG */
public final /* synthetic */ class C24534k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C24823o f67199a;

    /* renamed from: b */
    public final /* synthetic */ C24280f f67200b;

    public /* synthetic */ C24534k(C24823o oVar, C24280f fVar) {
        this.f67199a = oVar;
        this.f67200b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C24823o oVar = this.f67199a;
        C24280f fVar = this.f67200b;
        C24519o oVar2 = oVar.f67850g;
        if (oVar2 == null) {
            oVar.f67846c.mo29943b(C62331d.UNKNOWN, C24805p.CASCADE_RUN_START);
            oVar.f67846c.mo29946e(C62331d.UNKNOWN, C24805p.CASCADE_RUN_ERROR);
            return C60856cj.m92899h(new C24269a());
        }
        oVar.f67846c.mo29944c(oVar2.f67152c.f66855a, oVar2.f67160k, C24805p.CASCADE_RUN_START);
        C24519o oVar3 = oVar.f67850g;
        oVar3.getClass();
        return oVar3.mo29930b(fVar);
    }
}
