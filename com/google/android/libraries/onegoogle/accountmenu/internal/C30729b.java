package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.p2380c.C30898c;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.b */
/* compiled from: PG */
public final /* synthetic */ class C30729b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30772p f82953a;

    public /* synthetic */ C30729b(C30772p pVar) {
        this.f82953a = pVar;
    }

    public final void onClick(View view) {
        C30772p pVar = this.f82953a;
        C30898c cVar = pVar.f83049e;
        C63643a aVar = (C63643a) pVar.f83050f.toBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172122b = 6;
        bVar.f172121a |= 1;
        cVar.mo35876b((C63644b) aVar.build());
        ((C30313v) pVar.f83045a.mo56107c()).mo35878a(true);
        ((C30713ak) pVar.f83046b).f82924a.mo36414d();
    }
}
