package com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.p3616e.p3623f.C46355c;
import com.google.apps.tiktok.tracing.contrib.p3706g.C47675j;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.myaccount.k */
/* compiled from: PG */
public final class C133356k {

    /* renamed from: a */
    public static final C59071e f363370a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.myaccount.k");

    /* renamed from: b */
    public final Fragment f363371b;

    /* renamed from: c */
    public final C46355c f363372c;

    /* renamed from: d */
    public final C30306o f363373d;

    /* renamed from: e */
    public final C47675j f363374e;

    public C133356k(Fragment fragment, C46355c cVar, C30306o oVar, C47675j jVar) {
        this.f363371b = fragment;
        this.f363372c = cVar;
        this.f363373d = oVar;
        this.f363374e = jVar;
    }

    /* renamed from: a */
    public final void mo111093a() {
        C46108a aVar = (C46108a) C30281j.m56319c(this.f363373d.f81934a.f81883d);
        aVar.getClass();
        String str = aVar.mo50210b().f121161f;
        if (this.f363371b.getActivity() != null) {
            C47709i.m84862b(this.f363371b, new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 547).putExtra("extra.screen.myactivityProduct", "search").putExtra("extra.screen.myactivityUtmSource", "agsa").putExtra("extra.screen.myactivityUtmCampaign", "particle").putExtra("extra.accountName", str), 0);
            return;
        }
        C47709i.m84861a(this.f363371b, new Intent(this.f363371b.requireContext(), MyAccountActivity.class).putExtra("extra.screenId", 547).putExtra("extra.screen.myactivityProduct", "search").putExtra("extra.screen.myactivityUtmSource", "agsa").putExtra("extra.screen.myactivityUtmCampaign", "particle").putExtra("extra.accountName", str));
    }
}
