package com.google.android.apps.gsa.staticplugins.chime.p7661f;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.f.b */
/* compiled from: PG */
public final class C97710b extends C86052m {

    /* renamed from: a */
    private final C118561t f272827a;

    public C97710b(C118561t tVar) {
        this.f272827a = tVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        this.f272827a.mo103752c(C118522by.CHIME_REGISTRATION);
        C118561t tVar = this.f272827a;
        C118522by byVar = C118522by.CHIME_REGISTRATION;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = 5000;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = 900000;
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        C62940bt btVar = C97714d.f272832d;
        C97713c cVar = (C97713c) C97714d.f272831c.createBuilder();
        cVar.copyOnWrite();
        C97714d dVar = (C97714d) cVar.instance;
        dVar.f272834a |= 1;
        dVar.f272835b = true;
        ajVar.mo58885m(btVar, (C97714d) cVar.build());
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        C118476ak akVar = (C118476ak) ajVar.build();
        akVar.getClass();
        agVar3.f328827g = akVar;
        agVar3.f328821a |= 32;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
    }
}
