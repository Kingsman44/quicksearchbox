package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.r */
/* compiled from: PG */
public final class C84800r extends C86731k {

    /* renamed from: c */
    private final C87421i f230486c;

    public C84800r(C87421i iVar) {
        super("actions", "actions::maybeNotifyRemoteActionClient", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230486c = iVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78505y(this.f230486c);
        return C118826c.f331423b;
    }
}
