package com.google.android.libraries.onegoogle.accountmenu;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.l */
/* compiled from: PG */
public final /* synthetic */ class C30785l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30788o f83082a;

    /* renamed from: b */
    public final /* synthetic */ C30306o f83083b;

    /* renamed from: c */
    public final /* synthetic */ AccountMenu f83084c;

    public /* synthetic */ C30785l(C30788o oVar, C30306o oVar2, AccountMenu accountMenu) {
        this.f83082a = oVar;
        this.f83083b = oVar2;
        this.f83084c = accountMenu;
    }

    public final void onClick(View view) {
        C30788o oVar = this.f83082a;
        C30306o oVar2 = this.f83083b;
        AccountMenu accountMenu = this.f83084c;
        if (oVar2.f81934a.mo35794b().isEmpty()) {
            oVar.f83089b.mo35855e().mo35819c().mo17832a(view, C30281j.m56319c(oVar2.f81934a.f81883d));
        } else {
            accountMenu.mo35798k(oVar.f83090c.getId());
        }
    }
}
