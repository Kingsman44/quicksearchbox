package com.google.android.apps.gsa.search.core.p6519al.p6666cq.p6667a;

import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88332xt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cq.a.n */
/* compiled from: PG */
public final class C85186n extends C86731k {

    /* renamed from: c */
    private final Query f230938c;

    /* renamed from: d */
    private final Suggestion f230939d;

    /* renamed from: e */
    private final C88332xt f230940e;

    public C85186n(Query query, Suggestion suggestion, C88332xt xtVar) {
        super("searchboxroot", "searchboxroot::onSuggestionActionClicked", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230938c = query;
        this.f230939d = suggestion;
        this.f230940e = xtVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85171a) obj).mo78765f(this.f230938c, this.f230939d, this.f230940e);
    }
}
