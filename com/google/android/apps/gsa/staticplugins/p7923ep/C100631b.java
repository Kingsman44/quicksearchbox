package com.google.android.apps.gsa.staticplugins.p7923ep;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7144t.C90615f;
import com.google.android.apps.gsa.shared.p7144t.p7145a.C90610a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21425c;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21431i;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21443a;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21444b;
import com.google.android.libraries.gcoreclient.p1741ab.p1750b.C21446d;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ep.b */
/* compiled from: PG */
final class C100631b extends C90615f implements C90610a {

    /* renamed from: a */
    public static final C59071e f281399a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ep.b");

    /* renamed from: b */
    final C58247c f281400b;

    /* renamed from: c */
    public final C21425c f281401c;

    /* renamed from: d */
    public final C21431i f281402d;

    /* renamed from: e */
    private final Account f281403e;

    /* renamed from: f */
    private final C90021c f281404f;

    /* renamed from: g */
    private final C21443a f281405g;

    /* renamed from: h */
    private final C21446d f281406h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100631b(Account account, C90021c cVar, Context context, C21431i iVar, C21425c cVar2, C69464a aVar, C21443a aVar2, C21446d dVar, C22871g gVar) {
        super("WalletApiClientWrapper", context, gVar, 30000, aVar);
        C58254i iVar2 = new C58254i();
        iVar2.mo54823g(1);
        iVar2.mo54822f(10, TimeUnit.MINUTES);
        this.f281400b = iVar2.mo54817a();
        this.f281403e = account;
        this.f281404f = cVar;
        this.f281402d = iVar;
        this.f281401c = cVar2;
        this.f281405g = aVar2;
        this.f281406h = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo85543a() {
        C58976aa aaVar = C58975e.f156826a;
        byte[] bArr = (byte[]) ((C58206am) this.f281400b).f155647a.mo54792f(1);
        if (bArr != null) {
            return C60856cj.m92900i(bArr);
        }
        return mo84765i(new C100630a(this), "getClientToken");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84763c(C21547d dVar) {
        int i;
        dVar.mo26984e(this.f281403e);
        C21444b bVar = this.f281405g.f59898a;
        C21446d dVar2 = this.f281406h;
        if (this.f281404f.mo79746e(C90014bt.f247581jp)) {
            C58976aa aaVar = C58975e.f156826a;
            i = 0;
        } else {
            i = 1;
        }
        dVar2.f59899a.mo122980a(i);
        dVar.mo26981b(bVar, dVar2.mo26937a());
    }
}
