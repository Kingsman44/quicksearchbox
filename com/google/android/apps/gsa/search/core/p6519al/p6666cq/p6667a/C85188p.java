package com.google.android.apps.gsa.search.core.p6519al.p6666cq.p6667a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cq.a.p */
/* compiled from: PG */
public final class C85188p extends C86731k {

    /* renamed from: c */
    private final Query f230944c;

    /* renamed from: d */
    private final Suggestion f230945d;

    public C85188p(Query query, Suggestion suggestion) {
        super("searchboxroot", "searchboxroot::onSuggestionLongClicked", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230944c = query;
        this.f230945d = suggestion;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85171a) obj).mo78780v(this.f230944c, this.f230945d);
        return C118826c.f331423b;
    }
}
