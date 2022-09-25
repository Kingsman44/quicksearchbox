package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c;

import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.c.h */
/* compiled from: PG */
public final /* synthetic */ class C107757h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107759j f299826a;

    /* renamed from: b */
    public final /* synthetic */ C86251f f299827b;

    /* renamed from: c */
    public final /* synthetic */ Query f299828c;

    public /* synthetic */ C107757h(C107759j jVar, C86251f fVar, Query query) {
        this.f299826a = jVar;
        this.f299827b = fVar;
        this.f299828c = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107759j jVar = this.f299826a;
        C86251f fVar = this.f299827b;
        Query query = this.f299828c;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C86253h hVar = C86253h.CONVERSATION_DELTA;
            int ordinal = ((C86253h) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                new C90873ag(fVar.f233143b, jVar.f299831b, "wait for AssistantResponse", new C107753d(jVar)).mo85223a(C107754e.f299822a);
            } else if (ordinal == 1) {
                new C90873ag(fVar.f233143b, jVar.f299831b, "wait for AssistantResponse", new C107751b(jVar, query)).mo85223a(C107752c.f299820a);
            } else if (ordinal == 2) {
                new C90873ag(fVar.f233143b, jVar.f299831b, "wait for LegacyAssistantResponse", new C107755f(jVar, query)).mo85223a(C107756g.f299825a);
            }
        }
    }
}
