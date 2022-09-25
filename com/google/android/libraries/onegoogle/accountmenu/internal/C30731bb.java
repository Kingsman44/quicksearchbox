package com.google.android.libraries.onegoogle.accountmenu.internal;

import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bb */
/* compiled from: PG */
public final /* synthetic */ class C30731bb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30733bd f82955a;

    public /* synthetic */ C30731bb(C30733bd bdVar) {
        this.f82955a = bdVar;
    }

    public final void run() {
        C30733bd bdVar = this.f82955a;
        C19559g.m37304c();
        if (!((C30313v) bdVar.f82959c.mo35866q().mo56107c()).f81976b) {
            bdVar.dismiss();
        } else {
            ((C30746bq) bdVar.getDialog()).mo36448j(bdVar.getActivity(), bdVar.f82958b, bdVar.f82957a);
        }
    }
}
