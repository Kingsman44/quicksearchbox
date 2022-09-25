package com.google.android.apps.gsa.search.core.p6519al.p6584be.p6585a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6584be.C84824a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.be.a.b */
/* compiled from: PG */
public final class C84826b extends C86731k {

    /* renamed from: c */
    private final ServiceEventData f230512c;

    public C84826b(ServiceEventData serviceEventData) {
        super("logo_header", "logo_header::sendServiceEventToActiveClient", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_TEXT);
        this.f230512c = serviceEventData;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84824a) obj).mo78513a(this.f230512c);
        return C118826c.f331423b;
    }
}
