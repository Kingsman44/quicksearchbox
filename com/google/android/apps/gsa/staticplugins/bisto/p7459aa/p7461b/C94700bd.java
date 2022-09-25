package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86254i;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bd */
/* compiled from: PG */
public final class C94700bd extends C68247h {

    /* renamed from: a */
    private final C68283d f264835a;

    public C94700bd(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C94700bd.class), aVar);
        this.f264835a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C86232bo boVar = (C86232bo) obj;
        if (boVar instanceof C86254i) {
            return ((C86254i) boVar).mo79952d();
        }
        C59104x c = C94692aw.f264811a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
        ((C59052c) ((C59052c) c).mo56372aa(16850)).mo56386p("searchResult is not AssistantSearchResult; unable to get response type");
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f264835a.mo60297gq();
    }
}
