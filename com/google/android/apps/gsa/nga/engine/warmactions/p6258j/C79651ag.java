package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.ag */
/* compiled from: PG */
public final /* synthetic */ class C79651ag implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C79672ba f218471a;

    /* renamed from: b */
    public final /* synthetic */ C79690bs f218472b;

    public /* synthetic */ C79651ag(C79672ba baVar, C79690bs bsVar) {
        this.f218471a = baVar;
        this.f218472b = bsVar;
    }

    public final Object apply(Object obj) {
        C79672ba baVar = this.f218471a;
        C79690bs bsVar = this.f218472b;
        Boolean bool = (Boolean) obj;
        baVar.f218500g.set(bool.booleanValue());
        if (baVar.f218499f.mo85405j(C90126fx.f251455jD)) {
            baVar.mo74185n(bsVar);
        } else {
            baVar.f218497d.mo28211k(baVar.f218497d.mo28210j(baVar.mo74185n(bsVar), "[NGA][WA] stopSodaCapture", new C79652ah(baVar)), "[NGA][WA] stopSodaCapture.callback", new C79669ay(baVar));
        }
        return bool;
    }
}
