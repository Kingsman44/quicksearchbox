package com.google.android.apps.gsa.search.core.p6519al.p6618bt.p6619a;

import com.google.android.apps.gsa.search.core.p6519al.p6618bt.C85017a;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bt.a.d */
/* compiled from: PG */
public final class C85021d extends C86731k {

    /* renamed from: c */
    private final long f230689c;

    /* renamed from: d */
    private final C86232bo f230690d;

    /* renamed from: e */
    private final Query f230691e;

    public C85021d(long j, C86232bo boVar, Query query) {
        super("opawebview", "opawebview::showSearchResult", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230689c = j;
        this.f230690d = boVar;
        this.f230691e = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85017a) obj).mo78653a(this.f230689c, this.f230690d, this.f230691e);
    }
}
