package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7144t.C90615f;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1743a.p1744a.C21417a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1745b.p1746a.C21419a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1745b.p1746a.C21421c;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21424b;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21425c;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21431i;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21437o;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1748d.p1749a.C21439a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1748d.p1749a.C21441c;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21443a;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21444b;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21446d;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.af */
/* compiled from: PG */
public final class C115918af extends C90615f {

    /* renamed from: a */
    public static final C59071e f321420a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opapayments.a.af");

    /* renamed from: b */
    public final C83893b f321421b;

    /* renamed from: c */
    public final C21419a f321422c;

    /* renamed from: d */
    public final C21424b f321423d;

    /* renamed from: e */
    public final C21437o f321424e;

    /* renamed from: f */
    public final C21425c f321425f;

    /* renamed from: g */
    public final C21421c f321426g;

    /* renamed from: h */
    public final C21417a f321427h;

    /* renamed from: p */
    public final C21439a f321428p;

    /* renamed from: q */
    public final C21441c f321429q;

    /* renamed from: r */
    public final C21431i f321430r;

    /* renamed from: s */
    private final C90021c f321431s;

    /* renamed from: t */
    private final C21443a f321432t;

    /* renamed from: u */
    private final C21446d f321433u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115918af(C83893b bVar, C90021c cVar, Context context, C21419a aVar, C21424b bVar2, C21417a aVar2, C21443a aVar3, C21437o oVar, C21446d dVar, C21431i iVar, C21425c cVar2, C21421c cVar3, C21439a aVar4, C21441c cVar4, C69464a aVar5, C22871g gVar) {
        super("OPAWalletClient", context, gVar, 30000, aVar5);
        C58976aa aaVar = C58975e.f156826a;
        this.f321421b = bVar;
        this.f321431s = cVar;
        this.f321422c = aVar;
        this.f321423d = bVar2;
        this.f321432t = aVar3;
        this.f321424e = oVar;
        this.f321433u = dVar;
        this.f321425f = cVar2;
        this.f321426g = cVar3;
        this.f321430r = iVar;
        this.f321427h = aVar2;
        this.f321428p = aVar4;
        this.f321429q = cVar4;
    }

    /* renamed from: a */
    public final int mo85543a() {
        if (!this.f321431s.mo79746e(C90014bt.f247581jp)) {
            return 1;
        }
        C58976aa aaVar = C58975e.f156826a;
        return 0;
    }

    /* renamed from: b */
    public final long mo102329b(Intent intent) {
        return intent.getLongExtra("com.google.android.gms.wallet.f1InstrumentId", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84763c(C21547d dVar) {
        C21444b bVar = this.f321432t.f59898a;
        C21446d dVar2 = this.f321433u;
        dVar2.f59899a.mo122980a(mo85543a());
        dVar.mo26981b(bVar, dVar2.mo26937a());
        Account account = (Account) this.f321421b.mo77278a().mo56107c();
        if (account != null) {
            dVar.mo26984e(account);
        }
    }
}
