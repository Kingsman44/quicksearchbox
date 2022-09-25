package com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30292a;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30295d;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.myaccount.h */
/* compiled from: PG */
public final /* synthetic */ class C133353h implements C30292a {

    /* renamed from: a */
    public final /* synthetic */ C133356k f363368a;

    /* renamed from: b */
    public final /* synthetic */ C30295d f363369b;

    public /* synthetic */ C133353h(C133356k kVar, C30295d dVar) {
        this.f363368a = kVar;
        this.f363369b = dVar;
    }

    /* renamed from: a */
    public final void mo17832a(View view, Object obj) {
        C133356k kVar = this.f363368a;
        C30295d dVar = this.f363369b;
        C46108a aVar = (C46108a) obj;
        if (kVar.f363371b.getActivity() != null) {
            dVar.mo35820a(view, aVar);
            return;
        }
        C58838bb.m90866a(aVar, "showMyAccount called with null account");
        if (!kVar.f363372c.mo35558i(aVar)) {
            ((C59052c) ((C59052c) C133356k.f363370a.mo56224b()).mo56372aa(40034)).mo56386p("openMyAccount called with non-Gaia account");
            return;
        }
        C47709i.m84861a(kVar.f363371b, new Intent(kVar.f363371b.requireContext(), MyAccountActivity.class).putExtra("extra.accountName", aVar.mo50210b().f121161f).putExtra("extra.screenId", 1).putExtra("extra.utmSource", "OG"));
    }
}
