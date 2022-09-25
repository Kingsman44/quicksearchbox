package com.google.android.apps.gsa.search.core.p6519al.p6664cp.p6665a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6664cp.C85168a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107892be;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cp.a.a */
/* compiled from: PG */
public final class C85169a extends C86731k {

    /* renamed from: c */
    private final Query f230915c;

    /* renamed from: d */
    private final C107892be f230916d;

    public C85169a(Query query, C107892be beVar) {
        super("screensearch", "screensearch::handleScreenSearchQuery", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230915c = query;
        this.f230916d = beVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85168a) obj).mo78758e(this.f230915c, this.f230916d);
        return C118826c.f331423b;
    }
}
