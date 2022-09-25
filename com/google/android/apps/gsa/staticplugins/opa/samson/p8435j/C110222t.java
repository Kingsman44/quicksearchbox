package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.t */
/* compiled from: PG */
public final /* synthetic */ class C110222t implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110224v f307128a;

    public /* synthetic */ C110222t(C110224v vVar) {
        this.f307128a = vVar;
    }

    public final void onClick(View view) {
        C110224v vVar = this.f307128a;
        C58833ax a = vVar.f307133c.mo77278a();
        C73845bq bqVar = (C73845bq) vVar.f307134d.mo6453a();
        if (!(!a.mo56113h() || bqVar == null || bqVar.mo65330d() == null)) {
            String str = ((Account) a.mo56107c()).name;
            String d = bqVar.mo65330d();
            d.getClass();
            ((C110361bt) vVar.f307132b.mo27525b()).mo98589f(str, d, false);
        }
        vVar.mo77318iT().mo77312a();
    }
}
