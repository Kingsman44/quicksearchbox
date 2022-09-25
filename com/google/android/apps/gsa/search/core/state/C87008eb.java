package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.state.eb */
/* compiled from: PG */
public final /* synthetic */ class C87008eb implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87023eq f234991a;

    /* renamed from: b */
    public final /* synthetic */ Query f234992b;

    /* renamed from: c */
    public final /* synthetic */ C90606n f234993c;

    public /* synthetic */ C87008eb(C87023eq eqVar, Query query, C90606n nVar) {
        this.f234991a = eqVar;
        this.f234992b = query;
        this.f234993c = nVar;
    }

    public final void run() {
        C87023eq eqVar = this.f234991a;
        Query query = this.f234992b;
        C63088z b = this.f234993c.mo84646b();
        eqVar.f235027H = 3;
        ((TtsState) eqVar.f235039d.mo27525b()).mo80410j(query, b);
    }
}
