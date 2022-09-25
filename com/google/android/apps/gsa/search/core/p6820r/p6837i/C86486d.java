package com.google.android.apps.gsa.search.core.p6820r.p6837i;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6820r.C86576v;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.errors.C87415c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58887cx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.C57937b;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.r.i.d */
/* compiled from: PG */
final class C86486d implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C86494l f233721a;

    public C86486d(C86494l lVar) {
        this.f233721a = lVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C86494l lVar = this.f233721a;
        if (lVar.f233739i.mo80163g(lVar.f233735e)) {
            Throwable th2 = (Throwable) C57937b.m88572b(th, ExecutionException.class).mo56109e(th);
            C58887cx.m90979f(th2, Error.class);
            C59104x d = C86494l.f233731a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ForegroundSearchRunner");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th2)).mo56372aa(8199)).mo56386p("Search failed");
            SearchError a = C87415c.m141581a(this.f233721a.f233735e, th2);
            C58485gu guVar = this.f233721a.f233742l;
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                ((C86576v) guVar.get(i)).mo80195a();
            }
            this.f233721a.f233737g.mo80111e(a);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C86494l lVar = this.f233721a;
        if (lVar.f233739i.mo80163g(lVar.f233735e)) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }
}
