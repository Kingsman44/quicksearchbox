package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.searchbox.p6943b.C88537a;
import com.google.android.apps.gsa.searchbox.p6943b.C88538b;
import com.google.android.apps.gsa.searchbox.p6943b.C88539c;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bl */
/* compiled from: PG */
public final /* synthetic */ class C108094bl implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f300680a;

    public /* synthetic */ C108094bl(C109040fj fjVar) {
        this.f300680a = fjVar;
    }

    public final void run() {
        C109040fj fjVar = this.f300680a;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328824d = 1;
        agVar.f328821a |= 4;
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        C62940bt btVar = C88539c.f239298a;
        C88537a aVar = (C88537a) C88538b.f239291f.createBuilder();
        aVar.copyOnWrite();
        C88538b bVar = (C88538b) aVar.instance;
        bVar.f239295c = 2;
        bVar.f239293a = 2 | bVar.f239293a;
        ajVar.mo58885m(btVar, (C88538b) aVar.build());
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        C118476ak akVar = (C118476ak) ajVar.build();
        akVar.getClass();
        agVar2.f328827g = akVar;
        agVar2.f328821a |= 32;
        fjVar.f303246aF.mo103754e(C118522by.REFRESH_SEARCH_HISTORY, (C118472ag) afVar.build());
    }
}
