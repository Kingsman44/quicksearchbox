package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.net.Uri;
import android.view.MenuItem;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.s */
/* compiled from: PG */
final class C102493s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C102464ah f286066a;

    public C102493s(C102464ah ahVar) {
        this.f286066a = ahVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Uri a = C87562e.m142218a(this.f286066a.f285950c, "now_cards");
        C102464ah ahVar = this.f286066a;
        C90464f a2 = ahVar.f285955h.mo84210a(ahVar.f285949b.f54539k);
        C90461c cVar = new C90461c();
        cVar.f252690b = "now_cards";
        cVar.f252691c = this.f286066a.f285954g.mo79668a();
        cVar.f252692d = a;
        a2.mo84209b(cVar, 0);
        return true;
    }
}
