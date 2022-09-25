package com.google.android.apps.gsa.staticplugins.p7923ep;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7144t.p7145a.C90610a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21425c;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21431i;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21437o;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21443a;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21445c;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21446d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ep.d */
/* compiled from: PG */
public final class C100633d implements C90610a {

    /* renamed from: a */
    private static final C59071e f281418a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ep.d");

    /* renamed from: b */
    private final C86054o f281419b;

    /* renamed from: c */
    private final C100632c f281420c;

    /* renamed from: d */
    private String f281421d;

    /* renamed from: e */
    private C100631b f281422e;

    public C100633d(C86054o oVar, C100632c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f281419b = oVar;
        this.f281420c = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo84759a() {
        Account a = this.f281419b.mo79668a();
        if (a == null) {
            C59104x c = f281418a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WalletClient");
            ((C59052c) ((C59052c) c).mo56372aa(33732)).mo56386p("Account is null.");
            return C60856cj.m92899h(new Throwable("Account is null"));
        }
        String str = this.f281421d;
        if (str == null || !str.equals(a.name)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f281421d = a.name;
            C100631b bVar = this.f281422e;
            if (bVar != null) {
                bVar.f253304k.sendEmptyMessage(104);
            }
            C100632c cVar = this.f281420c;
            C90021c cVar2 = (C90021c) cVar.f281407a.mo17428b();
            cVar2.getClass();
            Context context = (Context) cVar.f281408b.mo17428b();
            context.getClass();
            C21431i iVar = (C21431i) cVar.f281409c.mo17428b();
            iVar.getClass();
            C21425c cVar3 = (C21425c) cVar.f281410d.mo17428b();
            cVar3.getClass();
            C69464a aVar = cVar.f281411e;
            C21443a aVar2 = (C21443a) cVar.f281412f.mo17428b();
            aVar2.getClass();
            ((C21445c) cVar.f281413g.mo17428b()).getClass();
            ((C21437o) cVar.f281414h.mo17428b()).getClass();
            C21446d dVar = (C21446d) cVar.f281415i.mo17428b();
            dVar.getClass();
            C22871g gVar = (C22871g) cVar.f281416j.mo17428b();
            gVar.getClass();
            ((C90476a) cVar.f281417k.mo17428b()).getClass();
            this.f281422e = new C100631b(a, cVar2, context, iVar, cVar3, aVar, aVar2, dVar, gVar);
        }
        C100631b bVar2 = this.f281422e;
        if (bVar2 != null) {
            return bVar2.mo85543a();
        }
        C59104x c2 = f281418a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "WalletClient");
        ((C59052c) ((C59052c) c2).mo56372aa(33730)).mo56386p("WalletApiClientWrapper is not initialized.");
        return C60856cj.m92899h(new Throwable("WalletApiClientWrapper is not initialized"));
    }
}
