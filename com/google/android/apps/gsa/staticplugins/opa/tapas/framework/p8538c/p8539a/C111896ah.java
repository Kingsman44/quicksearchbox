package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112127m;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17001af;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ah */
/* compiled from: PG */
public final class C111896ah implements C111916j {

    /* renamed from: a */
    public final C86124t f310920a;

    /* renamed from: b */
    private final C22871g f310921b;

    /* renamed from: c */
    private final C68214a f310922c;

    public C111896ah(C22871g gVar, C68214a aVar, C86124t tVar) {
        this.f310921b = gVar;
        this.f310922c = aVar;
        this.f310920a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo99293a() {
        C112127m mVar = (C112127m) this.f310922c.mo27525b();
        C17001af afVar = mVar.f311364i;
        return this.f310921b.mo28209i(mVar.mo99408i("prefetching_ngram"), "Build prefix map using data from MDD", new C111895ag(this));
    }
}
