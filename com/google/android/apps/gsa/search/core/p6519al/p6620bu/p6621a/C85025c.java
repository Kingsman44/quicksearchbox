package com.google.android.apps.gsa.search.core.p6519al.p6620bu.p6621a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bu.a.c */
/* compiled from: PG */
public final class C85025c extends C86731k {

    /* renamed from: c */
    private final ClientEventData f230695c;

    public C85025c(ClientEventData clientEventData) {
        super("optin", "optin::finishOptIn", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230695c = clientEventData;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85022a) obj).mo78658c(this.f230695c);
        return C118826c.f331423b;
    }
}
