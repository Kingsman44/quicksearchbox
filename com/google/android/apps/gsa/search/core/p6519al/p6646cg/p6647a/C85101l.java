package com.google.android.apps.gsa.search.core.p6519al.p6646cg.p6647a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98635r;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cg.a.l */
/* compiled from: PG */
public final class C85101l extends C86731k {

    /* renamed from: c */
    private final String f230777c;

    /* renamed from: d */
    private final int f230778d;

    /* renamed from: e */
    private final C98635r f230779e;

    public C85101l(String str, C98635r rVar, int i) {
        super("recently", "recently::saveWebpageNavigationInfo", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230777c = str;
        this.f230779e = rVar;
        this.f230778d = i;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85089a) obj).mo78712q(this.f230777c, this.f230779e, this.f230778d);
        return C118826c.f331423b;
    }
}
