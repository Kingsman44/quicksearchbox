package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6787f.C85768a;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86567m;
import com.google.android.apps.gsa.search.core.p6820r.p6832d.C86413b;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.apps.gsa.staticplugins.p8025l.C102643m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.cb */
/* compiled from: PG */
public final class C94725cb extends C86413b implements C85768a {

    /* renamed from: b */
    private static final C59071e f264913b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.b.cb");

    /* renamed from: a */
    public final C94785f f264914a;

    /* renamed from: c */
    private final SettableFuture f264915c = new SettableFuture();

    /* renamed from: d */
    private final C22871g f264916d;

    /* renamed from: e */
    private final C102643m f264917e;

    public C94725cb(C22871g gVar, C102643m mVar, C94785f fVar, C22871g gVar2) {
        super(gVar);
        this.f264917e = mVar;
        this.f264914a = fVar;
        this.f264916d = gVar2;
    }

    /* renamed from: a */
    public final void mo79423a(Query query, SearchError searchError) {
        C59104x d = f264913b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoTextSearchFetcher");
        ((C59052c) ((C59052c) d).mo56372aa(16880)).mo56386p("onNetworkLoadError");
        this.f264916d.mo28212l("BistoTextSearchFetcher#handleTextResultErrorTriggered", new C94724ca(this, searchError));
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "BistoTextSearchFetcher";
    }

    /* renamed from: c */
    public final void mo79424c(Query query, C90606n nVar) {
        C59104x b = f264913b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoTextSearchFetcher");
        ((C59052c) ((C59052c) b).mo56372aa(16882)).mo56386p("onNetworkTtsAvailable");
        this.f264916d.mo28212l("BistoTextSearchFetcher#handleTtsResult", new C94722bz(this, nVar));
    }

    /* renamed from: d */
    public final void mo79425d(Query query) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C86497j mo80171e(Query query) {
        C59104x b = f264913b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoTextSearchFetcher");
        ((C59052c) ((C59052c) b).mo56372aa(16879)).mo56386p("fetch");
        this.f264917e.mo93353a(query, this).mo79427a();
        return new C86567m(C90918bo.m148514a(this.f264915c));
    }

    /* renamed from: f */
    public final void mo79426f(Query query, C86232bo boVar) {
        C59104x b = f264913b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoTextSearchFetcher");
        ((C59052c) ((C59052c) b).mo56372aa(16881)).mo56389s("onNetworkSearchResult: %s", boVar);
        this.f264915c.mo57356n(boVar);
    }
}
