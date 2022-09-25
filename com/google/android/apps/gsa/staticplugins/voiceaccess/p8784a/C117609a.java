package com.google.android.apps.gsa.staticplugins.voiceaccess.p8784a;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.p6816p.C86248cd;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.a.a */
/* compiled from: PG */
public final class C117609a extends C86413b {

    /* renamed from: a */
    private static final C59071e f326477a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.voiceaccess.a.a");

    /* renamed from: b */
    private final C86248cd f326478b;

    /* renamed from: c */
    private final C86237bt f326479c;

    public C117609a(C22871g gVar, C86248cd cdVar, C86237bt btVar) {
        super(gVar);
        this.f326478b = cdVar;
        this.f326479c = btVar;
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "VoiceAccessSearchResultCacheFetcher";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C86497j mo80171e(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C58833ax a = this.f326478b.mo79944a(query.f252752J);
        if (!a.mo56113h()) {
            C59104x d = f326477a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VASResultCacheFetch");
            ((C59052c) ((C59052c) d).mo56372aa(33578)).mo56386p("Can't fetch the cached search result.");
            return new C86567m(C60856cj.m92900i(C58836b.f156633a));
        }
        this.f326479c.mo79904a((C86232bo) a.mo56107c());
        return new C86567m(C60856cj.m92900i(a));
    }
}
