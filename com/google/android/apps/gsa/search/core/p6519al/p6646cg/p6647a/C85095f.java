package com.google.android.apps.gsa.search.core.p6519al.p6646cg.p6647a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cg.a.f */
/* compiled from: PG */
public final class C85095f extends C86731k {

    /* renamed from: c */
    private final long[] f230766c;

    /* renamed from: d */
    private final String f230767d;

    public C85095f(long[] jArr, String str) {
        super("recently", "recently::removeEntries", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230766c = jArr;
        this.f230767d = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85089a) obj).mo78704h(this.f230766c, this.f230767d);
        return C118826c.f331423b;
    }
}
