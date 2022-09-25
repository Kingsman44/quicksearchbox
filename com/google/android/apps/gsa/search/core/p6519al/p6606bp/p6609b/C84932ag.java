package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6609b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.b.ag */
/* compiled from: PG */
public final class C84932ag extends C86731k {

    /* renamed from: c */
    private final C51195j f230604c;

    /* renamed from: d */
    private final Query f230605d;

    public C84932ag(C51195j jVar, Query query) {
        super("opa", "opa::onNewAssistantResponse", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230604c = jVar;
        this.f230605d = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85005h) obj).mo78641z(this.f230604c, this.f230605d);
        return C118826c.f331423b;
    }
}
