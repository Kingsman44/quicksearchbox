package com.google.android.apps.gsa.staticplugins.p7914ei;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.udc.C87198ab;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.udc.C146067i;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21532b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21530c;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ei.a */
/* compiled from: PG */
public final class C100540a implements C87198ab {

    /* renamed from: a */
    private final C69464a f281101a;

    public C100540a(C69464a aVar) {
        this.f281101a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo80833a(Context context, Account account, C86124t tVar, List list) {
        C21530c cVar = new C21530c(context);
        cVar.mo26980a((C21532b) this.f281101a.mo17428b());
        cVar.f59930a.f389935a = account;
        C21529b h = cVar.mo26989h();
        new C21544l();
        C143851w c = C21544l.m40656c(h);
        C143840l lVar = C146067i.f394787a;
        return new C100541b(c, tVar, (C56116b[]) list.toArray(new C56116b[0])).mo91961b();
    }
}
