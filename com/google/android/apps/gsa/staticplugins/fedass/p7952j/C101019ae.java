package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.ae */
/* compiled from: PG */
public final class C101019ae implements C86051l {

    /* renamed from: a */
    public static final C59071e f282123a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.j.ae");

    /* renamed from: b */
    public final C69464a f282124b;

    /* renamed from: c */
    public final C69464a f282125c;

    /* renamed from: d */
    public final C69464a f282126d;

    /* renamed from: e */
    public final C69464a f282127e;

    /* renamed from: f */
    private final Executor f282128f;

    public C101019ae(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C60887da daVar) {
        this.f282124b = aVar;
        this.f282125c = aVar2;
        this.f282126d = aVar3;
        this.f282127e = aVar4;
        this.f282128f = new C60904dr(daVar);
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        C59104x b = f282123a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedAssAccountListener");
        ((C59052c) ((C59052c) b).mo56372aa(19739)).mo56386p("onSignedInAccountChanged()");
        C100742h.m166944c(C60856cj.m92905n(new C101017ac(this, account), this.f282128f)).mo92038i(C101018ad.f282122a);
    }

    /* renamed from: iR */
    public final void mo79704iR(Account[] accountArr) {
        C80905at.m128764h("FedAssAccountListener", C60856cj.m92905n(new C101016ab(this, accountArr), this.f282128f), "Failed to update account status on account change.", new Object[0]);
    }
}
