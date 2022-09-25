package com.google.android.apps.gsa.staticplugins.opapayments.p8664a.p8665a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.a.c */
/* compiled from: PG */
public final class C115908c extends C68247h {

    /* renamed from: a */
    private final C68283d f321388a;

    /* renamed from: c */
    private final C68283d f321389c;

    public C115908c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C115908c.class), aVar);
        this.f321388a = C68236af.m98549d(dVar);
        this.f321389c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C86124t tVar = (C86124t) list.get(0);
        C86054o oVar = (C86054o) list.get(1);
        Account a = oVar.mo79668a();
        if (a != null) {
            return oVar.mo79671e(tVar.mo79758x(C90014bt.f247500iN), a, new C91032p());
        }
        C59104x c = C115907b.f321387a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpaPaymentsSvMd");
        ((C59052c) ((C59052c) c).mo56372aa(30168)).mo56386p("Account name is not available");
        throw new IllegalArgumentException("Account name is not available");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f321388a.mo60297gq(), this.f321389c.mo60297gq());
    }
}
