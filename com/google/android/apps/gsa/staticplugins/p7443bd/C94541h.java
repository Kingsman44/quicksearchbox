package com.google.android.apps.gsa.staticplugins.p7443bd;

import com.google.android.apps.gsa.shared.p6968aa.C89011ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gcoreclient.p1772j.p1773a.C21565a;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bd.h */
/* compiled from: PG */
public final class C94541h implements C89011ai {

    /* renamed from: a */
    public final C90931ca f264428a;

    /* renamed from: b */
    public final C68214a f264429b;

    /* renamed from: c */
    public final C69464a f264430c;

    /* renamed from: d */
    public C94540g f264431d;

    /* renamed from: e */
    public C21565a f264432e;

    public C94541h(C90931ca caVar, C68214a aVar, C69464a aVar2) {
        this.f264428a = caVar;
        this.f264429b = aVar;
        this.f264430c = aVar2;
    }

    /* renamed from: b */
    public static String m155919b(C21565a aVar, String str) {
        return aVar.f59954a.mo119658a(C58495hd.m89900n("hallmonitor-challenge-binding-key", str));
    }

    /* renamed from: a */
    public final synchronized C60870cx mo82983a(String str) {
        C21565a aVar = this.f264432e;
        if (aVar != null) {
            return C60856cj.m92900i(m155919b(aVar, str));
        }
        C94540g gVar = this.f264431d;
        if (gVar == null) {
            gVar = new C94540g(this);
            this.f264431d = gVar;
        }
        if (gVar.f264425a == null) {
            gVar.f264425a = gVar.f264427c.f264428a.mo85138c(gVar);
        }
        return C60846c.m92878g(C60922j.m93044g(C60856cj.m92901j(gVar.f264425a), new C94536c(str), C60826bg.f164896a), Exception.class, new C94535b(this), C60826bg.f164896a);
    }
}
