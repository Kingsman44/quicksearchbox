package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.ae */
/* compiled from: PG */
public final class C84779ae extends C86731k {

    /* renamed from: c */
    private final ServiceEventData f230409c;

    public C84779ae(ServiceEventData serviceEventData) {
        super("actions", "actions::sendServiceEventToActiveClient", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230409c = serviceEventData;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78479G(this.f230409c);
        return C118826c.f331423b;
    }
}
