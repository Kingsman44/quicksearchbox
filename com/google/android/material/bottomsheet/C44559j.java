package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.material.bottomsheet.j */
/* compiled from: PG */
final class C44559j implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ C44565p f115945a;

    public C44559j(C44565p pVar) {
        this.f115945a = pVar;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C44565p pVar = this.f115945a;
        C44564o oVar = pVar.f115962s;
        if (oVar != null) {
            pVar.f115957n.f115869L.remove(oVar);
        }
        C44565p pVar2 = this.f115945a;
        pVar2.f115962s = new C44564o(pVar2.f115958o, cpVar);
        C44565p pVar3 = this.f115945a;
        pVar3.f115962s.mo47539c(pVar3.getWindow());
        C44565p pVar4 = this.f115945a;
        pVar4.f115957n.mo47506D(pVar4.f115962s);
        return cpVar;
    }
}
