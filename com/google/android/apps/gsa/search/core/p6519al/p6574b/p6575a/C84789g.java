package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.g */
/* compiled from: PG */
public final class C84789g extends C86731k {

    /* renamed from: c */
    private final CardDecision f230452c;

    /* renamed from: d */
    private final int f230453d;

    /* renamed from: e */
    private final int f230454e;

    /* renamed from: f */
    private final boolean f230455f;

    public C84789g(CardDecision cardDecision, int i, int i2, boolean z) {
        super("actions", "actions::createShowPromptEventData", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230452c = cardDecision;
        this.f230453d = i;
        this.f230454e = i2;
        this.f230455f = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78487f(this.f230452c, this.f230453d, this.f230454e, this.f230455f);
    }
}
