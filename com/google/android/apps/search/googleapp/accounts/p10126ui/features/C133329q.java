package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount.C133356k;
import com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount.MyAccountActivity;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.q */
/* compiled from: PG */
public final /* synthetic */ class C133329q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133255c f363308a;

    /* renamed from: b */
    public final /* synthetic */ C133356k f363309b;

    public /* synthetic */ C133329q(C133255c cVar, C133356k kVar) {
        this.f363308a = cVar;
        this.f363309b = kVar;
    }

    public final void onClick(View view) {
        C133255c cVar = this.f363308a;
        C133356k kVar = this.f363309b;
        cVar.mo111050a(149792);
        C46108a aVar = (C46108a) C30281j.m56319c(kVar.f363373d.f81934a.f81883d);
        aVar.getClass();
        String str = aVar.mo50210b().f121161f;
        if (kVar.f363371b.getActivity() != null) {
            C47709i.m84862b(kVar.f363371b, new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 520).putExtra("extra.accountName", str), 0);
            return;
        }
        C47709i.m84861a(kVar.f363371b, new Intent(kVar.f363371b.requireContext(), MyAccountActivity.class).putExtra("extra.screenId", 520).putExtra("extra.accountName", str));
    }
}
