package com.google.android.apps.gsa.sidekick.main.p7199b;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.C86140k;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.core.udc.C87204ah;
import com.google.android.apps.gsa.shared.p7144t.C90615f;
import com.google.android.apps.p489g.C9115a;
import com.google.android.apps.p489g.C9122b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gcoreclient.p1788q.p1789a.p1790a.C21611d;
import com.google.android.libraries.gcoreclient.p1788q.p1791b.C21627a;
import com.google.android.libraries.gcoreclient.p1788q.p1791b.C21628b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.f */
/* compiled from: PG */
public final class C91266f extends C90615f {

    /* renamed from: c */
    private static final C59071e f254716c = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.b.f");

    /* renamed from: a */
    public final C86054o f254717a;

    /* renamed from: b */
    public final C21627a f254718b;

    /* renamed from: d */
    private final C86140k f254719d;

    /* renamed from: e */
    private final C86127w f254720e;

    /* renamed from: f */
    private final C87204ah f254721f;

    /* renamed from: g */
    private final C21611d f254722g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91266f(Context context, C22871g gVar, C86054o oVar, C86140k kVar, C86127w wVar, C87204ah ahVar, C69464a aVar, C21627a aVar2, C21611d dVar) {
        super("GmsLocationReporting", context, gVar, 30000, aVar);
        this.f254717a = oVar;
        this.f254720e = wVar;
        this.f254721f = ahVar;
        this.f254718b = aVar2;
        this.f254722g = dVar;
        this.f254719d = kVar;
    }

    /* renamed from: a */
    public final C9122b mo85538a(Account account) {
        if (account == null) {
            return null;
        }
        if (!this.f254721f.mo80840h()) {
            byte[] e = this.f254720e.f232790a.mo79722a().mo80079e("reporting_state_".concat(String.valueOf(account.name)), (byte[]) null);
            if (e == null) {
                this.f254719d.mo79786a(0);
                return null;
            }
            C9115a aVar = (C9115a) C9122b.f31402e.createBuilder();
            try {
                aVar.mergeFrom(e, C62921ba.m95368a());
                return (C9122b) aVar.build();
            } catch (C62974ct e2) {
                C59104x d = f254716c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GmsLocationReporting");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(11510)).mo56386p("Error decoding CachedReportingState");
                return null;
            }
        } else if (!this.f254721f.mo80837e(account, C56116b.LOCATION_REPORTING)) {
            return null;
        } else {
            C9115a aVar2 = (C9115a) C9122b.f31402e.createBuilder();
            boolean g = this.f254721f.mo80839g(account, C56116b.LOCATION_HISTORY);
            aVar2.copyOnWrite();
            C9122b bVar = (C9122b) aVar2.instance;
            bVar.f31404a |= 1;
            bVar.f31405b = g;
            boolean g2 = this.f254721f.mo80839g(account, C56116b.LOCATION_REPORTING);
            aVar2.copyOnWrite();
            C9122b bVar2 = (C9122b) aVar2.instance;
            bVar2.f31404a |= 2;
            bVar2.f31406c = g2;
            boolean f = this.f254721f.mo80838f(account, C56116b.LOCATION_REPORTING);
            aVar2.copyOnWrite();
            C9122b bVar3 = (C9122b) aVar2.instance;
            bVar3.f31404a |= 4;
            bVar3.f31407d = f;
            return (C9122b) aVar2.build();
        }
    }

    /* renamed from: b */
    public final C21628b mo85539b(Account account) {
        return (C21628b) mo84766j(new C91264d(this, account));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84763c(C21547d dVar) {
        dVar.mo26980a(this.f254722g);
    }

    /* renamed from: d */
    public final C21628b mo85540d(C21628b bVar, Account account) {
        if (!bVar.mo26997c().mo27003f()) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        C9115a aVar = (C9115a) C9122b.f31402e.createBuilder();
        boolean d = bVar.mo27025d();
        aVar.copyOnWrite();
        C9122b bVar2 = (C9122b) aVar.instance;
        boolean z = true;
        bVar2.f31404a |= 1;
        bVar2.f31405b = d;
        boolean f = bVar.mo27027f();
        aVar.copyOnWrite();
        C9122b bVar3 = (C9122b) aVar.instance;
        bVar3.f31404a |= 2;
        bVar3.f31406c = f;
        if (!bVar.mo27026e() && !bVar.mo27029g()) {
            z = false;
        }
        aVar.copyOnWrite();
        C9122b bVar4 = (C9122b) aVar.instance;
        bVar4.f31404a |= 4;
        bVar4.f31407d = z;
        C86341u uVar = new C86341u((C86346z) this.f254720e.f232790a.mo79722a());
        uVar.mo80068c("reporting_state_".concat(String.valueOf(account.name)), ((C9122b) aVar.build()).toByteArray());
        uVar.mo80086l(false);
        return bVar;
    }

    /* renamed from: e */
    public final C60870cx mo85541e(Account account) {
        return mo84765i(new C91265e(this, account), "getReportingState");
    }
}
