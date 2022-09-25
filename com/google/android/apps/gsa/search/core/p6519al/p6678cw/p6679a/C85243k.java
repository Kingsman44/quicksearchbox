package com.google.android.apps.gsa.search.core.p6519al.p6678cw.p6679a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cw.a.k */
/* compiled from: PG */
public final class C85243k extends C86731k {

    /* renamed from: c */
    private final int f231009c;

    /* renamed from: d */
    private final boolean f231010d;

    public C85243k(int i, boolean z) {
        super("service", "service::stopForegroundNotification", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231009c = i;
        this.f231010d = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85232a) obj).mo78817l(this.f231009c, this.f231010d);
        return C118826c.f331423b;
    }
}
