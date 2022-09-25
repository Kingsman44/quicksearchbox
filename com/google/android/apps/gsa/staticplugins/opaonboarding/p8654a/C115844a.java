package com.google.android.apps.gsa.staticplugins.opaonboarding.p8654a;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.C83818a;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.a.a */
/* compiled from: PG */
public final class C115844a implements C83893b {

    /* renamed from: a */
    private final C83893b f321249a;

    public C115844a(C83818a aVar, C86054o oVar, C69464a aVar2, C69464a aVar3) {
        if (aVar.mo77201a() == 1) {
            C83893b bVar = (C83893b) aVar3.mo17428b();
            this.f321249a = bVar;
            String b = aVar.mo77202b();
            Account w = oVar.mo79689w(b);
            C58838bb.m90867b(w, "AccountMode is FIXED, but no account found for name %s", b);
            bVar.mo77279b(w);
        } else if (aVar.mo77201a() == 2) {
            C83893b bVar2 = (C83893b) aVar3.mo17428b();
            this.f321249a = bVar2;
            String b2 = aVar.mo77202b();
            Account w2 = oVar.mo79689w(b2);
            C58838bb.m90867b(w2, "AccountMode is IMPERSONATED, but no account found for name %s", b2);
            bVar2.mo77279b(w2);
            String c = aVar.mo77203c();
            C58838bb.m90866a(c, "AccountMode is IMPERSONATED, but the impersonated account ID is not defined");
            bVar2.mo77280c(c);
        } else {
            this.f321249a = (C83893b) aVar2.mo17428b();
        }
    }

    /* renamed from: a */
    public final C58833ax mo77278a() {
        return this.f321249a.mo77278a();
    }

    /* renamed from: b */
    public final void mo77279b(Account account) {
        this.f321249a.mo77279b(account);
    }

    /* renamed from: c */
    public final void mo77280c(String str) {
        this.f321249a.mo77280c(str);
    }

    /* renamed from: d */
    public final boolean mo77281d() {
        return this.f321249a.mo77281d();
    }
}
