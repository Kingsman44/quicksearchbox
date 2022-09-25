package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.state.gm */
/* compiled from: PG */
final class C87090gm implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C87091gn f235309a;

    /* renamed from: b */
    private final Query f235310b;

    public C87090gm(C87091gn gnVar, Query query) {
        this.f235309a = gnVar;
        this.f235310b = query;
    }

    public final void run() {
        if (((C87052fn) this.f235309a.f235312b.mo27525b()).f235177m.mo84383cP(this.f235310b) && ((C86893co) this.f235309a.f235311a.mo27525b()).f234656d == null && !((C87055fq) this.f235309a.f235313c.mo27525b()).mo80721a()) {
            C90452a aVar = new C90452a(211, C89885b.INTERNAL_ERROR_SEARCH_RESULT_CANNOT_COMPLETE_VALUE);
            ((C87052fn) this.f235309a.f235312b.mo27525b()).mo80714s(this.f235310b, new SearchError(this.f235310b, (String) null, aVar));
            C89886e b = ((C89911f) this.f235309a.f235315e.mo27525b()).mo83756b(aVar);
            b.mo83725d(this.f235310b.f252749G);
            b.mo83721a();
        }
    }
}
