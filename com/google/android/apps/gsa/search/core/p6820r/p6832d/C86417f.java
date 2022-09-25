package com.google.android.apps.gsa.search.core.p6820r.p6832d;

import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.core.r.d.f */
/* compiled from: PG */
final class C86417f implements C86569o {

    /* renamed from: a */
    private final SettableFuture f233562a;

    /* renamed from: b */
    private final C86497j f233563b;

    /* renamed from: c */
    private final String f233564c;

    public C86417f(C86569o oVar) {
        SettableFuture settableFuture = new SettableFuture();
        this.f233562a = settableFuture;
        this.f233563b = oVar.mo79838g(settableFuture);
        this.f233564c = oVar.mo79837b();
    }

    /* renamed from: b */
    public final String mo79837b() {
        return this.f233564c;
    }

    /* renamed from: g */
    public final C86497j mo79838g(C60870cx cxVar) {
        if (this.f233562a.mo57358p(cxVar)) {
            return this.f233563b;
        }
        throw new IllegalStateException("PrewarmedSearchFetcher#fetch called multiple times");
    }
}
