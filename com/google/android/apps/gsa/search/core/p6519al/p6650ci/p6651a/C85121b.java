package com.google.android.apps.gsa.search.core.p6519al.p6650ci.p6651a;

import com.google.android.apps.gsa.search.core.p6519al.p6650ci.C85125e;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ci.a.b */
/* compiled from: PG */
public final class C85121b extends C86731k {

    /* renamed from: c */
    private final String f230843c;

    /* renamed from: d */
    private final long f230844d;

    /* renamed from: e */
    private final int f230845e;

    /* renamed from: f */
    private final int f230846f;

    public C85121b(int i, int i2, String str, long j) {
        super("refreshzeroprefixsuggestions", "refreshzeroprefixsuggestions::refreshZeroPrefixSuggestionsZeroDelay", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230846f = i;
        this.f230845e = i2;
        this.f230843c = str;
        this.f230844d = j;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85125e) obj).mo78723a(this.f230846f, this.f230845e, this.f230843c, this.f230844d);
    }
}
