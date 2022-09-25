package com.google.android.apps.gsa.search.core.p6519al.p6725ds.p6726a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ds.a.p */
/* compiled from: PG */
public final class C85441p extends C86731k {

    /* renamed from: c */
    private final C85452b f231253c;

    /* renamed from: d */
    private final Query f231254d;

    public C85441p(C85452b bVar, Query query) {
        super("webview", "webview::reloadQueryFromWebView", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231253c = bVar;
        this.f231254d = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85454d) obj).mo78976s(this.f231253c, this.f231254d);
        return C118826c.f331423b;
    }
}
