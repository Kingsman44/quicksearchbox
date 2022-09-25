package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87756ck;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.k */
/* compiled from: PG */
public final class C84793k extends C86731k {

    /* renamed from: c */
    private final ActionData f230462c;

    /* renamed from: d */
    private final C87756ck f230463d;

    /* renamed from: e */
    private final C87456t f230464e;

    /* renamed from: f */
    private final Query f230465f;

    public C84793k(ActionData actionData, C87756ck ckVar, C87456t tVar, Query query) {
        super("actions", "actions::handleContactSelection", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230462c = actionData;
        this.f230463d = ckVar;
        this.f230464e = tVar;
        this.f230465f = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78490i(this.f230462c, this.f230463d, this.f230464e, this.f230465f);
    }
}
