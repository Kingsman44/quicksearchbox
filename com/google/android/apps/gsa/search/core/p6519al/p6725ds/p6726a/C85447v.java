package com.google.android.apps.gsa.search.core.p6519al.p6725ds.p6726a;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ds.a.v */
/* compiled from: PG */
public final class C85447v extends C86731k {

    /* renamed from: c */
    private final C85452b f231262c;

    /* renamed from: d */
    private final Query f231263d;

    /* renamed from: e */
    private final C87504b f231264e;

    /* renamed from: f */
    private final C86231bn f231265f;

    /* renamed from: g */
    private final C86230bm f231266g;

    /* renamed from: h */
    private final C58833ax f231267h;

    /* renamed from: i */
    private final Bundle f231268i;

    public C85447v(C85452b bVar, Query query, C87504b bVar2, C86231bn bnVar, C86230bm bmVar, C58833ax axVar, Bundle bundle) {
        super("webview", "webview::showSearchResultForConfig", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_TEXT, C86724d.SEARCH_VOICE);
        this.f231262c = bVar;
        this.f231263d = query;
        this.f231264e = bVar2;
        this.f231265f = bnVar;
        this.f231266g = bmVar;
        this.f231267h = axVar;
        this.f231268i = bundle;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85454d) obj).mo78963e(this.f231262c, this.f231263d, this.f231264e, this.f231265f, this.f231266g, this.f231267h, this.f231268i);
    }
}
