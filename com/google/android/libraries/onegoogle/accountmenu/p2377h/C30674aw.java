package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.aw */
/* compiled from: PG */
public final /* synthetic */ class C30674aw implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30305n f82811a;

    /* renamed from: b */
    public final /* synthetic */ C63644b f82812b;

    public /* synthetic */ C30674aw(C30305n nVar, C63644b bVar) {
        this.f82811a = nVar;
        this.f82812b = bVar;
    }

    public final void onClick(View view) {
        C30305n nVar = this.f82811a;
        C63644b bVar = this.f82812b;
        C30860b m = nVar.mo35862m();
        C63643a aVar = (C63643a) bVar.toBuilder();
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172122b = 10;
        bVar2.f172121a |= 1;
        m.mo35875a((Object) null, (C63644b) aVar.build());
        nVar.mo35855e().mo35819c().mo17832a(view, (Object) null);
    }
}
