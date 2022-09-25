package com.google.android.apps.gsa.staticplugins.opa.p8312ax;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.p6816p.C86255j;
import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86567m;
import com.google.android.apps.gsa.search.core.p6820r.p6832d.C86413b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ax.a */
/* compiled from: PG */
public final class C107625a extends C86413b {

    /* renamed from: a */
    private static final C59071e f299398a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ax.a");

    /* renamed from: b */
    private final C86255j f299399b;

    /* renamed from: c */
    private final C86237bt f299400c;

    public C107625a(C22871g gVar, C86255j jVar, C86237bt btVar) {
        super(gVar);
        this.f299399b = jVar;
        this.f299400c = btVar;
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "AssistantSearchResultCacheFetcher";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C86497j mo80171e(Query query) {
        C58833ax b = this.f299399b.mo79954b(query.f252752J);
        if (!b.mo56113h() || ((C86232bo) b.mo56107c()).mo79880P() || ((C86232bo) b.mo56107c()).mo79882R()) {
            C59104x d = f299398a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AssistResultCacheFetch");
            ((C59052c) ((C59052c) d).mo56372aa(26007)).mo56386p("Can't fetch the assistant search result.");
            return new C86567m(C60856cj.m92900i(C58836b.f156633a));
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f299400c.mo79904a((C86232bo) b.mo56107c());
        return new C86567m(C60856cj.m92900i(b));
    }
}
