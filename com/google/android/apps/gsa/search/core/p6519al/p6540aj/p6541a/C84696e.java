package com.google.android.apps.gsa.search.core.p6519al.p6540aj.p6541a;

import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.aj.a.e */
/* compiled from: PG */
public final class C84696e extends C86731k {

    /* renamed from: c */
    private final Query f230333c;

    /* renamed from: d */
    private final C58833ax f230334d;

    /* renamed from: e */
    private final C58833ax f230335e;

    public C84696e(Query query, C58833ax axVar, C58833ax axVar2) {
        super("externalquery", "externalquery::handleUrlInQueryString", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_TEXT);
        this.f230333c = query;
        this.f230334d = axVar;
        this.f230335e = axVar2;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84691a) obj).mo78422b(this.f230333c, this.f230334d, this.f230335e);
    }
}
