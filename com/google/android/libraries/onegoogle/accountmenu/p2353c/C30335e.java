package com.google.android.libraries.onegoogle.accountmenu.p2353c;

import android.view.View;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.c.e */
/* compiled from: PG */
public final /* synthetic */ class C30335e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30339i f82024a;

    /* renamed from: b */
    public final /* synthetic */ C30332b f82025b;

    public /* synthetic */ C30335e(C30339i iVar, C30332b bVar) {
        this.f82024a = iVar;
        this.f82025b = bVar;
    }

    public final void onClick(View view) {
        C30339i iVar = this.f82024a;
        C30332b bVar = this.f82025b;
        Runnable runnable = iVar.f82033d;
        if (runnable != null) {
            ((C30340j) runnable).f82035a.mo35904a();
        }
        if (((Boolean) iVar.f82034e.mo6453a()).booleanValue()) {
            C19559g.m37304c();
            C31036ak a = bVar.mo35895a();
            a.mo36731d(new C30331a(a));
            bVar.mo35897c(a);
            return;
        }
        bVar.mo35896b();
    }
}
