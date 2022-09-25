package com.google.android.apps.gsa.search.core.state;

import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.gsa.search.core.state.ib */
/* compiled from: PG */
public final /* synthetic */ class C87134ib implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C87140ih f235422a;

    public /* synthetic */ C87134ib(C87140ih ihVar) {
        this.f235422a = ihVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C87140ih ihVar = this.f235422a;
        C58506ho hoVar = new C58506ho();
        C58485gu guVar = ihVar.f235433c;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C87141ii iiVar = (C87141ii) guVar.get(i2);
            String[] hp = iiVar.mo80593hp();
            if (hp != null) {
                for (String j : hp) {
                    hoVar.mo55456j(j, iiVar);
                }
            }
        }
        return hoVar.mo55453g();
    }
}
