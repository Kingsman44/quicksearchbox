package com.google.android.apps.gsa.search.core.carassistant.p6784f;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6550ao.p6551a.C84715a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.p453b.p457b.p460b.p462b.C9012l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.f.n */
/* compiled from: PG */
public final class C85726n {

    /* renamed from: a */
    public static final C59071e f231789a = C59071e.m91332i("com.google.android.apps.gsa.search.core.carassistant.f.n");

    /* renamed from: b */
    public static final C58485gu f231790b = C58485gu.m89848p("CONTACT", "REDIAL", "PERSONRELATIONSHIP");

    /* renamed from: c */
    public static final C58528ij f231791c = new C58759qy("SearchMessage");

    /* renamed from: d */
    public final C68214a f231792d;

    /* renamed from: e */
    public final C86124t f231793e;

    /* renamed from: f */
    private final C9684l f231794f;

    /* renamed from: g */
    private final C22871g f231795g;

    /* renamed from: h */
    private final C84715a f231796h;

    public C85726n(C9684l lVar, C84715a aVar, C68214a aVar2, C86124t tVar, C22871g gVar) {
        this.f231794f = lVar;
        this.f231796h = aVar;
        this.f231792d = aVar2;
        this.f231793e = tVar;
        this.f231795g = gVar;
    }

    /* renamed from: a */
    public final boolean mo79374a(String str) {
        ((C59052c) ((C59052c) f231789a.mo56224b()).mo56372aa(7584)).mo56389s("Send destination %s to Gmm Offroad Search API.", str);
        try {
            C60870cx b = this.f231796h.mo78439b(Query.f252741b.mo84268aE(str, false));
            new C90873ag(b, this.f231795g, "Gmm Offroad Search results fetched", C85723k.f231786a).mo85223a(C85724l.f231787a);
            C90476a aVar = C91018d.f254254a;
            C58833ax axVar = (C58833ax) b.get();
            if (!axVar.mo56113h() || !((C9012l) axVar.mo56107c()).f31140b) {
                return false;
            }
            return true;
        } catch (InterruptedException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f231789a.mo56225c()).mo56382g(e)).mo56372aa(7585)).mo56386p("Got exception trying to conduct Gmm Offroad Search");
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo79375b(String str) {
        if (!this.f231793e.mo79746e(C90086ek.f250360bf) || str == null || ((C86054o) this.f231792d.mo27525b()).mo79668a() == null || mo79376c()) {
            return false;
        }
        return mo79374a(str);
    }

    /* renamed from: c */
    public final boolean mo79376c() {
        Account a = ((C86054o) this.f231792d.mo27525b()).mo79668a();
        return a != null && this.f231794f.mo17959h(a);
    }
}
