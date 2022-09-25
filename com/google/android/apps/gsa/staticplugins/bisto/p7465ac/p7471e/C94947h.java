package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95005w;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.h */
/* compiled from: PG */
public final class C94947h {

    /* renamed from: a */
    public static final C59071e f265596a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.e.h");

    /* renamed from: b */
    public final C22871g f265597b;

    /* renamed from: c */
    public final C95007y f265598c;

    /* renamed from: d */
    public final C95005w f265599d;

    /* renamed from: e */
    private final C90926bw f265600e = new C90926bw((Object) null);

    public C94947h(C22871g gVar, C95005w wVar, C95007y yVar) {
        this.f265598c = yVar;
        this.f265597b = gVar;
        this.f265599d = wVar;
    }

    /* renamed from: a */
    public final void mo88855a(String str, C124548d dVar, C48090bx bxVar) {
        C59104x b = f265596a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TextInputHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17666)).mo56389s("onIssueQuery:  textQuery: %s", str);
        C90875ai.m148465b(C94945f.f265594a, this.f265600e.mo85235a(new C94944e(this, new C94943d(this, str, dVar, bxVar))), this.f265597b, "v2-text-query").mo85223a(C94946g.f265595a);
    }
}
