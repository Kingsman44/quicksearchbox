package com.google.android.apps.gsa.search.core.p6519al.p6634ca.p6635a;

import com.google.android.apps.gsa.search.core.p6519al.p6634ca.C85051a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ca.a.l */
/* compiled from: PG */
public final class C85063l extends C86731k {

    /* renamed from: c */
    private final String f230730c;

    /* renamed from: d */
    private final boolean f230731d;

    public C85063l(String str, boolean z) {
        super("proactive", "proactive::requestNextPage", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230730c = str;
        this.f230731d = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85051a) obj).mo78676f(this.f230730c, this.f230731d);
    }
}
