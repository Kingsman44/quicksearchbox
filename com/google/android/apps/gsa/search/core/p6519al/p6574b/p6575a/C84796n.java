package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87424l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.n */
/* compiled from: PG */
public final class C84796n extends C86731k {

    /* renamed from: c */
    private final ActionData f230472c;

    /* renamed from: d */
    private final C87424l f230473d;

    /* renamed from: e */
    private final Query f230474e;

    public C84796n(ActionData actionData, C87424l lVar, Query query) {
        super("actions", "actions::logExecution", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230472c = actionData;
        this.f230473d = lVar;
        this.f230474e = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78501u(this.f230472c, this.f230473d, this.f230474e);
        return C118826c.f331423b;
    }
}
