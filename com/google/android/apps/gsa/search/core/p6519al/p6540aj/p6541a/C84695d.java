package com.google.android.apps.gsa.search.core.p6519al.p6540aj.p6541a;

import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.aj.a.d */
/* compiled from: PG */
public final class C84695d extends C86731k {

    /* renamed from: c */
    private final Query f230332c;

    public C84695d(Query query) {
        super("externalquery", "externalquery::handleIntentCorpus", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_TEXT);
        this.f230332c = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84691a) obj).mo78421a(this.f230332c);
    }
}
