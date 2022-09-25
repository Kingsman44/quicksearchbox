package com.google.android.apps.gsa.staticplugins.p7773dc;

import com.google.android.apps.gsa.search.core.p6820r.C86570p;
import com.google.android.apps.gsa.search.core.p6820r.C86574t;
import com.google.android.apps.gsa.search.core.p6820r.C86575u;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.g */
/* compiled from: PG */
final class C99364g implements C86575u {

    /* renamed from: a */
    private final SettableFuture f278007a;

    /* renamed from: b */
    private final C86570p f278008b;

    /* renamed from: c */
    private final C86575u f278009c;

    public C99364g(SettableFuture settableFuture, C86570p pVar, C86575u uVar) {
        this.f278007a = settableFuture;
        this.f278008b = pVar;
        this.f278009c = uVar;
    }

    /* renamed from: b */
    public final C86570p mo80194b(Query query) {
        C86574t tVar = (C86574t) this.f278008b;
        if (!C90877ak.m148479m(tVar.f233898b, Throwable.class) && !C90877ak.m148479m(tVar.f233899c, Throwable.class) && !C90877ak.m148479m(tVar.f233900d, Throwable.class) && this.f278007a.mo57356n(query)) {
            return this.f278008b;
        }
        return ((C99365h) this.f278009c).mo91415c(C60856cj.m92900i(query));
    }
}
