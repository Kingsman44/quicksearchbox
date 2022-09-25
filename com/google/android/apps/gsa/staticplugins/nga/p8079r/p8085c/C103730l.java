package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.l */
/* compiled from: PG */
public final class C103730l implements C103651a {

    /* renamed from: a */
    public static final long f288877a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    public final C86054o f288878b;

    /* renamed from: c */
    private final C22871g f288879c;

    public C103730l(C22871g gVar, C86054o oVar) {
        this.f288879c = gVar;
        this.f288878b = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        return this.f288879c.mo28201a("[NGA] AuthTokenHandler.handleRequest", new C103729k(this, bnVar));
    }
}
