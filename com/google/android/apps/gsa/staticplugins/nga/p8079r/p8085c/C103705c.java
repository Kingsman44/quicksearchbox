package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.shared.p7038f.p7039a.C89737an;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3825an.p3830c.p3831a.C49333j;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.c */
/* compiled from: PG */
public final class C103705c implements C103651a {

    /* renamed from: a */
    private final C68214a f288829a;

    /* renamed from: b */
    private final C22871g f288830b;

    public C103705c(C68214a aVar, C22871g gVar) {
        this.f288829a = aVar;
        this.f288830b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C49333j jVar;
        C22871g gVar = this.f288830b;
        C89737an anVar = (C89737an) this.f288829a.mo27525b();
        if (bnVar.f219917a == 21) {
            jVar = (C49333j) bnVar.f219918b;
        } else {
            jVar = C49333j.f127504f;
        }
        return gVar.mo28205e(gVar.mo28209i(anVar.mo83617a(jVar), "[NGA] AppActions : Handle OneOff icing search request", C103650a.f288729a), "[NGA] AppActions : Catch failure in icing search", Exception.class, C103678b.f288777a);
    }
}
