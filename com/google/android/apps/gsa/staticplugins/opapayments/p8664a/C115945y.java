package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.accounts.Account;
import android.view.View;
import com.google.p4129b.p4130a.p4131a.p4132a.C54690bg;
import com.google.p4129b.p4130a.p4131a.p4132a.C54691bh;
import com.google.p4129b.p4130a.p4131a.p4132a.C54702bs;
import com.google.p4129b.p4130a.p4131a.p4132a.C54703bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.y */
/* compiled from: PG */
public final /* synthetic */ class C115945y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115914ab f321501a;

    public /* synthetic */ C115945y(C115914ab abVar) {
        this.f321501a = abVar;
    }

    public final void onClick(View view) {
        C115914ab abVar = this.f321501a;
        C54690bg bgVar = (C54690bg) C54691bh.f143555c.createBuilder();
        C54702bs i = abVar.mo102319i();
        i.copyOnWrite();
        C54703bt btVar = C54703bt.f143586c;
        ((C54703bt) i.instance).f143588a = 1;
        bgVar.copyOnWrite();
        C54691bh bhVar = (C54691bh) bgVar.instance;
        C54703bt btVar2 = (C54703bt) i.build();
        btVar2.getClass();
        bhVar.f143558b = btVar2;
        bhVar.f143557a = 2;
        abVar.f321380c = (C54691bh) bgVar.build();
        abVar.f321408o.b(((Account) abVar.f321409p.mo77278a().mo56107c()).name, true != abVar.f321401h ? "PASSWORD" : "FINGERPRINT");
        abVar.mo77318iT().mo77312a();
    }
}
