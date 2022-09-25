package com.google.android.apps.gsa.search.core.p6519al.p6646cg.p6647a;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cg.a.o */
/* compiled from: PG */
public final class C85104o extends C86731k {

    /* renamed from: c */
    private final String f230781c;

    /* renamed from: d */
    private final LongSparseArray f230782d;

    /* renamed from: e */
    private final long f230783e;

    public C85104o(String str, LongSparseArray longSparseArray, long j) {
        super("recently", "recently::syncQueryDeletionsFromFootprintsData", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230781c = str;
        this.f230782d = longSparseArray;
        this.f230783e = j;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85089a) obj).mo78701e(this.f230781c, this.f230782d, this.f230783e);
    }
}
