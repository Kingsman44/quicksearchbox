package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.n */
/* compiled from: PG */
public final /* synthetic */ class C110216n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110217o f307118a;

    public /* synthetic */ C110216n(C110217o oVar) {
        this.f307118a = oVar;
    }

    public final void onClick(View view) {
        C110217o oVar = this.f307118a;
        C58833ax a = oVar.f307120c.mo77278a();
        C73845bq bqVar = (C73845bq) oVar.f307121d.mo6453a();
        if (!(!a.mo56113h() || bqVar == null || bqVar.mo65330d() == null)) {
            String str = ((Account) a.mo56107c()).name;
            String d = bqVar.mo65330d();
            d.getClass();
            ((C110361bt) oVar.f307119b.mo27525b()).mo98590g(str, d, false);
            String str2 = ((Account) a.mo56107c()).name;
            String d2 = bqVar.mo65330d();
            d2.getClass();
            ((C110361bt) oVar.f307119b.mo27525b()).mo98589f(str2, d2, false);
        }
        oVar.mo77318iT().mo77312a();
    }
}
