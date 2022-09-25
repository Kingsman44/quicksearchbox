package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.android.apps.gsa.shared.p6973ad.C89085a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Queue;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.ac */
/* compiled from: PG */
public final class C96810ac implements C90991b, C89085a {

    /* renamed from: a */
    public final List f270737a = C58485gu.m89846n("9258");

    /* renamed from: b */
    public final Queue f270738b = new C58425eo(100);

    /* renamed from: c */
    private final C22871g f270739c;

    public C96810ac(C91022f fVar, C22871g gVar) {
        this.f270739c = gVar;
        fVar.mo85301a(this);
    }

    /* renamed from: c */
    private final C60870cx m160415c() {
        return this.f270739c.mo28201a("[GSA] AgsaMddDumper.getPhenotypeConfigsAndClients", new C96864r(this));
    }

    /* renamed from: a */
    public final void mo83057a(String str) {
        C60922j.m93044g(m160415c(), new C96865s(this, str), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo83058b(String str, Throwable th) {
        C60922j.m93044g(m160415c(), new C96872z(this, str, th), C60826bg.f164896a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        synchronized (this.f270738b) {
            str = (String) Collection.EL.stream(this.f270738b).map(C96867u.f270844a).collect(Collectors.joining("\n"));
        }
        fVar.mo85278b("Mdd background tasks information").mo85276a(C90752i.m148229c(str));
    }
}
