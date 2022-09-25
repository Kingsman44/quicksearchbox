package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6739j.C85501a;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import dagger.p5295b.C68283d;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.d */
/* compiled from: PG */
final class C117645d implements C85501a {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f326559a;

    /* renamed from: b */
    final /* synthetic */ C68283d f326560b;

    /* renamed from: c */
    final /* synthetic */ C117634ae f326561c;

    public C117645d(SettableFuture settableFuture, C68283d dVar, C117634ae aeVar) {
        this.f326559a = settableFuture;
        this.f326560b = dVar;
        this.f326561c = aeVar;
    }

    /* renamed from: a */
    public final void mo79021a(Query query, SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        this.f326559a.mo57358p(this.f326560b.mo60297gq());
    }

    /* renamed from: b */
    public final void mo79022b(Query query, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f326561c.f326538i = boVar;
        this.f326559a.mo57356n(C118826c.f331422a);
    }

    /* renamed from: c */
    public final void mo79023c(Query query, C90606n nVar) {
    }

    /* renamed from: d */
    public final void mo79024d(Query query) {
        this.f326559a.mo57356n(C118826c.f331422a);
    }
}
