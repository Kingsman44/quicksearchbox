package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85453c;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86377b;
import com.google.android.apps.gsa.search.shared.actions.errors.WebSearchConnectionError;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58881cr;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.de */
/* compiled from: PG */
public final /* synthetic */ class C118198de implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C68282c f328134a;

    /* renamed from: b */
    public final /* synthetic */ C58881cr f328135b;

    /* renamed from: c */
    public final /* synthetic */ Query f328136c;

    /* renamed from: d */
    public final /* synthetic */ C86377b f328137d;

    public /* synthetic */ C118198de(C68282c cVar, C58881cr crVar, Query query, C86377b bVar) {
        this.f328134a = cVar;
        this.f328135b = crVar;
        this.f328136c = query;
        this.f328137d = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C68282c cVar = this.f328134a;
        C58881cr crVar = this.f328135b;
        Query query = this.f328136c;
        C86377b bVar = this.f328137d;
        Throwable th = (Throwable) C57940c.m88575b(cVar).mo56111f();
        C89911f fVar = (C89911f) crVar.mo6453a();
        if (th instanceof C85453c) {
            C85453c cVar2 = (C85453c) th;
            if (query.f252749G == cVar2.f231278a) {
                bVar.mo80153e(new WebSearchConnectionError(query, cVar2.f231279b));
            }
            throw cVar2;
        } else if (th instanceof CancellationException) {
            fVar.mo83755a((Throwable) null, 16838851, 29).mo83721a();
            C90457d dVar = new C90457d(th, (int) C89885b.WEBVIEW_LOAD_URL_PREEMPTED_VALUE);
            C89886e b = fVar.mo83756b(dVar);
            b.mo83725d(query.f252749G);
            b.mo83721a();
            throw dVar;
        } else if (!(th instanceof Exception) || !(th instanceof C90456c)) {
            C90452a aVar = new C90452a(th, 211, C89885b.WEBVIEW_UNEXPECTED_EXCEPTION_VALUE);
            C118202di.m196328a(fVar, aVar, query, bVar);
            throw aVar;
        } else {
            C118202di.m196328a(fVar, (C90456c) th, query, bVar);
            throw ((Exception) th);
        }
    }
}
