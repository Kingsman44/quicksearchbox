package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.accounts.Account;
import android.view.View;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.k */
/* compiled from: PG */
public final /* synthetic */ class C110073k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110075m f306678a;

    public /* synthetic */ C110073k(C110075m mVar) {
        this.f306678a = mVar;
    }

    public final void onClick(View view) {
        C110075m mVar = this.f306678a;
        C58833ax a = mVar.f306682d.mo77278a();
        if (a.mo56113h()) {
            mVar.f306681c.mo98630a(((Account) a.mo56107c()).name, true);
            mVar.f306681c.mo98637h(((Account) a.mo56107c()).name);
            if (mVar.f306684f.getVisibility() == 0) {
                mVar.f306681c.mo98631b(((Account) a.mo56107c()).name, mVar.f306684f.isChecked());
            }
        }
        mVar.mo77318iT().mo77312a();
    }
}
