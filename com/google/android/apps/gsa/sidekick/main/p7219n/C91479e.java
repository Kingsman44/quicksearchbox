package com.google.android.apps.gsa.sidekick.main.p7219n;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.protobuf.C62940bt;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.n.e */
/* compiled from: PG */
public final class C91479e extends C86052m implements C90991b {

    /* renamed from: a */
    public final C68214a f255164a;

    /* renamed from: b */
    public final C68214a f255165b;

    /* renamed from: c */
    public final C68214a f255166c;

    /* renamed from: d */
    private final C22871g f255167d;

    /* renamed from: e */
    private final C90998g f255168e;

    public C91479e(C68214a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar, C90998g gVar2) {
        this.f255164a = aVar;
        this.f255165b = aVar2;
        this.f255166c = aVar3;
        this.f255167d = gVar;
        this.f255168e = gVar2;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NowServicesAccountChangeHandler");
        this.f255168e.mo85271g(fVar, "accountChangeEvents", C91478d.f255163a, false);
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        C90998g gVar = this.f255168e;
        C62940bt btVar = C91476b.f255157d;
        C91475a aVar = (C91475a) C91476b.f255156c.createBuilder();
        String str = (account == null || account.name == null) ? "null" : account.name;
        aVar.copyOnWrite();
        C91476b bVar = (C91476b) aVar.instance;
        str.getClass();
        bVar.f255159a |= 1;
        bVar.f255160b = str;
        gVar.mo85269e("accountChanged", btVar, (C91476b) aVar.build());
        this.f255167d.mo28212l("Now services signed in account changed", new C91477c(this, account));
    }
}
