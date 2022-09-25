package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7294j.C92431a;
import com.google.android.apps.gsa.speech.p7294j.C92434d;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.ah */
/* compiled from: PG */
final class C100579ah implements C92431a {

    /* renamed from: a */
    final /* synthetic */ Query f281208a;

    /* renamed from: b */
    final /* synthetic */ C85422c f281209b;

    /* renamed from: c */
    final /* synthetic */ C100585an f281210c;

    public C100579ah(C100585an anVar, Query query, C85422c cVar) {
        this.f281210c = anVar;
        this.f281208a = query;
        this.f281209b = cVar;
    }

    /* renamed from: a */
    public final void mo87095a(C90528t tVar) {
    }

    /* renamed from: b */
    public final void mo87096b() {
    }

    /* renamed from: s */
    public final void mo87113s() {
        C92434d dVar;
        C100585an anVar = this.f281210c;
        Query query = this.f281208a;
        C85422c cVar = this.f281209b;
        if (!"and.opa.untrained.hotword".equals(query.mo84355bn()) || query.f252787z != null) {
            dVar = new C100628y(anVar, query, cVar);
        } else {
            dVar = C100627x.f281390a;
        }
        dVar.mo87113s();
    }
}
