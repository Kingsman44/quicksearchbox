package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.be */
/* compiled from: PG */
public final /* synthetic */ class C30734be implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30738bi f82962a;

    /* renamed from: b */
    public final /* synthetic */ C30305n f82963b;

    /* renamed from: c */
    public final /* synthetic */ C30778v f82964c;

    public /* synthetic */ C30734be(C30738bi biVar, C30305n nVar, C30778v vVar) {
        this.f82962a = biVar;
        this.f82963b = nVar;
        this.f82964c = vVar;
    }

    public final void onClick(View view) {
        C30738bi biVar = this.f82962a;
        C30305n nVar = this.f82963b;
        C30778v vVar = this.f82964c;
        ((C30313v) nVar.mo35866q().mo56107c()).mo35878a(false);
        C30860b m = nVar.mo35862m();
        C63643a aVar = (C63643a) biVar.f82968a.toBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172122b = 7;
        bVar.f172121a |= 1;
        m.mo35876b((C63644b) aVar.build());
        ((C30730ba) vVar).f82954a.mo36435b();
    }
}
