package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21530c;
import com.google.android.libraries.gcoreclient.p1788q.p1789a.p1790a.C21611d;
import com.google.android.libraries.gcoreclient.p1792r.p1793a.C21629a;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21746c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.k */
/* compiled from: PG */
public final class C109815k {

    /* renamed from: a */
    private final Context f306027a;

    /* renamed from: b */
    private final C83893b f306028b;

    /* renamed from: c */
    private final C21746c f306029c;

    /* renamed from: d */
    private final C21611d f306030d;

    public C109815k(Context context, C21746c cVar, C21611d dVar, C83893b bVar) {
        this.f306027a = context;
        this.f306029c = cVar;
        this.f306028b = bVar;
        this.f306030d = dVar;
    }

    /* renamed from: a */
    public final C21529b mo98170a() {
        C21530c cVar = new C21530c(this.f306027a);
        cVar.mo26980a(this.f306029c);
        cVar.mo26980a(this.f306030d);
        cVar.mo26980a(new C21629a());
        cVar.f59930a.f389935a = (Account) this.f306028b.mo77278a().mo56107c();
        return cVar.mo26989h();
    }
}
