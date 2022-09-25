package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116132e;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.y */
/* compiled from: PG */
final class C116126y extends C86052m {

    /* renamed from: a */
    final /* synthetic */ C22871g f322026a;

    /* renamed from: b */
    final /* synthetic */ C116132e f322027b;

    /* renamed from: c */
    final /* synthetic */ C116100aa f322028c;

    public C116126y(C116100aa aaVar, C22871g gVar, C116132e eVar) {
        this.f322028c = aaVar;
        this.f322026a = gVar;
        this.f322027b = eVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        this.f322026a.mo28212l("onSignedInAccountChanged", new C116125x(this, account, this.f322027b));
    }
}
