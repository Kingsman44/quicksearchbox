package com.google.android.apps.gsa.search.core.p6519al.p6540aj.p6541a;

import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.aj.a.f */
/* compiled from: PG */
public final class C84697f extends C86731k {

    /* renamed from: c */
    private final Query f230336c;

    public C84697f(Query query) {
        super("externalquery", "externalquery::hasIntentCorpus", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_TEXT);
        this.f230336c = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84691a) obj).mo78423c(this.f230336c);
    }
}
