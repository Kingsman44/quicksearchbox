package com.google.android.apps.gsa.search.core.p6519al.p6666cq.p6667a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cq.a.x */
/* compiled from: PG */
public final class C85196x extends C86731k {

    /* renamed from: c */
    private final ClientConfig f230953c;

    /* renamed from: d */
    private final String f230954d;

    public C85196x(ClientConfig clientConfig, String str) {
        super("searchboxroot", "searchboxroot::updateActiveClientState", C86732l.FIRE_AND_FORGET, C86724d.STARTUP_QSB_TEXT);
        this.f230953c = clientConfig;
        this.f230954d = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85171a) obj).mo78783y(this.f230953c, this.f230954d);
        return C118826c.f331423b;
    }
}
