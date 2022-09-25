package com.google.android.libraries.onegoogle.accountmenu.p2352b;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.b.i */
/* compiled from: PG */
public final /* synthetic */ class C30327i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30305n f82010a;

    /* renamed from: b */
    public final /* synthetic */ C63644b f82011b;

    /* renamed from: c */
    public final /* synthetic */ C30313v f82012c;

    public /* synthetic */ C30327i(C30305n nVar, C63644b bVar, C30313v vVar) {
        this.f82010a = nVar;
        this.f82011b = bVar;
        this.f82012c = vVar;
    }

    public final void onClick(View view) {
        C30305n nVar = this.f82010a;
        C63644b bVar = this.f82011b;
        C30313v vVar = this.f82012c;
        C30860b m = nVar.mo35862m();
        C63643a aVar = (C63643a) bVar.toBuilder();
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172122b = 6;
        bVar2.f172121a |= 1;
        m.mo35876b((C63644b) aVar.build());
        vVar.mo35878a(true);
    }
}
