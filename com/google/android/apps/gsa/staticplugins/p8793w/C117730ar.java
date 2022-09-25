package com.google.android.apps.gsa.staticplugins.p8793w;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.ar */
/* compiled from: PG */
public final class C117730ar {

    /* renamed from: a */
    public static final C59071e f326786a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.ar");

    /* renamed from: b */
    public final C68214a f326787b;

    /* renamed from: c */
    private final C22871g f326788c;

    /* renamed from: d */
    private final C68214a f326789d;

    public C117730ar(C22871g gVar, C68214a aVar, C68214a aVar2) {
        this.f326788c = gVar;
        this.f326789d = aVar;
        this.f326787b = aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo103443a(Query query) {
        if (TextUtils.isEmpty(query.f252768g)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C87673aa) this.f326787b.mo27525b()).mo81931b(query);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f326788c.mo28211k(((C89037bh) this.f326789d.mo27525b()).mo27378c(), "SearchServiceQueryCommitter: got connectivity info", new C117729aq(this, query));
    }
}
