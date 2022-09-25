package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bj */
/* compiled from: PG */
public final /* synthetic */ class C30739bj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MyAccountChip f82971a;

    /* renamed from: b */
    public final /* synthetic */ C30305n f82972b;

    /* renamed from: c */
    public final /* synthetic */ C63644b f82973c;

    public /* synthetic */ C30739bj(MyAccountChip myAccountChip, C30305n nVar, C63644b bVar) {
        this.f82971a = myAccountChip;
        this.f82972b = nVar;
        this.f82973c = bVar;
    }

    public final void onClick(View view) {
        MyAccountChip myAccountChip = this.f82971a;
        C30305n nVar = this.f82972b;
        C63644b bVar = this.f82973c;
        nVar.mo35864o().mo35826f(C28442l.m53142h(), view);
        Object c = C30281j.m56319c(nVar.mo35858i().f81934a.f81883d);
        C63643a aVar = (C63643a) bVar.toBuilder();
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172122b = 9;
        bVar2.f172121a |= 1;
        int i = myAccountChip.f82887b;
        if (i != 1) {
            aVar.copyOnWrite();
            C63644b bVar3 = (C63644b) aVar.instance;
            int i2 = i - 1;
            if (i != 0) {
                bVar3.f172123c = i2;
                bVar3.f172121a |= 2;
            } else {
                throw null;
            }
        }
        nVar.mo35862m().mo35875a(c, (C63644b) aVar.build());
        nVar.mo35855e().mo35818b().mo17832a(view, c);
    }
}
