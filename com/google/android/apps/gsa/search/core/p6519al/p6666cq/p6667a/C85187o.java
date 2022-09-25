package com.google.android.apps.gsa.search.core.p6519al.p6666cq.p6667a;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88335xw;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cq.a.o */
/* compiled from: PG */
public final class C85187o extends C86731k {

    /* renamed from: c */
    private final Query f230941c;

    /* renamed from: d */
    private final Bundle f230942d;

    /* renamed from: e */
    private final C88335xw f230943e;

    public C85187o(Query query, Bundle bundle, C88335xw xwVar) {
        super("searchboxroot", "searchboxroot::onSuggestionClicked", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230941c = query;
        this.f230942d = bundle;
        this.f230943e = xwVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85171a) obj).mo78766g(this.f230941c, this.f230942d, this.f230943e);
    }
}
