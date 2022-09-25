package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.accounts.Account;
import android.os.SystemClock;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84836c;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.recently.p8682e.C116075c;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.p4102au.p4103a.p4104a.p4105a.C54568f;
import com.google.p4184bj.p4211e.p4212a.p4213a.C56025b;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.o */
/* compiled from: PG */
public final /* synthetic */ class C116116o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116100aa f322010a;

    public /* synthetic */ C116116o(C116100aa aaVar) {
        this.f322010a = aaVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116100aa aaVar = this.f322010a;
        C22831b bVar = (C22831b) obj;
        C22831b bVar2 = aaVar.f321937h.f321861a;
        if (bVar2 == null || !bVar2.equals(bVar)) {
            C116075c cVar = aaVar.f321937h;
            if (bVar != null && !bVar.equals(cVar.f321861a)) {
                cVar.f321861a = bVar;
                cVar.mo102460e();
            }
        }
        System.currentTimeMillis();
        if (aaVar.f321935f.mo79746e(C90110fh.f250675be)) {
            aaVar.mo102495l();
            Account a = aaVar.f321941l.mo79668a();
            if (a != null) {
                String str = a.name;
                C84836c cVar2 = aaVar.f321940k;
                C62940bt btVar = C54568f.f143267c;
                long a2 = aaVar.f321935f.mo79743a(C90110fh.f250672bb);
                aaVar.f321947r = cVar2.mo78521b(1, btVar, (int) a2, C116100aa.f321930b, new C116107f(aaVar.f321939j, str, aaVar.f321936g, new C116122u(aaVar, str)));
                C84836c cVar3 = aaVar.f321940k;
                C62940bt btVar2 = C56025b.f149199c;
                long a3 = aaVar.f321935f.mo79743a(C90110fh.f250672bb);
                aaVar.f321946q = cVar3.mo78521b(194, btVar2, (int) a3, C116100aa.f321930b, new C116111j(aaVar.f321939j, str, aaVar.f321936g, new C116123v(aaVar, str)));
            }
        }
        aaVar.f321945p.mo102475a(bVar.f62862a.size(), SystemClock.uptimeMillis() - aaVar.f321948s);
    }
}
