package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.search.core.p6816p.C86254i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.aa */
/* compiled from: PG */
public final class C117913aa extends C68247h {

    /* renamed from: a */
    private final C68283d f327278a;

    public C117913aa(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C117913aa.class), aVar);
        this.f327278a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (axVar.mo56107c() instanceof C86254i) {
            return ((C86254i) axVar.mo56107c()).mo79949a();
        }
        throw new IllegalStateException("SearchResult is not an instance of AssistantSearchResult");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f327278a.mo60297gq();
    }
}