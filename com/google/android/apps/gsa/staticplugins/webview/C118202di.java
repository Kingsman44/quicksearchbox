package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86377b;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.actions.errors.WebSearchConnectionError;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.di */
/* compiled from: PG */
public final class C118202di {
    /* renamed from: a */
    public static void m196328a(C89911f fVar, C90456c cVar, Query query, C86377b bVar) {
        C22872h.m42744d(C86593a.class);
        C89886e b = fVar.mo83756b(cVar);
        b.mo83725d(query.f252749G);
        b.mo83721a();
        bVar.mo80153e(new WebSearchConnectionError(query, cVar));
    }
}
