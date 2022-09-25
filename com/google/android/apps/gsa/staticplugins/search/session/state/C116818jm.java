package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85453c;
import com.google.android.apps.gsa.search.shared.actions.errors.WebSearchConnectionError;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.jm */
/* compiled from: PG */
public final /* synthetic */ class C116818jm implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116819jn f324138a;

    /* renamed from: b */
    public final /* synthetic */ Query f324139b;

    public /* synthetic */ C116818jm(C116819jn jnVar, Query query) {
        this.f324138a = jnVar;
        this.f324139b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116819jn jnVar = this.f324138a;
        Query query = this.f324139b;
        Exception exc = (Exception) obj;
        C89911f fVar = (C89911f) jnVar.f324171g.mo27525b();
        if (exc instanceof C85453c) {
            C85453c cVar = (C85453c) exc;
            if (query.f252749G == cVar.f231278a) {
                jnVar.mo102963r(query, new WebSearchConnectionError(query, cVar.f231279b));
            }
        } else if (exc instanceof CancellationException) {
            fVar.mo83755a((Throwable) null, 16838851, 29).mo83721a();
            C89886e b = fVar.mo83756b(new C90457d(C89885b.WEBVIEW_LOAD_URL_PREEMPTED_VALUE));
            b.mo83725d(query.f252749G);
            b.mo83721a();
        } else if (exc instanceof C90456c) {
            jnVar.mo102958k(fVar, (C90456c) exc, query);
        } else {
            jnVar.mo102958k(fVar, new C90452a(exc, 211, C89885b.WEBVIEW_UNEXPECTED_EXCEPTION_VALUE), query);
        }
    }
}
