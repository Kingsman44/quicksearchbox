package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.m */
/* compiled from: PG */
public final /* synthetic */ class C110215m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110217o f307117a;

    public /* synthetic */ C110215m(C110217o oVar) {
        this.f307117a = oVar;
    }

    public final void onClick(View view) {
        C110217o oVar = this.f307117a;
        C58833ax a = oVar.f307120c.mo77278a();
        C73845bq bqVar = (C73845bq) oVar.f307121d.mo6453a();
        if (!(!a.mo56113h() || bqVar == null || bqVar.mo65330d() == null)) {
            String str = ((Account) a.mo56107c()).name;
            String d = bqVar.mo65330d();
            d.getClass();
            if (((C110361bt) oVar.f307119b.mo27525b()).mo98593j(str, d)) {
                String str2 = ((Account) a.mo56107c()).name;
                String d2 = bqVar.mo65330d();
                d2.getClass();
                ((SharedPreferences) ((C110361bt) oVar.f307119b.mo27525b()).f307591a.mo27525b()).edit().remove(C110361bt.m183757d(str2, d2)).apply();
            }
        }
        oVar.mo77318iT().mo77312a();
    }
}
