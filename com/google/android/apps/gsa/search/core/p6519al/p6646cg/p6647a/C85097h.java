package com.google.android.apps.gsa.search.core.p6519al.p6646cg.p6647a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cg.a.h */
/* compiled from: PG */
public final class C85097h extends C86731k {

    /* renamed from: c */
    private final String f230770c;

    public C85097h(String str) {
        super("recently", "recently::removeQueryFromRecentlyHistory", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230770c = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85089a) obj).mo78705i(this.f230770c);
        return C118826c.f331423b;
    }
}
