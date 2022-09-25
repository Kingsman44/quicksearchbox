package com.google.android.apps.gsa.search.core.p6519al.p6646cg.p6647a;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cg.a.p */
/* compiled from: PG */
public final class C85105p extends C86731k {

    /* renamed from: c */
    private final String f230784c;

    /* renamed from: d */
    private final LongSparseArray f230785d;

    /* renamed from: e */
    private final long f230786e;

    public C85105p(String str, LongSparseArray longSparseArray, long j) {
        super("recently", "recently::syncWebpageDeletionsFromFootprintsData", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230784c = str;
        this.f230785d = longSparseArray;
        this.f230786e = j;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85089a) obj).mo78702f(this.f230784c, this.f230785d, this.f230786e);
    }
}
