package com.google.android.libraries.onegoogle.accountmenu.p2353c;

import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.p2377h.C30694t;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.c.b */
/* compiled from: PG */
public final class C30332b {

    /* renamed from: a */
    private final FragmentManager f82017a;

    /* renamed from: b */
    private final C30305n f82018b;

    /* renamed from: c */
    private final C0167am f82019c;

    public C30332b(FragmentManager fragmentManager, C30305n nVar, C0167am amVar) {
        this.f82017a = fragmentManager;
        this.f82018b = nVar;
        this.f82019c = amVar;
        C31036ak d = m56491d(fragmentManager);
        if (d != null) {
            m56492e(d);
        }
    }

    /* renamed from: d */
    private static C31036ak m56491d(FragmentManager fragmentManager) {
        return (C31036ak) fragmentManager.f634a.mo671c(C31036ak.f83597a);
    }

    /* renamed from: e */
    private final void m56492e(C31036ak akVar) {
        C19559g.m37304c();
        C30305n nVar = this.f82018b;
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 1;
        bVar.f172121a |= 2;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172125e = 8;
        bVar2.f172121a |= 32;
        aVar.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar.instance;
        bVar3.f172124d = 3;
        bVar3.f172121a = 8 | bVar3.f172121a;
        new C30694t(nVar, akVar, (C63644b) aVar.build());
    }

    /* renamed from: a */
    public final C31036ak mo35895a() {
        C19559g.m37304c();
        C31036ak d = m56491d(this.f82017a);
        if (d != null) {
            return d;
        }
        C31036ak akVar = new C31036ak();
        Bundle bundle = new Bundle();
        bundle.putBoolean("accountMenuFlavorsStyle", true);
        akVar.setArguments(bundle);
        m56492e(akVar);
        return akVar;
    }

    /* renamed from: b */
    public final void mo35896b() {
        C19559g.m37304c();
        mo35897c(mo35895a());
    }

    /* renamed from: c */
    public final void mo35897c(C31036ak akVar) {
        C19559g.m37304c();
        C0167am amVar = this.f82019c;
        if ((amVar == null || !amVar.isFinishing()) && !akVar.isAdded() && !this.f82017a.mo461ab()) {
            akVar.showNow(this.f82017a, C31036ak.f83597a);
        }
    }
}
